package top.gcszhn.d4ocr;

import d4ocr.controller.ScreenShot;
import d4ocr.controller.impl.ScreenShotImpl;
import org.junit.Test;

import javax.swing.*;


public class ScreenShotTest {

    @Test
    public void screenShotTest(){
        ScreenShot screenShot = new ScreenShotImpl();
        screenShot.getScreenShot(100,100,100,100);


    }
}
