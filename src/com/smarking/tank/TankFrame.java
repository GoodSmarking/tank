package com.smarking.tank;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 继承Frame。来
 */
public class TankFrame extends Frame {

    public TankFrame(){
        // 设置窗口可见
        setVisible(true);
        // 设置窗口大小
        setSize(800, 600);
        // 设置不可调节大小
        setResizable(false);
        // 设置标题
        setTitle("Tank War");
        // 实现监听器
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                // 关闭窗口
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        // 添加键盘监听器
        addKeyListener();


    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(100, 100, 50, 50);
    }

    // 键盘监听器，使用内部类的形式
    class TankKeyListener implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
