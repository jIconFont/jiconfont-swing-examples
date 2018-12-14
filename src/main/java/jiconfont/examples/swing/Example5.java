package jiconfont.examples.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.InputStream;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import jiconfont.DefaultIconCode;
import jiconfont.IconCode;
import jiconfont.IconFont;
import jiconfont.swing.IconFontSwing;

/**
 * Copyright (c) 2016 jIconFont <BR>
 * <BR>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:<BR>
 * <BR>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.<BR>
 * <BR>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class Example5 extends JFrame {

    public Example5() {
        JPanel panel = new JPanel();
        panel.setBackground(java.awt.Color.WHITE);
        panel.setLayout(new BorderLayout());


        // Register my custom IconFont
        IconFontSwing.register(new IconFont() {
            @Override
            public String getFontFamily() {
                return "Entypo";
            }

            @Override
            public InputStream getFontInputStream() {
                return Example5.class.getResourceAsStream("/entypo.ttf");
            }
        });


        IconCode iconCode = new DefaultIconCode("Entypo", '\uF118');
        Icon icon = IconFontSwing.buildIcon(iconCode, 40, new Color(0, 150, 0));
        JLabel label = new JLabel(icon);

        panel.add(label);
        add(panel);

        setSize(200, 200);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        Example1 test = new Example1();
        test.setVisible(true);
    }
}
