package com.classbook.chapter.wechat;

import com.classbook.chapter.wechat.loginform.LoginForm;
import com.classbook.chapter.wechat.registerform.RegisterForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: classprogram
 * @Description:
 * @author: Mr.Lin
 * @date: 2019/11/12 6:15 下午
 */
public class Manage {
    public static void main(String[] args){
        final RegisterForm registerForm = new RegisterForm();
        final LoginForm loginForm = new LoginForm();
        loginForm.setFrameLoginVisible(true);
        loginForm.getRegisterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerForm.setFrameRegisterVisible(true);
                loginForm.setFrameLoginVisible(false);
            }
        });

        registerForm.getBackButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginForm.setFrameLoginVisible(true);
                registerForm.dispose();
            }
        });
    }
}
