package symonenko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import symonenko.model.OwnerHasStantion;

@Repository
public interface OwnerHasStantionDao extends JpaRepository<OwnerHasStantion, Integer> {
    OwnerHasStantion getById(Integer id);
}
