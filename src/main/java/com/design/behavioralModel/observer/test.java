package com.design.behavioralModel.observer;

/**
 * 测试类
 *
 * @author x
 * @create: 2020/4/15
 */
public class test {
    public static void main(String[] args)
    {
        Goods transporter = new Goods();

        Police police = new Police();
        Security security = new Security();
        Thief thief = new Thief();
        transporter.addWatcher(police);
        transporter.addWatcher(thief);
        transporter.addWatcher(security);
        transporter.notifyWatchers();
    }
}
