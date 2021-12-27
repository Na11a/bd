package symonenko.service.impl;

import symonenko.dao.impl.OwnerDaoImpl;
import symonenko.model.Owner;

public class OwnerServiceImpl extends AbstractServiceImpl<Owner, Integer> {
    public OwnerServiceImpl() {
        super(new OwnerDaoImpl());
    }
}
