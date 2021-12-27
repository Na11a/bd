package symonenko.service.impl;

import symonenko.dao.impl.CountryDaoImpl;
import symonenko.model.Country;

public class CountryServiceImpl extends AbstractServiceImpl<Country, Integer> {
    public CountryServiceImpl() {
        super(new CountryDaoImpl());
    }
}