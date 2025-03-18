package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean yukariklavyegiris;
    public boolean asagiklavyegiris;
    public boolean solaklavyegiris;
    public boolean sagaklavyegiris;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) {
            yukariklavyegiris = true;
        }
        if(code == KeyEvent.VK_S) {
            asagiklavyegiris = true;
        }
        if(code == KeyEvent.VK_A) {
            solaklavyegiris = true;
        }
        if(code == KeyEvent.VK_D) {
            sagaklavyegiris = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if(code == KeyEvent.VK_W) {
            yukariklavyegiris = false;
        }
        if(code == KeyEvent.VK_S) {
            asagiklavyegiris = false;
        }
        if(code == KeyEvent.VK_A) {
            solaklavyegiris = false;
        }
        if(code == KeyEvent.VK_D) {
            sagaklavyegiris = false;
        }

    }
}