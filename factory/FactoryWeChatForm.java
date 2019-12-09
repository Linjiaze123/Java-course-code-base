package com.classbook.chapter.wechat.factory;

import com.classbook.chapter.wechat.wechatform.WeChatForm;

import javax.swing.*;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Lin
 * @date: 2019/12/9 1:29 下午
 */
public class FactoryWeChatForm extends FactoryForm {
    /**
     * @Description: 生产窗体
     * @Param: []
     * @return: javax.swing.JFrame
	 * @author: Mr.Lin
	 * @date: 2019/12/9 1:29 下午
     */
    @Override
    public JFrame getJFrame() {
        return new WeChatForm();
    }
}
