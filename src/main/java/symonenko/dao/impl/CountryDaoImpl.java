package symonenko.dao.impl;

import symonenko.model.Country;

public class CountryDaoImpl extends AbstractDaoImpl<Country, Integer> {
    public CountryDaoImpl() {
        super(Country.class);
    }
}
