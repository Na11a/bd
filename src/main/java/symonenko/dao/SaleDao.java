package symonenko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import symonenko.model.Sale;

@Repository
public interface SaleDao extends JpaRepository<Sale, Integer> {
    Sale getById(Integer id);
}
