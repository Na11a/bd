//package symonenko.service.impl;
//
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import symonenko.dao.OwnerHasStantionDao;
//import symonenko.model.OwnerHasStantion;
//import symonenko.service.AbstractService;
//import javax.transaction.Transactional;
//import java.util.List;
//
//@Service
//@AllArgsConstructor
//@Transactional
//public class OwnerHasStantionService implements AbstractService<OwnerHasStantion> {
//    private final OwnerHasStantionDao ownerHasStantionDao;
//    @Override
//    public OwnerHasStantion getElementById(Integer id) {
//        return ownerHasStantionDao.findById(id).orElseThrow(() -> new RuntimeException("no data"));
//    }
//    @Override
//    public List<OwnerHasStantion> getAllElements(){
//        return ownerHasStantionDao.findAll();
//    }
//    @Override
//    public OwnerHasStantion createElement(OwnerHasStantion element){
//        return ownerHasStantionDao.save(element);
//    }
//    @Override
//    public OwnerHasStantion updateElement(OwnerHasStantion element){
//        getElementById(element.getOwnerId());
//        return ownerHasStantionDao.save(element);
//    }
//    @Override
//    public void deleteElement(Integer id){
//        getElementById(id);
//        ownerHasStantionDao.deleteById(id);
//    }
//}
