package symonenko.model;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "current_info", schema = "symonenko", catalog = "")
public class CurrentInfo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "charge", nullable = true, precision = 0)
    private Double charge;
    @Basic
    @Column(name = "angle", nullable = true, precision = 0)
    private Double angle;
    @Basic
    @Column(name = "energy_do", nullable = true)
    private Integer energyDo;
    @Basic
    @Column(name = "solar_panel_id", nullable = false, insertable = false,updatable = false)
    private Integer solarPanelId;
    @Basic
    @Column(name = "date", nullable = true)
    private Timestamp date;
    @Basic
    @Column(name = "time", nullable = true)
    private Time time;
    @ManyToOne
    private SolarPanel solar_panel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    public Integer getEnergyDo() {
        return energyDo;
    }

    public void setEnergyDo(Integer energyDo) {
        this.energyDo = energyDo;
    }

    public Integer getSolarPanelId() {
        return solarPanelId;
    }

    public void setSolarPanelId(Integer solarPanelId) {
        this.solarPanelId = solarPanelId;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentInfo that = (CurrentInfo) o;
        return Objects.equals(id, that.id) && Objects.equals(charge, that.charge) && Objects.equals(angle, that.angle) && Objects.equals(energyDo, that.energyDo) && Objects.equals(solarPanelId, that.solarPanelId) && Objects.equals(date, that.date) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, charge, angle, energyDo, solarPanelId, date, time);
    }

    public SolarPanel getSolar_panel() {
        return solar_panel;
    }

    public void setSolar_panel(SolarPanel solar_panel) {
        this.solar_panel = solar_panel;
    }

    @Override
    public String toString() {
        return "CurrentInfo{" +
                "id=" + id +
                ", charge=" + charge +
                ", angle=" + angle +
                ", energyDo=" + energyDo +
                ", solarPanelId=" + solarPanelId +
                ", date=" + date +
                ", time=" + time +
                ", solar_panel=" + solar_panel +
                '}';
    }
}
