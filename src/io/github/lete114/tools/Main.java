package io.github.lete114.tools;

import javax.swing.JFrame;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Lete
 * @乐特的程序永无BUG
 * @createDate 2020- 04-25 17:47
 */
public class Main {
    public static void main(String[] args) {
        try {
            XY lete = new XY();
            RGB rgb = new RGB();
            HEX hex = new HEX();
            // 禁止放大和拉伸
            lete.setResizable(false);
            // 关闭时连同进程一起关闭，节约资源
            lete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // 显示窗体
            lete.setVisible(true);
            // 显示在最顶层
            lete.setAlwaysOnTop(true);
            // 标题
            lete.setTitle("Lete自制实用工具");
            // 窗体出现的位置
            lete.setBounds(1000, 10, 520, 400);
            // 计时器
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                // 多线程
                @Override
                public void run() {
                    Point zbiao = MouseInfo.getPointerInfo().getLocation();

                    lete.vx.setText("" + zbiao.x);
                    lete.vy.setText("" + zbiao.y);

                    try {
                        lete.r.setText(""+rgb.red(zbiao.x,zbiao.y));
                        lete.g.setText(""+rgb.green(zbiao.x,zbiao.y));
                        lete.b.setText(""+rgb.blue(zbiao.x,zbiao.y));

                        lete.h.setText(""+hex.convertRGBToHex(rgb.red(zbiao.x,zbiao.y),rgb.green(zbiao.x,zbiao.y),rgb.blue(zbiao.x,zbiao.y)));
                    } catch (AWTException e) {
                        e.printStackTrace();
                    }
                }
            }, 10, 10);//0.01毫秒执行一次
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
