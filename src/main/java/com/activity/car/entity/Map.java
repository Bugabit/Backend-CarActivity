package com.activity.car.entity;

import java.util.Random;

public class Map {

    // OBSTACLES
    public static final int SPIKE = -1;
    public static final int RAVINE = -10;
    public static final int GOAL = 10;
    private int[][] matrix;

    public Map() {
        matrix = new int[9][11];
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void defineMap() {
        // Width: 11 items
        // Height: 9 items
        matrix = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {RAVINE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, RAVINE, 0, 0},
                {0, 0, GOAL, SPIKE, 0, SPIKE, 0, 0, 0, SPIKE, 0},
                {0, 0, RAVINE, 0, SPIKE, 0, SPIKE, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, SPIKE, 0, 0},
                {0, 0, 0, SPIKE, 0, 0, 0, 0, 0, RAVINE, 0},
                {0, RAVINE, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }
}
