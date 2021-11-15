package controller.impl;

import model.Sale;
import service.impl.SaleServiceImpl;

public class SaleControllerImpl extends AbstractControllerImpl<Sale,Integer> {
    public SaleControllerImpl(){
        super(new SaleServiceImpl());
    }
}
