package symonenko.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import symonenko.dao.StationDao;
import symonenko.model.Station;
import symonenko.service.AbstractService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class StationService implements AbstractService<Station> {
    private final StationDao stationDao;
    @Override
    public Station getElementById(Integer id) {
        return stationDao.findById(id).orElseThrow(() -> new RuntimeException("no data"));
    }
    @Override
    public List<Station> getAllElements(){
        return stationDao.findAll();
    }
    @Override
    public Station createElement(Station element){
        return stationDao.save(element);
    }
    @Override
    public Station updateElement(Station sale){
        getElementById(sale.getId());
        return stationDao.save(sale);
    }
    @Override
    public void deleteElement(Integer id){
        stationDao.getById(id);
        stationDao.deleteById(id);
    }
}
