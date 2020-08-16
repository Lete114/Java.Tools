package top.lete114.tools;

import javax.swing.*;
import java.awt.*;

/**
 * @author Lete
 * @乐特的程序永无BUG
 * @createDate 2020- 04-09 11:31
 * @update 2020-8-15 19:46
 */
public class Frame extends JFrame {
    private final JPanel contentPanel = new JPanel();

    // 创建窗体内容
    JLabel showx = null;
    JLabel showy = null;
    JLabel r = null;
    JLabel g = null;
    JLabel b = null;
    JLabel h = null;

    public Frame() {

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
        showx = new JLabel("0");
        showx.setForeground(Color.BLUE);
        showx.setFont(new Font("黑体", Font.PLAIN, 30));
        showx.setBounds(160, 30, 66, 31);
        contentPanel.add(showx);

        // Y=
        showy = new JLabel("0");
        showy.setForeground(Color.BLUE);
        showy.setFont(new Font("黑体", Font.PLAIN, 30));
        showy.setBounds(360, 30, 66, 30);
        contentPanel.add(showy);

        // R=
        r = new JLabel("0");
        r.setForeground(Color.BLUE);
        r.setFont(new Font("黑体", Font.PLAIN, 30));
        r.setBounds(120, 80, 660, 31);
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
        JLabel lete = new JLabel("                           --乐特");
        lete.setFont(new Font("黑体", Font.PLAIN, 25));
        lete.setForeground(Color.black);
        lete.setBounds(50, 180, 3000, 100);
        contentPanel.add(lete);
    }


}
