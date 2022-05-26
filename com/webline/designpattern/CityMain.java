package com.webline.designpattern;

public class CityMain {
    

    public static void main(String[] args) {
        

        StateDTO mahaStateDTO = new StateDTO();
		mahaStateDTO.setStateName("Maharashtra");
        mahaStateDTO.setStateCapital("Mumbai");
        mahaStateDTO.setStateMetroCities("Pune,Nagpur");
        mahaStateDTO.setStateRegion("Western Costal-State");
        mahaStateDTO.setStatePopulation("11Cr");
        mahaStateDTO.setStateMalePopulation("5.5Cr");
        mahaStateDTO.setStateFemalePopulation("5.5Cr");
        mahaStateDTO.setStateMaleChildPopulation("1Cr");
        mahaStateDTO.setStateFemaleChildPopulation("1Cr");
        mahaStateDTO.setStateArea("1476646sq/km");
        mahaStateDTO.setStateNoOfDistrict("37");
        mahaStateDTO.setStateCMName("Uddhav Thackeray");
        mahaStateDTO.setStateNoOfMLA("288");
        mahaStateDTO.setStateNoOfMP("48");
        mahaStateDTO.setStateGovernorNmae("Bhagat Shingh Koshyari");
        mahaStateDTO.setStateFamousFood("xyz");
        mahaStateDTO.setStateFamousPerson("Still Counting");
        mahaStateDTO.setStateFamousDestination("Lonavala");
        mahaStateDTO.setStateFoundationDay("1 May 1960");

        

        StateDTO gujratStateDTO = new StateDTO();
        gujratStateDTO.setStateName("Gujrat");
        gujratStateDTO.setStateCapital("Gandhinagar");
        gujratStateDTO.setStateMetroCities("Ahamadabad, Surat");
        gujratStateDTO.setStateRegion("Western Costal-State");
        gujratStateDTO.setStatePopulation("11Cr");
        gujratStateDTO.setStateMalePopulation("5.5Cr");
        gujratStateDTO.setStateFemalePopulation("5.5Cr");
        gujratStateDTO.setStateMaleChildPopulation("1Cr");
        gujratStateDTO.setStateFemaleChildPopulation("1Cr");
        gujratStateDTO.setStateArea("1476646sq/km");
        gujratStateDTO.setStateNoOfDistrict("37");
        gujratStateDTO.setStateCMName("ABC");
        gujratStateDTO.setStateNoOfMLA("288");
        gujratStateDTO.setStateNoOfMP("48");
        gujratStateDTO.setStateGovernorNmae("PQR");
        gujratStateDTO.setStateFamousFood("xyz");
        gujratStateDTO.setStateFamousPerson("");
        gujratStateDTO.setStateFamousDestination("Ahmadabad");
        gujratStateDTO.setStateFoundationDay("1 May 1960");


        StateFactory stateFactory = new StateFactory();


        State mahaState = stateFactory.getState("MahaState");
        mahaState.getStateInfo(mahaStateDTO);
        mahaState.getStateFamousFor(mahaStateDTO);


        State gujratState = stateFactory.getState("GujratState");
        gujratState.getStateInfo(gujratStateDTO);
        gujratState.getStateFamousFor(gujratStateDTO);



        CityDTO cityDTO = new CityDTO();
		cityDTO.setCityName("Shirpur");
		cityDTO.setCityState("Mahrashtra");
		cityDTO.setCityPopulation("15840");
		cityDTO.setCityMalePopulation("5800");
		cityDTO.setCityFemalePopulation("5100");
		cityDTO.setCityChildPopulation("1100");
		cityDTO.setCityMaleChildPopulation("580");
		cityDTO.setCityFemaleChildPopulation("520");
		cityDTO.setCityArea("5904sq/km");
		cityDTO.setCityDistrict("Dhule");
		cityDTO.setCityFamousDestination("Recreation Garden");
		cityDTO.setCityFamousFood("Wada Pav");
		cityDTO.setCityTemple("Balaji Mandir");
		cityDTO.setCityMosque("cityMosque");
		cityDTO.setCityWaterBody("Arunawati river");
		cityDTO.setCityFamousPerson("ABC");
		cityDTO.setCityFamousArea("PQR");
		cityDTO.setCityFamousRestrorant("FZ Cafe");
		cityDTO.setCitySchools("RCPIT");
		cityDTO.setCityHospitals("Indira Hospital");
		cityDTO.setCityMovieTheater("ABC Cinema");
		cityDTO.setCityMall("XYZ Mall");
		cityDTO.setCityMayorName("Mr.PQR");
		cityDTO.setCityMLAName("Mr.ABC");
		cityDTO.setCityMPName("Ms.XYZ");


        CityFactory cityFactory = new CityFactory();


        City mumbaiCity = cityFactory.getCity("Mumbai");
        mumbaiCity.getCityInfo(cityDTO);
        mumbaiCity.getCityStateInto(mahaState, mahaStateDTO);
        

        City suratCity = cityFactory.getCity("Surat");
        suratCity.getCityInfo(cityDTO);
        suratCity.getCityStateInto(gujratState, gujratStateDTO);

    }
}
