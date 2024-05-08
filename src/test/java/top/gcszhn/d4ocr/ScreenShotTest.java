/*
 * Copyright © 2022 <a href="mailto:zhang.h.n@foxmail.com">Zhang.H.N</a>.
 *
 * Licensed under the Apache License, Version 2.0 (thie "License");
 * You may not use this file except in compliance with the license.
 * You may obtain a copy of the License at
 *
 *       http://wwww.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language govering permissions and
 * limitations under the License.
 */
package top.gcszhn.d4ocr;

import d4ocr.OCREngine;
import d4ocr.controller.ScreenShot;
import d4ocr.controller.impl.ScreenShotImpl;
import d4ocr.utils.IOUtils;
import org.junit.Test;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class ScreenShotTest {

    @Test
    public void screenShotTest() throws IOException {
        ScreenShot screenShot = new ScreenShotImpl();
        BufferedImage image = screenShot.getScreenShot(535,223,328,31);
        BufferedImage image1 = IOUtils.read("testData/ALOX.png");
        OCREngine engine =  OCREngine.instance();
        String value =engine.recognize(image);
        String value1 =engine.recognize(image1);
        System.out.println("读取出的数据为="+value);
        System.out.println("读取出的数据2为="+value1);
    }
}
