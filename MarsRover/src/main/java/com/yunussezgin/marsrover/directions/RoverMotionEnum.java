/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.directions;

/**
 *
 * @author YUNUS
 */
public enum RoverMotionEnum {
    L(new LeftSpinMotion()),  //LEFT
    R(new RightSpinMotion()),  //RIGHT
    M(new MoveForwardMotion()); //MOVE_FORWARD
    
    private final IMotion motion;
    
    RoverMotionEnum(IMotion motion){
        this.motion = motion;
    }
    
    public IMotion getMotion(){
        return this.motion;
    }
}
