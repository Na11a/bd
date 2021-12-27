package symonenko.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "station", schema = "symonenko", catalog = "")
public class Station {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = true, length = 45)
    private String name;
    @Basic
    @Column(name = "street", nullable = true, length = 45)
    private String street;
    @Basic
    @Column(name = "city_id", nullable = false, insertable = false,updatable = false)
    private Integer cityId;
    @ManyToMany(mappedBy = "stantions",fetch = FetchType.EAGER)
    private List<Owner> owners;
    @OneToMany(mappedBy = "station")
    private List<Sale> sales;
    @OneToMany(mappedBy = "station")
    private List<SolarPanel> panels;
    @ManyToOne
    private City city;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return Objects.equals(id, station.id) && Objects.equals(name, station.name) && Objects.equals(street, station.street) && Objects.equals(cityId, station.cityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, street, cityId);
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }

    public List<SolarPanel> getPanels() {
        return panels;
    }

    public void setPanels(List<SolarPanel> panels) {
        this.panels = panels;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", cityId=" + cityId +
                ", city=" + city +
                '}';
    }
}
