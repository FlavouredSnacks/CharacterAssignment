/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterassignment;

import grid.Grid;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Color;

/**
 *
 * @author Slugs
 */
public class Character {
    
    private String name = "";
    //  private Point position;
    private int width;
    private int height;
    private boolean drawGrid = false;
    private Grid grid;
    
    {
        this.grid = new Grid(8, 8, width / 8, height / 8, new Point(0, 0), Color.DARK_GRAY);
    }
    
    public Character(String name, Point position, int width, int height, boolean drawGrid) {
        
        this.name = name;
//        this.position = position;
//        this.width = width;
//        this.height = height;
        setPosition(position);
        setWidth(width);
        setHeight(height);
        
        this.drawGrid = drawGrid;
        
    }
    
    public void draw(Graphics graphics) {
        if (this.grid != null) {
            grid.paintComponent(graphics);
        }
        
        graphics.setColor(Color.ORANGE);
        graphics.drawString(name, getPosition().x, getPosition().y - 5);
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the position
     */
    public Point getPosition() {
        
        return grid.getPosition();
    }

    /**
     * @param position the position to set
     */
    public final void setPosition(Point position) {
        grid.setPosition(position);
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public final void setWidth(int width) {
        this.width = width;
        grid.setCellWidth(width / grid.getColumns());
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public final void setHeight(int height) {
        this.height = height;
        this.grid.setCellHeight(this.height / grid.getRows());
    }

    /**
     * @return the drawGrid
     */
    public boolean isDrawGrid() {
        return drawGrid;
    }

    /**
     * @param drawGrid the drawGrid to set
     */
    public void setDrawGrid(boolean drawGrid) {
        this.drawGrid = drawGrid;
    }
}
