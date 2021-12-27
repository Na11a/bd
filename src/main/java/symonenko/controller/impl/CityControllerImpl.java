package symonenko.controller.impl;

import symonenko.model.City;
import symonenko.service.impl.CityServiceImpl;

public class CityControllerImpl extends AbstractControllerImpl<City, Integer> {
    public CityControllerImpl() {
        super(new CityServiceImpl());
    }
}
