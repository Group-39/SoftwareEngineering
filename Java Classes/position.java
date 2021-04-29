package com.mycompany.cluedov2;

public class position {
    Room newRoom;
    int x_coordinate;
    int y_coordinate;
    boolean positionCurrentlyfree;    
    public position(Room room, int x_axis, int y_axis){
        newRoom = room;
        x_coordinate = x_axis;
        y_coordinate = y_axis;
        positionCurrentlyfree = true;
    }

    public Room getThisRoom() {
        return newRoom;
    }

    public boolean isAreaAboveFree(){
        return y_coordinate > 0;
    }

    public boolean isAreaBelowFree(){
        return y_coordinate < 21;
    }

    public boolean isAreaToRightFree(){
        return x_coordinate < 21;
    }

    public boolean isAreaToLeftFree(){
        return x_coordinate > 0;
    }
    public void assignToken(){
        positionCurrentlyfree = false;
    }
    public void removeToken(){
        positionCurrentlyfree = true;
    }
}
