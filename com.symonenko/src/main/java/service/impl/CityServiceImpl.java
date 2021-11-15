package service.impl;

import dao.impl.CityDaoImpl;
import model.City;

public class CityServiceImpl extends AbstractServiceImpl<City,Integer> {
    public CityServiceImpl(){
        super(new CityDaoImpl());
    }
}
