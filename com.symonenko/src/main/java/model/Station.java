package model;
import annotations.Column;
import annotations.PrimaryKey;
import annotations.Table;
import lombok.*;

@Table(name = "station")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Station {
    @PrimaryKey
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;
    
    @Column(name="street")
    private String street;

    @Column(name="city_id")
    private Integer city_id;
}
