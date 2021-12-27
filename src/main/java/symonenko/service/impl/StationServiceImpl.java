package symonenko.service.impl;

import symonenko.dao.impl.StationDaoImpl;
import symonenko.model.Station;

public class StationServiceImpl extends AbstractServiceImpl<Station, Integer> {
    public StationServiceImpl() {
        super(new StationDaoImpl());
    }
}