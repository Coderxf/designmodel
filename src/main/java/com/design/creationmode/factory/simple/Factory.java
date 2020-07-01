package com.design.creationmode.factory.simple;

/**
 * 
 * 工厂类
 *
 * @author xufeng
 * @create: 2020/7/1
 */
public class Factory {
    public BaoMa createBM(Integer type) {
        switch (type) {
            case 320:
                return new BM320();
            case 325:
                return new BM325();
            default:
                break;
        }
        return null;
    }
}
