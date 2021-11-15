package controller.impl;

import model.CurrentInfo;
import service.impl.CurrentInfoServiceImpl;

public class CurrentInfoControllerImpl extends AbstractControllerImpl<CurrentInfo,Integer> {
    public CurrentInfoControllerImpl(){
        super(new CurrentInfoServiceImpl());
    }
}
