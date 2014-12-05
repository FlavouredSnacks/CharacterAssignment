/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package characterassignment;

import environment.Environment;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Slugs
 */
class CharacterEnviroment extends Environment {
    private Character littlJoeb, littleJoeb;

    public CharacterEnviroment() {
        littlJoeb = new Joeb("Little Joeb", new Point(100, 200), 80, 80, true);
        littleJoeb = new Joeb("Joeb", new Point(300, 100), 320, 320, true);
        
        Image img = ResourceTools.loadImageFromResource("resources/imgres.jpg");
        this.setBackground(img.getScaledInstance(1000, 800, Image.SCALE_FAST));

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
        if (littlJoeb != null){
            littlJoeb.draw(graphics);
        }
        
        if (littleJoeb != null){
            littleJoeb.draw(graphics);
        }

}
    
}
