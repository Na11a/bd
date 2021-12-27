package symonenko.service.impl;

import symonenko.dao.impl.SaleDaoImpl;
import symonenko.model.Sale;

public class SaleServiceImpl extends AbstractServiceImpl<Sale, Integer> {
    public SaleServiceImpl() {
        super(new SaleDaoImpl());
    }
}
