package symonenko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import symonenko.model.City;
import symonenko.model.Country;


@Repository
public interface CountryDao extends JpaRepository<Country, Integer> {
    Country getById(Integer id);
}
