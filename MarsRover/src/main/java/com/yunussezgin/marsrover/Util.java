/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover;


import com.yunussezgin.marsrover.parser.OutputController;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author YUNUS
 */
public class  Util {
    private static final Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false; 
        }
        return pattern.matcher(strNum).matches();
    }
    
    public static String[] trimInput(String[] lines){
        List<String> trimLines = new ArrayList<>();
        
        for(String line : lines) {
            if(line.trim().length() > 0)
                trimLines.add(line.trim());
        }
        
        return trimLines.toArray(new String[0]);
    }
    
    public static String generateOutputMessage(List<Rover> roverList, Plateau plateau) {
        String outputMessage = "";
        for (Rover rover : roverList) {
            outputMessage = outputMessage + rover.getPoint().getX() + " " + rover.getPoint().getY() + " " + rover.getDirection().toString();
            if (!OutputController.isValidCommand(rover, plateau)) {
                outputMessage = outputMessage + " - " + "Out of Plateau!";
            }
            outputMessage = outputMessage + "\n";
        }
        return outputMessage;
    }
    
    public static String readFile(String filePath) {
        String data = "";
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = data + myReader.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        
        return data;
    }
}
