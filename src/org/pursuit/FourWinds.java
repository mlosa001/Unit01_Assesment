package org.pursuit;

public class FourWinds {

    public static int NORTH = 0;
    public static int SOUTH = 1;
    public static int EAST = 2;
    public static int WEST = 3;

    public FourWinds(int NORTH, int SOUTH, int EAST, int WEST) {
        this.NORTH = NORTH;
        this.SOUTH = NORTH;
        this.EAST = NORTH;
        this.WEST = NORTH;

    }

    public static int getNorth() {
        return NORTH;
    }

    public static int getSouth() {
        return SOUTH;
    }

    public static int getEast() {
        return EAST;
    }

    public static int getWest() {
        return WEST;
    }


}