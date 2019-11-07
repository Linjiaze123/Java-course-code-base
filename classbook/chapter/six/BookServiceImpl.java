package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/10/28 1:15 下午
 */
public class BookServiceImpl implements BookService {
    /**
     * @Description: to show read the book
     * @Param: []
     * @return: void
     * @Author: Mr.Cheng
     * @Date: 2019/10/28 1:15 下午
     */
    @Override
    public void readBook() {
        System.out.println("read the book!");
    }

    /**
     * @Description: to show borrow the book
     * @Param: []
     * @return: void
     * @Author: Mr.Cheng
     * @Date: 2019/10/28 1:15 下午
     */
    @Override
    public void borrowBook() {
        System.out.println("borrow the book!");
    }
}
