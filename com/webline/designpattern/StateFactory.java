package com.webline.designpattern;

public class StateFactory {
    

    public State getState(String stateType){
        if (stateType == null) {
            return null;
        }if (stateType.equalsIgnoreCase("MahaState")) {
            return new MahaState();
        } else if(stateType.equalsIgnoreCase("GujratState")){
            return new GujratState();
        }
        return null;
    }
}
