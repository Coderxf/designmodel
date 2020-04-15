package com.design.behavioralModel.strategy;

/**
 *妙计二：求吴国太开绿灯放行
 *
 * @author xf
 * @create: 2020/4/16
 */
public class GivenGreenLight implements Strategy{
    @Override
    public void openKit() {
        System.out.println("求吴国太开个绿灯，放行");
    }
}
