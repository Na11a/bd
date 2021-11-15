package service.impl;

import dao.impl.StationDaoImpl;
import model.Station;

public class StationServiceImpl extends AbstractServiceImpl<Station,Integer> {
    public StationServiceImpl(){
        super(new StationDaoImpl());
    }
}
