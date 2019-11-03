package com.classbook.chapter.six2;

public class Magazine extends ReadingMatterImpl {
    String name = "杂志";
    //出版周期
    String date = "15 day";

    @Override
    public void Effect() {
        System.out.println("这是继承了读物类的杂志类");
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }

    public String toString() {
        return "杂志：" +  "价格 = " + price + " , 页数 = " + pagination + " , 出版周期 = " + date;
    }
}
