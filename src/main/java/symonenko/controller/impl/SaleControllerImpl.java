package symonenko.controller.impl;

import symonenko.model.Sale;
import symonenko.service.impl.SaleServiceImpl;

public class SaleControllerImpl extends AbstractControllerImpl<Sale, Integer> {
    public SaleControllerImpl() {
        super(new SaleServiceImpl());
    }
}