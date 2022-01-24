package symonenko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import symonenko.model.Owner;

@Repository
public interface OwnerDao extends JpaRepository<Owner, Integer> {
    Owner getById(Integer id);
}
