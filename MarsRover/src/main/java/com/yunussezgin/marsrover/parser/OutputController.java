/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.parser;

import com.yunussezgin.marsrover.Plateau;
import com.yunussezgin.marsrover.Rover;

/**
 *
 * @author YUNUS
 */
public class OutputController {

    public static boolean isValidCommand(Rover rover, Plateau plateau) {
        return rover.getPoint().getX() <= plateau.getPoint().getX() && rover.getPoint().getY() <= plateau.getPoint().getY();
    }
}
