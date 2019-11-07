package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/10/28 1:23 下午
 */
public class PagesBook extends Pages {
    @Override
    void content() {
        System.out.println("this is a page of book");
    }

    @Override
    void type() {
        System.out.println("this is a dictionary");
    }
}
