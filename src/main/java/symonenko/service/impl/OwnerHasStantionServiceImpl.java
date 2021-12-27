package symonenko.service.impl;

import symonenko.dao.impl.OwnerHasStantionDaoImpl;
import symonenko.model.OwnerHasStantion;

public class OwnerHasStantionServiceImpl extends AbstractServiceImpl<OwnerHasStantion, Integer> {
    public OwnerHasStantionServiceImpl() {
        super(new OwnerHasStantionDaoImpl());
    }
}