package com.gupao.homework.pattern.proxy.dynamicproxy.ly;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author liuyang
 * @date 2019/4/15 20:15
 * @description
 */
public class LYProxy {
    private static final String ln = "\r\n";

    public static Object newProxyInstance(LYClassLoader loader,
                                          Class<?>[] interfaces,
                                          LYInvocationHandler h)
            throws IllegalArgumentException
    {
        try {
            // 1.动态生成源代码
            String source = generateSource(interfaces);
            // 2.Java文件输出到磁盘
            String filePath = LYProxy.class.getResource("").getPath();
            System.out.println("filePath = " + filePath);
            File file = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(file);
            fw.write(source);
            fw.flush();
            fw.close();
            // 3.将生成的Java文件编译为class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();
            // 4.加载编译后的class文件，返回其实例对象
            Class<?> proxyClass = loader.findClass("$Proxy0");
            Constructor<?> constructor = proxyClass.getConstructor(LYInvocationHandler.class);
            return constructor.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSource(Class<?>[] interfaces) {
        // 生成$Proxy0新类
        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupao.homework.pattern.proxy.dynamicproxy.ly;" + ln);
        sb.append("import com.gupao.homework.pattern.proxy.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("LYInvocationHandler h;" + ln);
        sb.append("public $Proxy0(LYInvocationHandler h) {" + ln);
        sb.append("this.h = h;" + ln);
        sb.append("}" + ln);
        for (Method m : interfaces[0].getMethods()) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try {" + ln);
            sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            sb.append("this.h.invoke(this, m, null);" + ln);
            sb.append("} catch(Throwable e) {" + ln);
            sb.append("e.printStackTrace();" + ln);
            sb.append("}" + ln);
            sb.append("}" + ln);
        }
        sb.append("}");
        return sb.toString();
    }
}
