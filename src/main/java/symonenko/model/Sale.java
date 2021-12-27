package symonenko.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "sale", schema = "symonenko", catalog = "")
public class Sale {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "price_of_kv", nullable = false, precision = 0)
    private Double priceOfKv;
    @Basic
    @Column(name = "amount", nullable = false, length = 45)
    private Integer amount;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "station_id", nullable = false, insertable = false,updatable = false)
    private Integer stationId;
    @Basic
    @Column(name = "date", nullable = true)
    private Date date;
    @Basic
    @Column(name = "time", nullable = true)
    private Time time;
    @ManyToOne
    private Station station;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPriceOfKv() {
        return priceOfKv;
    }

    public void setPriceOfKv(Double priceOfKv) {
        this.priceOfKv = priceOfKv;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
        Sale sale = (Sale) o;
        return Objects.equals(id, sale.id) && Objects.equals(priceOfKv, sale.priceOfKv) && Objects.equals(amount, sale.amount) && Objects.equals(stationId, sale.stationId) && Objects.equals(date, sale.date) && Objects.equals(time, sale.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, priceOfKv, amount, stationId, date, time);
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", priceOfKv=" + priceOfKv +
                ", amount='" + amount + '\'' +
                ", stationId=" + stationId +
                ", date=" + date +
                ", time=" + time +
                ", station=" + station +
                '}';
    }
}
