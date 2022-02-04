package symonenko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import symonenko.model.Station;

@Repository
public interface StationDao extends JpaRepository<Station, Integer> {
    Station getById(Integer id);
}
