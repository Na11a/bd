package controller.impl;

import model.Country;
import service.impl.CountryServiceImpl;

public class CountryControllerImpl extends AbstractControllerImpl<Country,Integer> {
    public CountryControllerImpl(){
        super(new CountryServiceImpl());
    }
}
