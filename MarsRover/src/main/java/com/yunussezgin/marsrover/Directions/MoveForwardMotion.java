/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.Directions;

import com.yunussezgin.marsrover.Rover;

/**
 *
 * @author YUNUS
 */
public class MoveForwardMotion implements Motion {

    @Override
    public void move(Rover rover) {
        switch(rover.getDirection()) {
            case N:
                rover.getPoint().addY(1);
                break;
            case E:
                rover.getPoint().addX(1);
                break;
            case S:
                rover.getPoint().addY(-1);
                break;
            case W:
                rover.getPoint().addX(-1);
                break;
        }
    }

}
