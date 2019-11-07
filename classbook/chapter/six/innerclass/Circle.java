package com.classbook.chapter.six.innerclass;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/10/28 1:36 下午
 */
public class Circle {
    private double radius = 0;
    public static int count =1;

    public Circle(double radius) {
        this.radius = radius;

        /** 必须先创建成员内部类的对象，再进行访问 **/
        getDrawInstance().drawShape();
    }

    private Draw getDrawInstance() {
        return new Draw();
    }

    /** 内部类 **/
    class Draw {
        public void drawShape() {
            System.out.println("drawshape");

            /** 外部类的private成员 **/
            System.out.println(radius);

            /** 外部类的静态成员 **/
            System.out.println(count);
        }
    }
}
