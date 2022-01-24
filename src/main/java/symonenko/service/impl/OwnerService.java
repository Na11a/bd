package symonenko.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import symonenko.dao.OwnerDao;
import symonenko.model.Owner;
import symonenko.service.AbstractService;
import javax.transaction.Transactional;
import java.util.List;


@Service
@AllArgsConstructor
@Transactional
public class OwnerService implements AbstractService<Owner> {
    private final OwnerDao ownerDao;
    @Override
    public Owner getElementById(Integer id) {
        return ownerDao.findById(id).orElseThrow(() -> new RuntimeException("no data"));
    }
    @Override
    public List<Owner> getAllElements(){
        return ownerDao.findAll();
    }
    @Override
    public Owner createElement(Owner element){
        return ownerDao.save(element);
    }
    @Override
    public Owner updateElement(Owner element){
        getElementById(element.getId());
        return ownerDao.save(element);
    }
    @Override
    public void deleteElement(Integer id){
        getElementById(id);
        ownerDao.deleteById(id);
    }
}
