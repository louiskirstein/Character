/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author LK
 */
public class Cain {

    public Cain(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.drawRect(x, y, width, height);

        //arms
        graphics.setColor(Color.GRAY);
        graphics.drawOval(x + (width * 10 / 100), y + (height * 55 / 100), width * 20 / 100, height * 30 / 100);
        graphics.drawOval(x + (width * 70 / 100), y + (height * 55 / 100), width * 20 / 100, height * 30 / 100);
        graphics.setColor(Color.PINK);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 55 / 100), width * 20 / 100, height * 30 / 100);
        graphics.fillOval(x + (width * 70 / 100), y + (height * 55 / 100), width * 20 / 100, height * 30 / 100);

        //body
        graphics.setColor(Color.PINK);
        graphics.fillRect(x + (width * 24 / 100), y + (width * 70 / 100), width * 20 / 100, height * 50 / 100);
        graphics.fillRect(x + (width * 55 / 100), y + (width * 70 / 100), width * 20 / 100, height * 50 / 100);
        graphics.setColor(Color.GRAY);
        graphics.drawRect(x + (width * 24 / 100), y + (width * 70 / 100), width * 20 / 100, height * 50 / 100);
        graphics.drawRect(x + (width * 55 / 100), y + (width * 70 / 100), width * 20 / 100, height * 50 / 100);

        //head
        graphics.setColor(Color.PINK);
        graphics.fillOval(x, y, width, height * 70 / 100);
        graphics.setColor(Color.GRAY);
        graphics.drawOval(x, y, width, height * 70 / 100);

        //mouth
        graphics.setColor(Color.GRAY);
        graphics.drawOval(x + (width * 40 / 100), y + (height * 45 / 100), width * 20 / 100, height * 20 / 100);
        graphics.setColor(Color.PINK);
        graphics.fillOval(x + (width * 33 / 100), y + (height * 48 / 100), width * 35 / 100, height * 20 / 100);

        //tears
//        graphics.setColor(Color.BLUE);
//        graphics.fillRect(x + (width * 17 / 100), y + (height * 40 / 100), width * 22 / 100, height * 30 / 100);
        //eyes
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 14 / 100), y + (width * 35 / 100), width * 28 / 100, height * 21 / 100);
        graphics.fillOval(x + (width * 58 / 100), y + (width * 28 / 100), width * 35 / 100, height * 26 / 100);

        //body center
        graphics.setColor(Color.PINK);
        graphics.fillRect(x + (width * 43 / 100), y + (height * 70 / 100), width * 13 / 100, height * 19 / 100);
        graphics.setColor(Color.PINK);
        graphics.fillRect(x + (width * 43 / 100), y + (height * 88 / 100), width * 13 / 100, height * 12 / 100);
        graphics.setColor(Color.GRAY);
        graphics.drawRect(x + (width * 43 / 100), y + (height * 88 / 100), width * 13 / 100, height * 12 / 100);
        graphics.setColor(new Color(200, 0, 0));
        graphics.fillRect(x + (width * 43 / 100), y + (height * 88 / 100), width * 13 / 100, height * 13 / 100);
        //Text
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Calibri", Font.BOLD, 50));
        graphics.drawString("Cain", 365, 530);
        //mouth

        //eyes pupil
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 18 / 100), y + (width * 38 / 100), width * 13 / 100, height * 9 / 100);
        graphics.fillOval(x + (width * 30 / 100), y + (width * 55 / 100), width * 5 / 100, height * 3 / 100);

        //leg anglet
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x + (width * 24 / 100), y + (height * 94 / 100), width * 19 / 100, height * 2 / 100);

        //eye patch
        graphics.setColor(Color.BLACK);
        int[] xValues = new int[4];
        xValues[0] = x + (width * 22 / 100);
        xValues[1] = x + (width * 12 / 100);
        xValues[2] = x + (width * 100 / 100);
        xValues[3] = x + (width * 98 / 100);

        int[] yValues = new int[4];
        yValues[0] = y + (height * 6 / 100);
        yValues[1] = y + (height * 12 / 100);
        yValues[2] = y + (height * 33 / 100);
        yValues[3] = y + (height * 24 / 100);

        graphics.fillPolygon(xValues, yValues, 4);

    }

    private int x;
    private int y;
    private int width;
    private int height;

}
