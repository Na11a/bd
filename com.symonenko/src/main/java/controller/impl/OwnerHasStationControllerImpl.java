package controller.impl;

import model.OwnerHasStation;
import service.impl.OwnerHasStationServiceImpl;

public class OwnerHasStationControllerImpl extends AbstractControllerImpl<OwnerHasStation,Integer> {
    public OwnerHasStationControllerImpl(){
        super(new OwnerHasStationServiceImpl());
    }
}
