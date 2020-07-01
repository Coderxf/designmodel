package com.design.creationmode.factory.factorymethod;

import com.design.creationmode.factory.simple.BaoMa;

/**
 *
 * 工厂方法基类
 *
 * @author xufeng
 * @create: 2020/7/1
 */
public interface FactoryInterface {
    /**
     * 功能描述:，创建车

     * @return: com.design.creationmode.factory.simple.BaoMa
     * @author xufeng
     * @date 2020/7/1
     */
    BaoMa create();
}
