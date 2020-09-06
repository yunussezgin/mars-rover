/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover;

import com.yunussezgin.marsrover.motions.DirectionEnum;
import com.yunussezgin.marsrover.motions.IMotion;
import com.yunussezgin.marsrover.motions.RoverMotionEnum;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author YUNUS
 */
public class RoverTest {

    @Test
    public void moveForwardMotion() {
        String inputCommand = Util.readFile("InputCommand.TXT");
        String[] lines = Util.trimInput(inputCommand.split("\n"));

        Rover rover = createRover(lines[1]);

        for (char command : lines[2].toCharArray()) {
            IMotion motion = RoverMotionEnum.valueOf(String.valueOf(command)).getMotion();
            motion.move(rover);
        }

        Assert.assertEquals(1, rover.getPoint().getX());
        Assert.assertEquals(10, rover.getPoint().getY());
    }

    @Test
    public void leftSpinMotion() {
        String inputCommand = Util.readFile("InputCommand.TXT");
        String[] lines = Util.trimInput(inputCommand.split("\n"));

        Rover rover = createRover(lines[3]);

        for (char command : lines[4].toCharArray()) {
            IMotion motion = RoverMotionEnum.valueOf(String.valueOf(command)).getMotion();
            motion.move(rover);
        }

        Assert.assertEquals("S", rover.getDirection().toString());
    }

    @Test
    public void rightSpinMotion() {
        String inputCommand = Util.readFile("InputCommand.TXT");
        String[] lines = Util.trimInput(inputCommand.split("\n"));

        Rover rover = createRover(lines[5]);

        for (char command : lines[6].toCharArray()) {
            IMotion motion = RoverMotionEnum.valueOf(String.valueOf(command)).getMotion();
            motion.move(rover);
        }

        Assert.assertEquals("N", rover.getDirection().toString());
    }

    private Rover createRover(String line) {
        Rover rover = new Rover();
        String[] positionValues = line.split(" ");
        rover.setPoint(new Point(Integer.valueOf(positionValues[0]), Integer.valueOf(positionValues[1])));
        rover.setDirection(DirectionEnum.valueOf(positionValues[2]));
        return rover;
    }
}
