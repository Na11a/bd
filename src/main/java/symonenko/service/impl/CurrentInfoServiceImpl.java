package symonenko.service.impl;

import symonenko.dao.impl.CurrentInfoDaoImpl;
import symonenko.model.CurrentInfo;

public class CurrentInfoServiceImpl extends AbstractServiceImpl<CurrentInfo, Integer> {
    public CurrentInfoServiceImpl() {
        super(new CurrentInfoDaoImpl());
    }
}
