package com.design.structure.combination;

import java.util.ArrayList;

public class Folder extends AbstractFiles{

    private ArrayList<AbstractFiles> list = new ArrayList<>();

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFiles af) {
        list.add(af);
        System.out.println("添加成狗");
    }

    @Override
    public void remove(AbstractFiles af) {
        if(list.remove(af)) {
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

    @Override
    public AbstractFiles get(int i) {
        return list.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("对文件夹"+name+"进行杀毒");
        //递归调用
        for(Object o : list) {
            ((AbstractFiles)o).killVirus();
        }
    }
}
