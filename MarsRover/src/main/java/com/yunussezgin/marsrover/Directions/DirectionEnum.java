/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.Directions;

/**
 *
 * @author YUNUS
 */
public enum DirectionEnum {
    N(0),
    E(90),
    S(180),
    W(270);
    
    private int degree;
            
    DirectionEnum(int degree){
        this.degree = degree;
    }
    
    public void leftSpin(){
        this.degree = (degree == 0 ? 270 : degree - 90);
    }
    
    public void rightSpin(){
        this.degree = (degree == 270 ? 0 : degree + 90);
    }
}
