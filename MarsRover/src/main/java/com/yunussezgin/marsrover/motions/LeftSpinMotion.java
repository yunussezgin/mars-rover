/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.motions;

import com.yunussezgin.marsrover.Rover;

/**
 *
 * @author YUNUS
 */
public class LeftSpinMotion implements IMotion {

    @Override
    public void move(Rover rover) {
        rover.setDirection(rover.getDirection().getLeftSpin());
    }    
}
