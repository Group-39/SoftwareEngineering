package com.mycompany.cluedov2;

import java.util.*;
import java.util.Random;

public class Room {
    private final String roomName;
    private final ArrayList<position> pos = new ArrayList<position>();
    private final ArrayList<position> doors = new ArrayList<position>();
    private final ArrayList<position> leave = new ArrayList<position>();

    Room(String rName){
        roomName = rName;
    }
        public void newPos(position newPosition){
        pos.add(newPosition);
    }


    public void newDoor(position newPosition){
        doors.add(newPosition);
    }


    public void newLeave(position newPosition){
        leave.add(newPosition);
    }

    public String getThisRoomName() {
        return roomName;
    }

    public ArrayList<position> getThisPos() {
        return pos;
    }

    public ArrayList<position> enterThisRoom() {
        return doors;
    }
        public ArrayList<position> leaveThisRoom() {
        return leave;
    }

    public ArrayList<position> canLeave() {
        ArrayList<position> leaveable = new ArrayList<>();
        for(int i = 0; i < leave.size(); i++){  
            if(leave.get(i).positionCurrentlyfree = false){
            } else {
                leaveable.add(leave.get(i));
            }
        }
        return leaveable;
    }



    public boolean isDiceRoleAllowed(){
        if("Path" == roomName){
            return true;
        }
        for(int i = 0; i < leave.size(); i++){
            if(leave.get(i).positionCurrentlyfree = false){
                return true;
            }
        }
        return false;
    }


    public position randomPosLocation(){
        boolean unoccu = false;
        Random rand = new Random();
        int int_random = rand.nextInt(pos.size());
        position x = pos.get(int_random);

        while ( unoccu == false) {
            if (x.positionCurrentlyfree == false && doors.contains(x) == false) {
                unoccu = true;
                return x;
            }
        }
        return null;
    }
}
