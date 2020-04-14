package com.design.behavioralModel.observer;

/**
 * 被观察者抽象接口
 *
 * @author x
 * @create: 2020/4/15
 */
public interface Watched {
    void addWatcher(Watcher watcher);
    void removeWatcher(Watcher watcher);
    void notifyWatchers();
}
