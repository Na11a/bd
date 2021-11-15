package service.impl;

import dao.impl.SaleDaoImpl;
import model.Sale;

public class SaleServiceImpl extends AbstractServiceImpl<Sale,Integer> {
    public SaleServiceImpl(){
        super(new SaleDaoImpl());
    }
}
