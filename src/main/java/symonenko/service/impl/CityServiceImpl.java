package symonenko.service.impl;

import symonenko.dao.impl.CityDaoImpl;
import symonenko.model.City;

public class CityServiceImpl extends AbstractServiceImpl<City, Integer> {
    public CityServiceImpl() {
        super(new CityDaoImpl());
    }
}
