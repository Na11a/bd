package service.impl;

import dao.impl.SolarPanelDaoImpl;
import model.SolarPanel;

public class SolarPanelServiceImpl extends AbstractServiceImpl<SolarPanel,Integer> {
    public SolarPanelServiceImpl(){
        super(new SolarPanelDaoImpl());
    }
}
