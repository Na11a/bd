package service.impl;

import dao.impl.OwnerDaoImpl;
import model.Owner;

public class OwnerServiceImpl extends AbstractServiceImpl<Owner,Integer>{
    public OwnerServiceImpl(){
        super(new OwnerDaoImpl());
    }
}
