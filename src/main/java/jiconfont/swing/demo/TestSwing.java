package jiconfont.swing.demo;

import jiconfont.fontawesome.FontAwesome;
import jiconfont.swing.IconBuilderSwing;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

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
public class TestSwing extends JFrame {

  public TestSwing() {
    JPanel panel = new JPanel();
    panel.setBackground(Color.WHITE);
    panel.setLayout(new GridLayout(0, 20));

    for (FontAwesome icon : FontAwesome.values()) {
      Icon i = IconBuilderSwing.newIcon(icon).setSize(25).buildIcon();
      panel.add(new JLabel(i));
    }

    add(new JScrollPane(panel));

    setSize(950, 650);
    setLocationRelativeTo(null);

  }

  public static void main(String args[]) {
    TestSwing test = new TestSwing();
    test.setVisible(true);
  }
}
