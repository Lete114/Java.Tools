package io.github.lete114.tools;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Lete
 * @乐特的程序永无BUG
 * @createDate 2020- 04-09 11:31
 */
public class XY extends JFrame {
    private final JPanel contentPanel = new JPanel();

    // 创建窗体内容
    JLabel vx = null;
    JLabel vy = null;
    JLabel r = null;
    JLabel g = null;
    JLabel b = null;
    JLabel h = null;

    public XY() {

        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        // logo图片
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("lete.jpg")));


        // 坐标X
        JLabel lblx = new JLabel("\u5750\u6807X:");
        lblx.setFont(new Font("黑体", Font.PLAIN, 30));
        lblx.setBounds(70, 30, 100, 30);
        contentPanel.add(lblx);
        // 坐标Y
        JLabel lbly = new JLabel("\u5750\u6807Y:");
        lbly.setFont(new Font("黑体", Font.PLAIN, 30));
        lbly.setBounds(270, 30, 100, 30);
        contentPanel.add(lbly);

        // X=
        vx = new JLabel("0");
        vx.setForeground(Color.BLUE);
        vx.setFont(new Font("黑体", Font.PLAIN, 30));
        vx.setBounds(160, 30, 66, 31);
        contentPanel.add(vx);

        // Y=
        vy = new JLabel("0");
        vy.setForeground(Color.BLUE);
        vy.setFont(new Font("黑体", Font.PLAIN, 30));
        vy.setBounds(360, 30, 66, 30);
        contentPanel.add(vy);

        // R=
        r = new JLabel("0");
        r.setForeground(Color.BLUE);
        r.setFont(new Font("黑体", Font.PLAIN, 30));
        r.setBounds(120, 80, 66, 31);
        contentPanel.add(r);
        //红字
        JLabel hong = new JLabel("红:");
        hong.setFont(new Font("黑体", Font.PLAIN, 30));
        hong.setForeground(Color.RED);
        hong.setBounds(70, 80, 100, 30);
        contentPanel.add(hong);

        // G=
        g = new JLabel("0");
        g.setForeground(Color.BLUE);
        g.setFont(new Font("黑体", Font.PLAIN, 30));
        g.setBounds(120, 130, 66, 31);
        contentPanel.add(g);
        // 绿字
        JLabel lv = new JLabel("绿:");
        lv.setFont(new Font("黑体", Font.PLAIN, 30));
        lv.setForeground(Color.green);
        lv.setBounds(70, 130, 100, 30);
        contentPanel.add(lv);

        // B=
        b = new JLabel("0");
        b.setForeground(Color.BLUE);
        b.setFont(new Font("黑体", Font.PLAIN, 30));
        b.setBounds(120, 170, 66, 30);
        contentPanel.add(b);
        // 蓝字
        JLabel lan = new JLabel("蓝:");
        lan.setFont(new Font("黑体", Font.PLAIN, 30));
        lan.setForeground(Color.blue);
        lan.setBounds(70, 170, 100, 30);
        contentPanel.add(lan);

        // HEX 值
        h = new JLabel("");
        h.setForeground(Color.BLUE);
        h.setFont(new Font("黑体", Font.PLAIN, 30));
        h.setBounds(290, 130, 500, 30);
        contentPanel.add(h);
        // HEX 字
        JLabel hexz = new JLabel("HEX值:");
        hexz.setFont(new Font("黑体", Font.PLAIN, 30));
        hexz.setBounds(200, 130, 100, 30);
        contentPanel.add(hexz);

        // 声明
        JLabel ms1 = new JLabel("此工具纯属个人兴趣爱好，本人常用到该功能");
        JLabel ms2 = new JLabel("         于是就写了这个工具");
        JLabel ms3 = new JLabel("         请不要用于商业用途");
        JLabel ms4 = new JLabel("          一切后果自己负责");
        JLabel ms5 = new JLabel("                           --乐特");
        ms1.setFont(new Font("黑体", Font.PLAIN, 20));
        ms2.setFont(new Font("黑体", Font.PLAIN, 20));
        ms3.setFont(new Font("黑体", Font.PLAIN, 20));
        ms4.setFont(new Font("黑体", Font.PLAIN, 20));
        ms5.setFont(new Font("黑体", Font.PLAIN, 25));
        ms1.setForeground(Color.RED);
        ms2.setForeground(Color.RED);
        ms3.setForeground(Color.RED);
        ms4.setForeground(Color.RED);
        ms5.setForeground(Color.black);
        ms1.setBounds(50, 240, 3000, 30);
        ms2.setBounds(50, 260, 3000, 30);
        ms3.setBounds(50, 280, 3000, 30);
        ms4.setBounds(50, 300, 3000, 30);
        ms5.setBounds(50, 320, 3000, 30);
        contentPanel.add(ms1);
        contentPanel.add(ms2);
        contentPanel.add(ms3);
        contentPanel.add(ms4);
        contentPanel.add(ms5);
    }


}
