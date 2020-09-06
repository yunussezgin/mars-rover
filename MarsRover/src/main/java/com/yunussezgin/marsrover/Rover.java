/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover;

import com.yunussezgin.marsrover.motions.DirectionEnum;

/**
 *
 * @author YUNUS
 */
public class Rover {
    private Point point;
    private DirectionEnum direction; 
    
    public Rover(){
        
    }
    
    public Rover(Point point, DirectionEnum direction){
        this.point = point;
        this.direction = direction;
    }

    /**
     * @return the point
     */
    public Point getPoint() {
        return point;
    }

    /**
     * @return the direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }    

    /**
     * @param point the point to set
     */
    public void setPoint(Point point) {
        this.point = point;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }
    
    
}
