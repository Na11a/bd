package symonenko.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import symonenko.dao.CurrentInfoDao;
import symonenko.model.CurrentInfo;
import symonenko.service.AbstractService;
import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class CurrentInfoService implements AbstractService<CurrentInfo> {
    private final CurrentInfoDao currentInfoDao;
    @Override
    public CurrentInfo getElementById(Integer id) {
        return currentInfoDao.findById(id).orElseThrow(() -> new RuntimeException("no data"));
    }
    @Override
    public List<CurrentInfo> getAllElements(){
        return currentInfoDao.findAll();
    }
    @Override
    public CurrentInfo createElement(CurrentInfo element){
        return currentInfoDao.save(element);
    }
    @Override
    public CurrentInfo updateElement(CurrentInfo element){
        getElementById(element.getId());
        return currentInfoDao.save(element);
    }
    @Override
    public void deleteElement(Integer id){
        getElementById(id);
        currentInfoDao.deleteById(id);
    }
}
