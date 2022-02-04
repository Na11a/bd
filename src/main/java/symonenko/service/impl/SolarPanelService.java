package symonenko.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import symonenko.dao.SolarPanelDao;
import symonenko.model.SolarPanel;
import symonenko.service.AbstractService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class SolarPanelService implements AbstractService<SolarPanel> {
    private final SolarPanelDao solarPanelDao;
    @Override
    public SolarPanel getElementById(Integer id) {
        return solarPanelDao.findById(id).orElseThrow(() -> new RuntimeException("no data"));
    }
    @Override
    public List<SolarPanel> getAllElements(){
        return solarPanelDao.findAll();
    }
    @Override
    public SolarPanel createElement(SolarPanel element){
        return solarPanelDao.save(element);
    }
    @Override
    public SolarPanel updateElement(SolarPanel sale){
        getElementById(sale.getId());
        return solarPanelDao.save(sale);
    }
    @Override
    public void deleteElement(Integer id){
        solarPanelDao.getById(id);
        solarPanelDao.deleteById(id);
    }
}
