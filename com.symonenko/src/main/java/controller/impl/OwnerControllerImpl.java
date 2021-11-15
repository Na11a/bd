package controller.impl;

import model.Owner;
import service.impl.OwnerServiceImpl;

public class OwnerControllerImpl extends AbstractControllerImpl<Owner,Integer> {
    public OwnerControllerImpl(){
        super(new OwnerServiceImpl());
    }
}
