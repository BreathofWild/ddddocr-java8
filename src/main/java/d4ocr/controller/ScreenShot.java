package d4ocr.controller;

import java.awt.image.BufferedImage;

/**
 * 截图功能接口
 * @author liucy
 * */
public interface ScreenShot {

    /**
     * 通过坐标点对屏幕进行截图
     * @param x1,x2,y1,y2 所需图片的坐标点
     * @return image 图像
     */
    public BufferedImage getScreenShot(int x1, int y1, int x2, int y2);

    public void run();
}
