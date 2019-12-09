package com.classbook.chapter.wechat.factory;

import javax.swing.*;

/**
 * @program: classprogram
 * @Description: 抽象工厂
 * @author: Mr.Lin
 * @date: 2019/12/9 1:29 下午
 */
abstract class FactoryForm {
    /**
    * @Description: 生产窗体
    * @Param: []
    * @return: javax.swing.JFrame
    * @author: Mr.Lin
	* @date: 2019/12/9 1:29 下午
    */ 
    abstract public JFrame getJFrame();
}
