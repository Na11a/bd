package symonenko.controller.impl;

import symonenko.model.Owner;
import symonenko.service.impl.OwnerServiceImpl;

public class OwnerControllerImpl extends AbstractControllerImpl<Owner, Integer> {
    public OwnerControllerImpl() {
        super(new OwnerServiceImpl());
    }
}