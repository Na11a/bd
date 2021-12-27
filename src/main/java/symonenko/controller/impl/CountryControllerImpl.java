package symonenko.controller.impl;

import symonenko.model.Country;
import symonenko.service.impl.CountryServiceImpl;

public class CountryControllerImpl extends AbstractControllerImpl<Country, Integer> {
    public CountryControllerImpl() {
        super(new CountryServiceImpl());
    }
}