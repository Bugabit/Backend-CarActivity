package com.activity.car.entity;

public class Car {

    private int player;
    private int hearts;
    private int posX;
    private int posY;

    public Car(int player) {
        this.player = player;
        hearts = 10;
        posX = 0;
        posY = 0;
    }

    public int getHearts() {
        return hearts;
    }

    public void setHearts(int hearts) {
        this.hearts = hearts;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }
}
