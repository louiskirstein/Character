/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import environment.ApplicationStarter;
import java.awt.Color;
import java.awt.Dimension;
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
       
        //graphics.drawRect(x, y, width, height);

        //arms left, right
        graphics.setColor(Color.GRAY);
        graphics.drawOval(x + (width * 10 / 100), y + (height * 55 / 100), width * 20 / 100, height * 30 / 100);
        graphics.drawOval(x + (width * 79 / 800), y + (height * 441 / 800), width * 20 / 100, height * 30 / 100);
        graphics.drawOval(x + (width * 78 / 800), y + (height * 442 / 800), width * 20 / 100, height * 30 / 100);
        graphics.drawOval(x + (width * 77 / 800), y + (height * 443 / 800), width * 20 / 100, height * 30 / 100);

        graphics.drawOval(x + (width * 70 / 100), y + (height * 55 / 100), width * 20 / 100, height * 30 / 100);
        graphics.drawOval(x + (width * 562 / 800), y + (height * 441 / 800), width * 20 / 100, height * 30 / 100);
        graphics.drawOval(x + (width * 563 / 800), y + (height * 442 / 800), width * 20 / 100, height * 30 / 100);
        graphics.drawOval(x + (width * 564 / 800), y + (height * 443 / 800), width * 20 / 100, height * 30 / 100);

        graphics.setColor(Color.PINK);
        graphics.fillOval(x + (width * 10 / 100), y + (height * 55 / 100), width * 20 / 100, height * 30 / 100);
        graphics.fillOval(x + (width * 70 / 100), y + (height * 55 / 100), width * 20 / 100, height * 30 / 100);

        //body left, right
        graphics.setColor(Color.PINK);
        graphics.fillRect(x + (width * 24 / 100), y + (width * 70 / 100), width * 20 / 100, height * 50 / 100);
        graphics.fillRect(x + (width * 55 / 100), y + (width * 70 / 100), width * 20 / 100, height * 50 / 100);
        graphics.setColor(Color.GRAY);
        graphics.drawRect(x + (width * 24 / 100), y + (width * 70 / 100), width * 20 / 100, height * 50 / 100);
        graphics.drawRect(x + (width * 191 / 800), y + (width * 561 / 800), width * 20 / 100, height * 50 / 100);                

        graphics.drawRect(x + (width * 55 / 100), y + (width * 70 / 100), width * 20 / 100, height * 50 / 100);
        graphics.drawRect(x + (width * 442 / 800), y + (width * 561 / 800), width * 20 / 100, height * 50 / 100);
        graphics.drawRect(x + (width * 553 / 1000), y + (width * 562 / 800), width * 20 / 100, height * 50 / 100);
       
        //head
        graphics.setColor(Color.PINK);
        graphics.fillOval(x, y, width, height * 70 / 100);

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

        //mouth
        graphics.setColor(Color.GRAY);
        graphics.drawOval(x + (width * 40 / 100), y + (height * 45 / 100), width * 20 / 100, height * 20 / 100);
        graphics.drawOval(x + (width * 321 / 800), y + (height * 361 / 800), width * 20 / 100, height * 20 / 100);
        graphics.drawOval(x + (width * 322 / 800), y + (height * 362 / 800), width * 20 / 100, height * 20 / 100);

        graphics.setColor(Color.PINK);
        graphics.fillOval(x + (width * 33 / 100), y + (height * 48 / 100), width * 35 / 100, height * 20 / 100);

        //tears left side
        graphics.setColor(new Color(110, 242, 250, 255));
        int[] xValues2 = new int[4];
        xValues2[0] = x + (width * 15 / 100);
        xValues2[1] = x + (width * 15 / 100);
        xValues2[2] = x + (width * 41 / 100);
        xValues2[3] = x + (width * 41 / 100);

        int[] yValues2 = new int[4];
        yValues2[0] = y + (height * 38 / 100);
        yValues2[1] = y + (height * 60 / 100);
        yValues2[2] = y + (height * 70 / 100);
        yValues2[3] = y + (height * 38 / 100);

        //tears filling space left side
        graphics.fillPolygon(xValues2, yValues2, 4);
        int[] xValues3 = new int[4];
        xValues3[0] = x + (width * 15 / 100);
        xValues3[1] = x + (width * 25 / 100);
        xValues3[2] = x + (width * 40 / 100);
        xValues3[3] = x + (width * 40 / 100);

        int[] yValues3 = new int[4];
        yValues3[0] = y + (height * 60 / 100);
        yValues3[1] = y + (height * 131 / 200);
        yValues3[2] = y + (height * 279 / 400);
        yValues3[3] = y + (height * 60 / 100);

        graphics.fillPolygon(xValues3, yValues3, 4);

        //tears right side
        graphics.setColor(new Color(110, 242, 250, 255));
        int[] xValues4 = new int[4];
        xValues4[0] = x + (width * 63 / 100);
        xValues4[1] = x + (width * 63 / 100);
        xValues4[2] = x + (width * 89 / 100);
        xValues4[3] = x + (width * 89 / 100);

        int[] yValues4 = new int[4];
        yValues4[0] = y + (height * 38 / 100);
        yValues4[1] = y + (height * 69 / 100);
        yValues4[2] = y + (height * 58 / 100);
        yValues4[3] = y + (height * 38 / 100);
        graphics.fillPolygon(xValues4, yValues4, 4);

        //tears filling space right side
        int[] xValues5 = new int[4];
        xValues5[0] = x + (width * 63 / 100);
        xValues5[1] = x + (width * 76 / 100);
        xValues5[2] = x + (width * 88 / 100);
        xValues5[3] = x + (width * 70 / 100);

        int[] yValues5 = new int[4];
        yValues5[0] = y + (height * 69 / 100);
        yValues5[1] = y + (height * 262 / 400);
        yValues5[2] = y + (height * 58 / 100);
        yValues5[3] = y + (height * 58 / 100);

        graphics.fillPolygon(xValues5, yValues5, 4);

        //head drawOvals
        graphics.setColor(Color.GRAY);
        graphics.drawOval(x, y, width, height * 70 / 100);
        graphics.drawOval(x + (width * 1 / 800), y + (height * 1 / 800), width, height * 70 / 100);
        graphics.drawOval(x + (width * 2 / 800), y + (height * 2 / 800), width, height * 70 / 100);
        graphics.drawOval(x + (width * 3 / 800), y + (height * 3 / 800), width, height * 70 / 100);
        graphics.drawOval(x + (width * 4 / 800), y + (height * 4 / 800), width, height * 70 / 100);

        //eyes
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 14 / 100), y + (width * 35 / 100), width * 28 / 100, height * 21 / 100);
        graphics.fillOval(x + (width * 58 / 100), y + (width * 28 / 100), width * 35 / 100, height * 26 / 100);

        //body center
        graphics.setColor(Color.PINK);
        graphics.fillRect(x + (width * 43 / 100), y + (height * 141 / 200), width * 13 / 100, height * 19 / 100);
        graphics.setColor(Color.PINK);
        graphics.fillRect(x + (width * 43 / 100), y + (height * 88 / 100), width * 13 / 100, height * 12 / 100);
        graphics.setColor(Color.GRAY);
        graphics.drawRect(x + (width * 43 / 100), y + (height * 88 / 100), width * 13 / 100, height * 12 / 100);
        graphics.drawRect(x + (width * 343 / 800), y + (height * 704 / 800), width * 13 / 100, height * 12 / 100);
        graphics.drawRect(x + (width * 342 / 800), y + (height * 703 / 800), width * 13 / 100, height * 12 / 100);
        graphics.drawRect(x + (width * 341 / 800), y + (height * 702 / 800), width * 13 / 100, height * 12 / 100);
        graphics.drawRect(x + (width * 346 / 800), y + (height * 702 / 800), width * 13 / 100, height * 12 / 100);
        graphics.drawRect(x + (width * 347 / 800), y + (height * 702 / 800), width * 13 / 100, height * 12 / 100);
        graphics.drawRect(x + (width * 348 / 800), y + (height * 702 / 800), width * 13 / 100, height * 12 / 100);

        graphics.setColor(new Color(200, 0, 0));
        graphics.fillRect(x + (width * 43 / 100), y + (height * 88 / 100), width * 13 / 100, height * 13 / 100);
        
        

        //eyes pupil
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 18 / 100), y + (width * 38 / 100), width * 13 / 100, height * 9 / 100);
        graphics.fillOval(x + (width * 30 / 100), y + (width * 55 / 100), width * 5 / 100, height * 3 / 100);

        //leg anglet
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x + (width * 24 / 100), y + (height * 94 / 100), width * 37 / 200, height * 2 / 100);
        
        //top, bottom bar
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0, 0, 1000, 70);
        graphics.fillRect(0, 508, 1000, 70);
        
        //top bar writing
        graphics.setColor(Color.RED);
        graphics.setFont(new Font("Calibri", Font.BOLD, 20));
        graphics.drawString("-LIFE-", 750, 26);
        
        //Text
        graphics.setColor(Color.WHITE);
        graphics.setFont(new Font("Calibri", Font.BOLD, 50));
        graphics.drawString("Cain", 370, 560);
        graphics.setColor(Color.WHITE);
        graphics.setFont(new Font("Calibri", Font.BOLD, 45));
        graphics.drawString("Binding of Isaac", 240, 48);
           
        
         

    }

    private int x;
    private int y;
    private int width;
    private int height;

}
