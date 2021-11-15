package controller.impl;

import model.SolarPanel;
import service.impl.SolarPanelServiceImpl;

public class SolarPanelControllerImpl extends AbstractControllerImpl<SolarPanel,Integer> {
    public SolarPanelControllerImpl(){
        super(new SolarPanelServiceImpl());
    }
}
