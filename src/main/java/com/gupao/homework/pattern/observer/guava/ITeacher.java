package com.gupao.homework.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author liuyang
 * @date 2019/4/27 12:24
 * @description
 */
public interface ITeacher {
    @Subscribe
    void update(Publisher publisher);
}
