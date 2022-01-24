package symonenko.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import symonenko.model.SolarPanel;

@Repository
public interface SolarPanelDao extends JpaRepository<SolarPanel, Integer> {
    SolarPanel getById(Integer id);
}
