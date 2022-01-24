package symonenko.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import symonenko.dao.SaleDao;
import symonenko.model.Sale;
import symonenko.service.AbstractService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class SaleService implements AbstractService<Sale> {
    private final SaleDao saleDao;
    @Override
    public symonenko.model.Sale getElementById(Integer id) {
        return saleDao.findById(id).orElseThrow(() -> new RuntimeException("no data"));
    }
    @Override
    public List<symonenko.model.Sale> getAllElements(){
        return saleDao.findAll();
    }
    @Override
    public symonenko.model.Sale createElement(Sale element){
        return saleDao.save(element);
    }
    @Override
    public Sale updateElement(Sale sale){
        getElementById(sale.getId());
        return saleDao.save(sale);
    }
    @Override
    public void deleteElement(Integer id){
        Sale sale = saleDao.getById(id);
        saleDao.deleteById(id);
    }
}
