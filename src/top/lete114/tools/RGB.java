package top.lete114.tools;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author Lete
 * @乐特的程序永无BUG
 * @createDate 2020- 04-09 16:45
 */
public class RGB {
    // 获取鼠标当前位置的颜色
    public int red(int x, int y) throws AWTException { // 函数返回值为颜色的RGB值。
        Robot rb = null; // java.awt.image包中的类，可以用来抓取屏幕，即截屏。
        rb = new Robot();
        Toolkit tk = Toolkit.getDefaultToolkit(); // 获取缺省工具包
        Dimension di = tk.getScreenSize(); // 屏幕尺寸规格
        //System.out.println(di.width);
        //System.out.println(di.height);
        Rectangle rec = new Rectangle(0, 0, di.width, di.height);
        BufferedImage bi = rb.createScreenCapture(rec);
        int pixelColor = bi.getRGB(x, y);
        Color color = new Color(pixelColor);
        return color.getRed(); // pixelColor的值为负，经过实践得出：加上颜色最大值就是实际颜色值。
    }
    public int green(int x, int y) throws AWTException { // 函数返回值为颜色的RGB值。
        Robot rb = null; // java.awt.image包中的类，可以用来抓取屏幕，即截屏。
        rb = new Robot();
        Toolkit tk = Toolkit.getDefaultToolkit(); // 获取缺省工具包
        Dimension di = tk.getScreenSize(); // 屏幕尺寸规格
        Rectangle rec = new Rectangle(0, 0, di.width, di.height);
        BufferedImage bi = rb.createScreenCapture(rec);
        int pixelColor = bi.getRGB(x, y);
        Color color = new Color(16777216 + pixelColor);
        return color.getGreen(); // pixelColor的值为负，经过实践得出：加上颜色最大值就是实际颜色值。
    }
    public int blue(int x, int y) throws AWTException { // 函数返回值为颜色的RGB值。
        Robot rb = null; // java.awt.image包中的类，可以用来抓取屏幕，即截屏。
        rb = new Robot();
        Toolkit tk = Toolkit.getDefaultToolkit(); // 获取缺省工具包
        Dimension di = tk.getScreenSize(); // 屏幕尺寸规格
        Rectangle rec = new Rectangle(0, 0, di.width, di.height);
        BufferedImage bi = rb.createScreenCapture(rec);
        int pixelColor = bi.getRGB(x, y);
        Color color = new Color(16777216 + pixelColor);
        return color.getBlue(); // pixelColor的值为负，经过实践得出：加上颜色最大值就是实际颜色值。
    }
}
