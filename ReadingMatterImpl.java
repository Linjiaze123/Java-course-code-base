package com.classbook.chapter.six2;

public class ReadingMatterImpl implements ReadingMatterInte {

    @Override
    public void Effect() {
        System.out.println("可以阅读的！！");
    }

    @Override
    public void FitObject() {
        System.out.println("任何阶段的人都能读书");
    }

    public int getPrice() {
        return price;
    }

    public int getPagination() {
        return pagination;
    }

}
