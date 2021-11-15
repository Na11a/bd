package controller.impl;

import model.City;
import service.impl.CityServiceImpl;

public class CityControllerImpl extends AbstractControllerImpl<City,Integer> {
    public CityControllerImpl(){
        super(new CityServiceImpl());
    }
}
