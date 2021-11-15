package service.impl;

import dao.impl.CurrentInfoDaoImpl;
import model.CurrentInfo;

public class CurrentInfoServiceImpl extends AbstractServiceImpl<CurrentInfo,Integer> {
    public CurrentInfoServiceImpl(){
        super(new CurrentInfoDaoImpl());
    }
}
