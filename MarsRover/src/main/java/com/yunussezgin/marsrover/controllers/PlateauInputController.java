/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.controllers;

import com.yunussezgin.marsrover.Util;

/**
 *
 * @author YUNUS
 */
public class PlateauInputController implements IController {
    private String line;
    
    @Override
    public String control() {
        String[] distance = getLine().split(" ");
        if(distance.length != 2)
           return "Plateau defination invalid. Ex:5 5";
        
        if(!Util.isNumeric(distance[0]))
            return "Plateau first coordinate invalid.";
        
        if(!Util.isNumeric(distance[1]))
            return "Plateau second coordinate invalid.";
            
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
        this.line = line.trim();
    }
    
}
