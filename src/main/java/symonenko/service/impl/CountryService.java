package symonenko.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import symonenko.dao.CityDao;
import symonenko.dao.CountryDao;
import symonenko.model.Country;
import symonenko.model.Country;
import symonenko.model.Country;
import symonenko.service.AbstractService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class CountryService implements AbstractService<Country> {
    private final CountryDao countryDao;
    @Override
    public Country getElementById(Integer id) {
        return countryDao.findById(id).orElseThrow(() -> new RuntimeException("no data"));
    }
    @Override
    public List<Country> getAllElements(){
        return countryDao.findAll();
    }
    @Override
    public symonenko.model.Country createElement(Country element){
        return countryDao.save(element);
    }
    @Override
    public Country updateElement(Country sale){
        getElementById(sale.getId());
        return countryDao.save(sale);
    }
    @Override
    public void deleteElement(Integer id){
        countryDao.getById(id);
        countryDao.deleteById(id);
    }
}
