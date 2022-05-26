package com.webline.designpattern;

public class MahaState implements State {

    @Override
    public void getStateInfo(StateDTO stateDTO) {
        System.out.println("State Name "+stateDTO.getStateName());
        System.out.println("State Capital Name "+stateDTO.getStateCapital());
        System.out.println("State Metro-Cities Names are "+stateDTO.getStateMetroCities());
        System.out.println("State Region is  "+stateDTO.getStateRegion());
        System.out.println("State Population is  "+stateDTO.getStatePopulation());
        System.out.println("State Male Population is  "+stateDTO.getStateMalePopulation());
        System.out.println("State Female Population is  "+stateDTO.getStateFemalePopulation());
        System.out.println("State Male Child Population is  "+stateDTO.getStateMaleChildPopulation());
        System.out.println("State Female Child Population is  "+stateDTO.getStateFemaleChildPopulation());
        System.out.println("State Land Area is  "+stateDTO.getStateArea());
        System.out.println("No of Diatrict in the State are  "+stateDTO.getStateNoOfDistrict());
        System.out.println("State Population is  "+stateDTO.getStatePopulation());
        System.out.println("State CM Name is  "+stateDTO.getStateCMName());
        System.out.println("No of MLA's in the State are  "+stateDTO.getStateNoOfMLA());
        System.out.println("No of MP's in the State are  "+stateDTO.getStateNoOfMP());
        
    }

    @Override
    public void getStateFamousFor(StateDTO stateDTO) {
        System.out.println("State Famous Destination is  "+stateDTO.getStateFamousDestination());
        System.out.println("State Famous Food is  "+stateDTO.getStateFamousFood());
        System.out.println("State Famous "+stateDTO.getStateFamousPerson());
        System.out.println("State Foundation Day on  "+stateDTO.getStateFoundationDay());
        
    }
    
}
