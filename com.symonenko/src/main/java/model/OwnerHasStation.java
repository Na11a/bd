package model;
import annotations.Column;
import annotations.PrimaryKey;
import annotations.Table;
import lombok.*;

@Table(name = "owner_has_station")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OwnerHasStation {
    @PrimaryKey
    @Column(name="id")
    private Integer id;

    @Column(name="station_id")
    private Integer station_id;

    @Column(name="owner_id")
    private Integer owner_id;
}
