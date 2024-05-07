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
package d4ocr;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // 创建Robot实例
                Robot robot = new Robot();

                // 定义截图区域的坐标和尺寸
                int x = 100; // 截图区域左上角的x坐标
                int y = 100; // 截图区域左上角的y坐标
                int width = 300; // 截图区域的宽度
                int height = 200; // 截图区域的高度

                // 创建Rectangle对象
                Rectangle captureRect = new Rectangle(x, y, width, height);

                // 截图
                BufferedImage capture = robot.createScreenCapture(captureRect);

                // 将BufferedImage显示在一个JFrame中，可选步骤
                JFrame frame = new JFrame("Screenshot");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel label = new JLabel(new ImageIcon(capture));
                frame.getContentPane().add(label);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                // 这里已经获取到了BufferedImage对象，您可以进一步处理
                // ...

            } catch (AWTException e) {
                e.printStackTrace();
            }
        });
    }
}

