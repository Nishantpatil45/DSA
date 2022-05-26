package com.webline.designpattern;

public class Mumbai implements City {

    @Override
    public void getCityInfo(CityDTO cityDTO) {
        System.out.println("City Name is - "+cityDTO.getCityName());
    	System.out.println("City Population is - "+cityDTO.getCityPopulation());
    	System.out.println("City Male Population is - "+cityDTO.getCityMalePopulation());
    	System.out.println("City Female Population is "+ cityDTO.getCityFemalePopulation());
    	System.out.println("City Child Population is "+ cityDTO.getCityChildPopulation());
    	System.out.println("City Male Child population is "+ cityDTO.getCityMaleChildPopulation());
    	System.out.println("City Female Child Population is "+ cityDTO.getCityFemaleChildPopulation());
    	System.out.println("City Area is "+ cityDTO.getCityArea());
    	System.out.println("City District is "+cityDTO.getCityDistrict());
    	System.out.println("City MLA Name is "+ cityDTO.getCityMLAName());
    	System.out.println("City MP Name is "+ cityDTO.getCityMPName());
        System.out.println("City Famous Restrorant is "+ cityDTO.getCityFamousRestrorant());
    	System.out.println("City Famous Food is "+ cityDTO.getCityFamousFood());
    	System.out.println("City Temple  "+ cityDTO.getCityTemple());
    	System.out.println("City Mosque "+ cityDTO.getCityMosque());
    	System.out.println("City River Name is "+ cityDTO.getCityWaterBody());
    	System.out.println("City Famous Person is  "+ cityDTO.getCityFamousPerson());
    	System.out.println("City Famous Destination is "+ cityDTO.getCityFamousDestination());
    	System.out.println("City Famous Area is "+ cityDTO.getCityFamousArea());
    	System.out.println("City Movie Theater is "+ cityDTO.getCityMovieTheater());
    	System.out.println("City Mall is "+ cityDTO.getCityMall());
        
    }

    @Override
    public void getCityStateInto(State state, StateDTO stateDTO) {
        System.out.println("State Information: " + state.getStateInfo(stateDTO));
        System.out.println("State Famous For: " + state.getStateFamousFor(stateDTO));
        
    }
    
}
