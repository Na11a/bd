package symonenko.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "owner_has_stantion", schema = "symonenko", catalog = "")
@IdClass(OwnerHasStantionPK.class)
public class OwnerHasStantion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "owner_id", nullable = false)
    private Integer ownerId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "station_id", nullable = false)
    private Integer stationId;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnerHasStantion that = (OwnerHasStantion) o;
        return Objects.equals(ownerId, that.ownerId) && Objects.equals(stationId, that.stationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, stationId);
    }

    @Override
    public String toString() {
        return "OwnerHasStantion{" +
                "ownerId=" + ownerId +
                ", stationId=" + stationId +
                '}';
    }
}
