/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterassignment;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;
//import javafx.scene.paint.Color;

/**
 *
 * @author Slugs
 */
public class Joeb extends Character {

    public static Color CHARTREUSE = new Color(163, 255, 0);
    public static Color DARKCHARTREUSE = new Color(96, 202, 0);
    public static Color BROWN = new Color(109, 70, 0);

    public Joeb(String name, Point position, int width, int height, boolean drawGrid) {
        super(name, position, width, height, drawGrid);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(CHARTREUSE);
//        graphics.fillOval(getPosition().x, getPosition().y, getWidth() / 2 , getHeight() / 3);

        super.draw(graphics);
               
        //RIGHT LOBE 
        graphics.setColor(CHARTREUSE);
        graphics.fillOval(getPosition().x + (getWidth() * 9 / 16), getPosition().y + (getHeight() * 1 / 4), getWidth() / 3, getHeight() / 2);
        //MIDDLE LOBE
        graphics.fillOval(getPosition().x + (getWidth() * 1 / 4), getPosition().y + (getHeight() * 1 / 4), getWidth() / 2, getHeight() / 2);
//        graphics.setColor (Color.BLACK);
//        graphics.drawOval(getPosition().x + (getWidth() * 0 / 4), getPosition().y + (getHeight() * 1 / 4), getWidth() / 2, getHeight() / 2);

        //LEFT LOBE
        graphics.setColor(CHARTREUSE);
        graphics.fillOval(getPosition().x + (getWidth() * 1 / 8), getPosition().y + (getHeight() * 1 / 4), getWidth() / 3, getHeight() / 2);
        
        //STEM
        graphics.setColor(BROWN);
        graphics.fillRect(getPosition().x + (getWidth() * 8 / 16), getPosition().y + (getHeight() * 4 / 24), getWidth() / 16, getHeight() / 7);
               
         //SMILE
        graphics.setColor(DARKCHARTREUSE);
        graphics.fillOval(getPosition().x + (getWidth() * 8 / 24), getPosition().y + (getHeight() * 8 / 24), getWidth() / 3, getHeight() / 3);
        
        graphics.setColor(CHARTREUSE);
        graphics.fillOval(getPosition().x + (getWidth() * 5 / 16), getPosition().y + (getHeight() * 7 / 24), getWidth() / 3, getHeight() / 3);
        
        graphics.fillRect(getPosition().x + (getWidth() * 4 / 16), getPosition().y + (getHeight() * 11 / 24), getWidth() / 2, getHeight() / 7);
        
         //EYES
        graphics.setColor(DARKCHARTREUSE);
        graphics.fillOval(getPosition().x + (getWidth() * 9 / 24), getPosition().y + (getHeight() * 9 / 24), getWidth() / 12, getHeight() / 10);

        graphics.fillOval(getPosition().x + (getWidth() * 14 / 24), getPosition().y + (getHeight() * 9 / 24), getWidth() / 12, getHeight() / 10);              
               
    }

}
