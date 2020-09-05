/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.parser;

import com.yunussezgin.marsrover.controllers.CompositeController;
import com.yunussezgin.marsrover.controllers.MotionInputController;
import com.yunussezgin.marsrover.controllers.PlateauInputController;
import com.yunussezgin.marsrover.controllers.RoverPositionController;

/**
 *
 * @author YUNUS
 */
public class InputController {
    
    public static String isValidCommand(String command) {
        CompositeController controller = new CompositeController();

        String[] lines = command.split("\n");
        
        if(lines.length < 3)
            return "Command must consist of at least 3 lines.";
           
        if(lines.length%2 == 0)
            return "Command is missing.";
        
        CompositeController compositeController = new CompositeController();
        
        PlateauInputController plateauController = new PlateauInputController();
        plateauController.setLine(lines[0]);
        compositeController.addController(plateauController);
        
        for (int i = 1; i < lines.length; i++) {
            if(i%2 == 1) {
                 RoverPositionController roverController = new RoverPositionController();
                 roverController.setLine(lines[i]);
                 compositeController.addController(roverController);
            } else {
                 MotionInputController motionController = new MotionInputController();
                 motionController.setLine(lines[i]);
                 compositeController.addController(motionController);
            }
        }

        return compositeController.execute();
    }
    
}
