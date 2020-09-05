/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover;

import com.yunussezgin.marsrover.directions.DirectionEnum;
import com.yunussezgin.marsrover.directions.IMotion;

/**
 *
 * @author YUNUS
 */
public class Rover {
    private Point point;
    private DirectionEnum direction; 
    private IMotion motion;
    
    public Rover(Point point, DirectionEnum direction, IMotion motion){
        this.point = point;
        this.direction = direction;
        this.motion = motion;
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
     * @return the motion
     */
    public IMotion getMotion() {
        return motion;
    }
    
    
}
