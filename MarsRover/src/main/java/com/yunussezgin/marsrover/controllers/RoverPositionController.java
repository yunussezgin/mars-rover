/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.controllers;

import com.yunussezgin.marsrover.Util;
import com.yunussezgin.marsrover.directions.DirectionEnum;

/**
 *
 * @author YUNUS
 */
public class RoverPositionController implements IController {
    private String line;
    
    @Override
    public String control() {
        String[] distance = line.split(" ");
        if(distance.length != 3)
           return "Rover position invalid. Ex:1 2 N";
        
        if(!Util.isNumeric(distance[0]))
            return "Rover position first coordinate invalid.";
        
        if(!Util.isNumeric(distance[1]))
            return "Rover position second coordinate invalid.";
        
        if(Util.isNumeric(distance[2]))
            return "Rover position third direction invalid.";
        
        boolean isValid = false;
        for(DirectionEnum direction : DirectionEnum.values()){
            if(direction.toString().equals(distance[2])) {
                isValid = true;
                break;
            }
        }
        
        if(!isValid)
            return "Rover position third direction invalid. Ex: N,E,S,W";
        
        return null;
    }
    
     /**
     * @return the line
     */
    public String getLine() {
        return line;
    }

    /**
     * @param line the line to set
     */
    public void setLine(String line) {
        this.line = line;
    }
    
}
