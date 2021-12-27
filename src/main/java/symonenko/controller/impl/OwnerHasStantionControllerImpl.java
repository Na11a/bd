package symonenko.controller.impl;

import symonenko.model.OwnerHasStantion;
import symonenko.service.impl.OwnerHasStantionServiceImpl;

public class OwnerHasStantionControllerImpl extends AbstractControllerImpl<OwnerHasStantion, Integer> {
    public OwnerHasStantionControllerImpl() {
        super(new OwnerHasStantionServiceImpl());
    }
}