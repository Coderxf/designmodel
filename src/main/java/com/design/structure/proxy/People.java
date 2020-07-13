package com.design.structure.proxy;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class People implements Buy{

    private String userName;
    private boolean isVip;
    private Double money;

    @Override
    public void buyCar() {
        System.out.println(userName + "是vip 客户，可以直接购买新车！");
    }
}
