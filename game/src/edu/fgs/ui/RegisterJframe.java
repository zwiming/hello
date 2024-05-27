package edu.fgs.ui;

import javax.swing.*;

public class RegisterJframe extends JFrame {
    //注册界面
    public RegisterJframe(){
        this.setSize(488,500);
        //设置界面的标题
        this.setTitle("注册界面");
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
