package com.classbook.chapter.six.innerclass;

/**
 * @program: classprogram
 * @Description: 通过外部类创建内部类对象
 * @author: Mr.Cheng
 * @date: 2019/10/28 1:44 下午
 */
public class Test {
    public static void main(String[] args)  {

        /** 第一种方式：**/
        Outter outter = new Outter();
        /** 必须通过Outter对象来创建 **/
        Outter.Inner inner = outter.new Inner();

        /** 第二种方式： **/
        Outter.Inner inner1 = outter.getInnerInstance();
    }
}
