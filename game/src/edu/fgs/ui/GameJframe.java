package edu.fgs.ui;

import javax.swing.*;
import java.awt.*;

public class GameJframe extends JFrame {
    //游戏主界面
    public GameJframe(){
        initJframe();
        //创建整个菜单对象
        initJMenuBar();
        this.setVisible(true);
    }

    private void initJMenuBar() {
        JMenuBar jMenuBar =new JMenuBar();
        //创建菜单上的两个选项的对象 （功能 充值）
        JMenu functionjMenu =new JMenu("功能");
        JMenu rechargeJMenu =new JMenu("充值");

        //创建选项下的条目对象
        JMenuItem replayItem =new JMenuItem("重进游戏");
        JMenuItem reloginItem =new JMenuItem("重新登录");
        JMenuItem closeItem =new JMenuItem("关闭游戏");

        JMenuItem rechargeItem =new JMenuItem("充值");

        //把条目放入选项
        functionjMenu.add(replayItem);
        functionjMenu.add(reloginItem);
        functionjMenu.add(closeItem);

        rechargeJMenu.add(rechargeItem);
        //把选项放入菜单
        jMenuBar.add(functionjMenu);
        jMenuBar.add(rechargeJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJframe() {
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图游戏主界面");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //设置界面是否显示,建议写在最后
    }
}
