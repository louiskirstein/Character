/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author LK
 */
class CharacterEnvironment extends Environment {

    private Cain bobbyLarge, bobbySmall;

    public CharacterEnvironment() {
        bobbyLarge = new Cain(100, 80, 250, 350);
        bobbySmall = new Cain(400, 50, 150, 210 );
        this.setBackground(new Color(200,0,0));

    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (bobbyLarge != null) {
            bobbyLarge.draw(graphics);
        }
        
        if (bobbySmall != null) {
            bobbySmall.draw(graphics);
        }
    }

}
