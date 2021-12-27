package symonenko.controller.impl;

import symonenko.model.Station;
import symonenko.service.impl.StationServiceImpl;

public class StationControllerImpl extends AbstractControllerImpl<Station, Integer> {
    public StationControllerImpl() {
        super(new StationServiceImpl());
    }
}