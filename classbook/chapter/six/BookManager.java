package com.classbook.chapter.six;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/10/23 2:14 下午
 */
public class BookManager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","CookBook",90,9);
        /** 子类访问父类的 protect 成员变量 **/
        int pages = dictionary.pages;

        /** 类型转换int 转 String **/
        display(String.valueOf(pages));
        display(dictionary.getBookName());

        /** 多态性，向上类型转换,以及动态绑定 **/
        Book book = new Book("INB02","James",98);
        Book bookDictionary = new Dictionary(book,11);
        display(book.getBookId());
        display(bookDictionary.getBookId());
    }

    /**
    * @Description: 显示结果
    * @Param: [content]
    * @return: void
    * @Author: Mr.Cheng
    * @Date: 2019/10/23 2:24 下午
    */
    public static void display(String content){
        System.out.println(content);
    }
}
