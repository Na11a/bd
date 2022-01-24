package symonenko.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import symonenko.dao.CityDao;
import symonenko.model.City;
import symonenko.model.City;
import symonenko.service.AbstractService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class CityService implements AbstractService<City> {
    private final CityDao cityDao;
    @Override
    public City getElementById(Integer id) {
        return cityDao.findById(id).orElseThrow(() -> new RuntimeException("no data"));
    }
    @Override
    public List<City> getAllElements(){
        return cityDao.findAll();
    }
    @Override
    public symonenko.model.City createElement(City element){
        return cityDao.save(element);
    }
    @Override
    public City updateElement(City sale){
        getElementById(sale.getId());
        return cityDao.save(sale);
    }
    @Override
    public void deleteElement(Integer id){
        City sale = cityDao.getById(id);
        cityDao.deleteById(id);
    }
}
