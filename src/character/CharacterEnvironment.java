/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author LK
 */
class CharacterEnvironment extends Environment {

    private Cain bobbyLarge, bobbySmall;
    private Image life;
    

    public CharacterEnvironment() {
        bobbyLarge = new Cain(310, 100, 250, 350);
        //bobbySmall = new Cain(400, 100, 150, 210);
        this.setBackground(new Color(200, 0, 0));
        
        life = ResourceTools.loadImageFromResource("character/heart.jpg");
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

        //if (bobbySmall != null) {
        //    bobbySmall.draw(graphics);
        //}
        
        if (life != null) {
            
            graphics.drawImage(life, 723, 32, 120, 30, this);
        }
    }

}
