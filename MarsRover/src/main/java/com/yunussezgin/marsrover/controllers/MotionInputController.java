/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.controllers;

import com.yunussezgin.marsrover.motions.RoverMotionEnum;

/**
 *
 * @author YUNUS
 */
public class MotionInputController implements IController {
    private String line;
    
    @Override
    public String control() {

        for (int i = 0; i < line.length(); i++) {
            boolean isValid = false;
            for (RoverMotionEnum motion : RoverMotionEnum.values()) {
                if (motion.toString().equals(String.valueOf(line.charAt(i)))) {
                    isValid = true;
                    break;
                }
            }
            if (!isValid) {
                return "Motion string includes invalid character which is " + line.charAt(i);
            }
        }

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
