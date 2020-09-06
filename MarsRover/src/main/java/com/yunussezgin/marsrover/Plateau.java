/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover;

/**
 *
 * @author YUNUS
 */
public class Plateau {
    private Point point;

     public Plateau(Point point){
        this.point = point;
    }
    
    /**
     * @return the point
     */
    public Point getPoint() {
        return point;
    }

    /**
     * @param point the point to set
     */
    public void setPoint(Point point) {
        this.point = point;
    }
    
    
}
