package com.webline.designpattern;

public class CityFactory {
    
    public City getCity(String cityType){
        if (cityType == null) {
            return null;
        }if(cityType.equalsIgnoreCase("Mumbai")){
            return new Mumbai();
        }else if (cityType.equalsIgnoreCase("Surat")) {
            return new Surat();
        }
        return null;
    }

}
