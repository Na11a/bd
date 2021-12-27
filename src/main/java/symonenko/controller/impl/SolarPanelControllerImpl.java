package symonenko.controller.impl;

import symonenko.model.SolarPanel;
import symonenko.service.impl.SolarPanelServiceImpl;

public class SolarPanelControllerImpl extends AbstractControllerImpl<SolarPanel, Integer> {
    public SolarPanelControllerImpl() {
        super(new SolarPanelServiceImpl());
    }
}