package service.impl;

import dao.impl.OwnerHasStationDaoImpl;
import model.OwnerHasStation;

public class OwnerHasStationServiceImpl extends AbstractServiceImpl<OwnerHasStation,Integer> {
    public OwnerHasStationServiceImpl(){
        super(new OwnerHasStationDaoImpl());
    }
}
