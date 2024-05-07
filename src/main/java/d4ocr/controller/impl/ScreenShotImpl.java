package d4ocr.controller.impl;

import d4ocr.controller.ScreenShot;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ScreenShotImpl implements ScreenShot, Runnable {

    //坐标
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public ScreenShotImpl() {

    }

    public BufferedImage getCapture() {
        return capture;
    }

    public void setCapture(BufferedImage capture) {
        this.capture = capture;
    }

    //存放截图信息
    private BufferedImage capture;


    /**
     * 实例初始化方法，给实例写入坐标
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public ScreenShotImpl(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void insertPiont(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public BufferedImage getScreenShot(int x1, int y1, int x2, int y2) {
        insertPiont(x1,x2,y1,y2);
        run();
        return this.capture;
    }

    @Override
    public void run() {
        try {
            // 创建Robot实例
            Robot robot = new Robot();

            // 创建Rectangle对象
            Rectangle rectangle = new Rectangle(this.x1,this.y1,this.x2,this.y2);
            //截图
            BufferedImage capture = robot.createScreenCapture(rectangle);
            this.capture = capture;
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
