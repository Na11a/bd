package symonenko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import symonenko.model.CurrentInfo;

@Repository
public interface CurrentInfoDao extends JpaRepository<CurrentInfo, Integer> {
    CurrentInfo getById(Integer id);
}
