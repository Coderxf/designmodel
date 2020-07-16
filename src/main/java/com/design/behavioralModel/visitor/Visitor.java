package com.design.behavioralModel.visitor;

/**
 *
 * 访问者模式
 *
 * @author xufeng
 * @create: 2020/7/15
 */
public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager  manager );
}
