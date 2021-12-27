package symonenko.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "solar_panel", schema = "symonenko", catalog = "")
public class SolarPanel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "power", nullable = true)
    private Integer power;
    @Basic
    @Column(name = "capacity", nullable = true)
    private Integer capacity;
    @Basic
    @Column(name = "station_id", nullable = false, insertable = false,updatable = false)
    private Integer stationId;
    @Basic
    @Column(name = "year_of_installation", nullable = true)
    private Integer yearOfInstallation;
    @Basic
    @Column(name = "guarantee", nullable = true)
    private Integer guarantee;
    @OneToMany(mappedBy = "solar_panel")
    private List<CurrentInfo> current_infos;
    @ManyToOne
    private Station station;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getYearOfInstallation() {
        return yearOfInstallation;
    }

    public void setYearOfInstallation(Integer yearOfInstallation) {
        this.yearOfInstallation = yearOfInstallation;
    }

    public Integer getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Integer guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolarPanel that = (SolarPanel) o;
        return Objects.equals(id, that.id) && Objects.equals(power, that.power) && Objects.equals(capacity, that.capacity) && Objects.equals(stationId, that.stationId) && Objects.equals(yearOfInstallation, that.yearOfInstallation) && Objects.equals(guarantee, that.guarantee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, power, capacity, stationId, yearOfInstallation, guarantee);
    }

    public List<CurrentInfo> getCurrent_infos() {
        return current_infos;
    }

    public void setCurrent_infos(List<CurrentInfo> current_infos) {
        this.current_infos = current_infos;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "SolarPanel{" +
                "id=" + id +
                ", power=" + power +
                ", capacity=" + capacity +
                ", stationId=" + stationId +
                ", yearOfInstallation=" + yearOfInstallation +
                ", guarantee=" + guarantee +
                ", station=" + station +
                '}';
    }
}
