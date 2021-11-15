package dao.impl;

import model.Country;

public class CountryDaoImpl extends AbstractDaoImpl<Country,Integer> {
    public CountryDaoImpl(){
        super(Country.class);
    }
}
