package com.classbook.chapter.six2;

public class Fiction extends ReadingMatterImpl {

    String name = "小说";

    @Override
    public void Effect() {
        super.Effect();
        System.out.println( "小说有很多观看的方法，现在大部分都是用手机" );
    }

    public void ReadingMode(){
        System.out.println("可以通过手机看，也可以看书");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "小说 ：" +  "价格 = " + price + " , 页数 = " + pagination;
    }
}
