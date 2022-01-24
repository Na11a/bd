package symonenko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import symonenko.model.City;


@Repository
public interface CityDao extends JpaRepository<City, Integer> {
    City getById(Integer id);
}
