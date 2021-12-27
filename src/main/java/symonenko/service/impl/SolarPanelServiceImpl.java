package symonenko.service.impl;

import symonenko.dao.impl.SolarPanelDaoImpl;
import symonenko.model.SolarPanel;

public class SolarPanelServiceImpl extends AbstractServiceImpl<SolarPanel, Integer> {
    public SolarPanelServiceImpl() {
        super(new SolarPanelDaoImpl());
    }
}
