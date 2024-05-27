package edu.fgs.ui;

import javax.swing.*;

public class LoginJframe extends JFrame {
    //登录界面
    public LoginJframe(){
        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("登录界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //设置界面是否显示,建议写在最后
        this.setVisible(true);
    }
}
