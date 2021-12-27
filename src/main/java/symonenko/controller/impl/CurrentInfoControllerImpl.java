package symonenko.controller.impl;

import symonenko.model.CurrentInfo;
import symonenko.service.impl.CurrentInfoServiceImpl;

public class CurrentInfoControllerImpl extends AbstractControllerImpl<CurrentInfo, Integer> {
    public CurrentInfoControllerImpl() {
        super(new CurrentInfoServiceImpl());
    }
}