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
public enum RoverDirectionlEnum {
    L(new LeftSpinDirection()),  //LEFT
    R(new RightSpinDirection()),  //RIGHT
    M(new MoveForwardDirection()); //MOVE_FORWARD
    
    private Direction direct;
    
    RoverDirectionlEnum(Direction direct){
        this.direct = direct;
    }
    
    public Direction getDirection(){
        return this.direct;
    }
}
