/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yunussezgin.marsrover.motions;

/**
 *
 * @author YUNUS
 */
public enum DirectionEnum {
    N,
    E,
    S,
    W;

    public DirectionEnum getLeftSpin() {
        return DirectionEnum.values()[(this.ordinal() == 0 ? 3 : this.ordinal() - 1) % 4];
    }

    public DirectionEnum getRightSpin() {
        return DirectionEnum.values()[(this.ordinal() + 1) % 4];
    }
}
