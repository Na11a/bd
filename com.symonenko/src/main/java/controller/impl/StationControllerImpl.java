package controller.impl;

import model.Station;
import service.impl.StationServiceImpl;

public class StationControllerImpl extends AbstractControllerImpl<Station,Integer>{
    public StationControllerImpl(){
        super(new StationServiceImpl());
    }
}
