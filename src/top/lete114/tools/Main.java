package top.lete114.tools;

import javax.swing.JFrame;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Lete
 * @乐特的程序永无BUG
 * @createDate 2020- 04-25 17:47
 * @update 2020-8-15 19:46
 */
public class Main {
    public static void main(String[] args) {
        try {
            Frame frame = new Frame();
            RGB rgb = new RGB();
            // 禁止放大和拉伸
            frame.setResizable(true);
            // 关闭时连同进程一起关闭，节约资源
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // 显示窗体
            frame.setVisible(true);
            // 显示在最顶层
            frame.setAlwaysOnTop(true);
            // 标题
            frame.setTitle("自制实用工具");
            // 窗体出现的位置
            frame.setBounds(1000, 10, 520, 300);
            // 计时器
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                // 多线程
                @Override
                public void run() {
                    // 获取屏幕坐标位置（X\Y）
                    Point zbiao = MouseInfo.getPointerInfo().getLocation();
                    // 将int类型的rgb转换为String类型
                    frame.showx.setText(String.valueOf(zbiao.x));
                    frame.showy.setText(String.valueOf(zbiao.y));

                    try {
                        // 将int类型的rgb转换为String类型
                        frame.r.setText(String.valueOf(rgb.red(zbiao.x,zbiao.y)));
                        frame.g.setText(String.valueOf(rgb.green(zbiao.x,zbiao.y)));
                        frame.b.setText(String.valueOf(rgb.blue(zbiao.x,zbiao.y)));
                        // 将rgb转换为Hex值
                        Color color = new Color(rgb.red(zbiao.x,zbiao.y),rgb.green(zbiao.x,zbiao.y),rgb.blue(zbiao.x,zbiao.y));
                        String hex ="#" + Integer.toHexString(color.getRGB()).substring(2);
                        frame.h.setText(hex);
                    } catch (AWTException e) {
                        e.printStackTrace();
                    }
                }
            }, 1, 1);//0.01毫秒执行一次
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
