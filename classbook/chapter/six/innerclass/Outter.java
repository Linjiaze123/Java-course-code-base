package com.classbook.chapter.six.innerclass;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Cheng
 * @date: 2019/10/28 1:43 下午
 */
public class Outter {
    private Inner inner = null;
    public Outter() {

    }

    public Inner getInnerInstance() {
        if(inner == null) {
            inner = new Inner();
        }
        return inner;
    }

    protected class Inner {
        public Inner() {

        }
    }
}
