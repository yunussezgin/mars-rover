/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.controllers;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YUNUS
 */
public class CompositeController {
    private final List<IController> controllerList;
    
    public CompositeController(){
        controllerList = new ArrayList();
    }
    
    public void addController(IController controller){
        controllerList.add(controller);
    }
    
    public void removeController(IController controller){
         controllerList.remove(controller);
    }
    
    public void execute(){
        for(IController controller : controllerList)
            controller.control();
    }
}
