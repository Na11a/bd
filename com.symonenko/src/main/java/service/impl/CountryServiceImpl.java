package service.impl;

import dao.impl.CountryDaoImpl;
import model.Country;

public class CountryServiceImpl extends AbstractServiceImpl<Country,Integer> {
    public CountryServiceImpl(){
        super(new CountryDaoImpl());
    }
}
