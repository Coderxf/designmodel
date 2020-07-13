package com.design.structure.bridge;

public class Client {


    public static void main(String[] args) {
        Rank rankA = new RankForA();
        // 步兵
        Infantry infantry = new Infantry(rankA, "xiaoMing");
        infantry.type();

        // 骑兵
        Cavalry cavalry = new Cavalry(rankA, "xiaoWu");
        cavalry.type();

        Rank rankB = new RankForB();
        // 步兵
        Infantry infantry2 = new Infantry(rankB, "xiaoLi");
        infantry2.type();
    }


}
