package jiconfont.examples.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import jiconfont.icons.font_awesome.FontAwesome;
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
public class Example3 extends JFrame {

    public Example3() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new FlowLayout());

        // Register the IconFont
        IconFontSwing.register(FontAwesome.getIconFont());

        Icon icon = IconFontSwing.buildIcon(FontAwesome.FLOPPY_O, 15);
        JButton button = new JButton(icon);

        button.setFocusable(false);
        panel.add(button);
        add(panel);

        setSize(200, 200);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        Example3 test = new Example3();
        test.setVisible(true);
    }
}
