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
