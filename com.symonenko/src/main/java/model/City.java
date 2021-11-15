package model;
import annotations.Column;
import annotations.PrimaryKey;
import annotations.Table;
import lombok.*;

@Table(name = "city")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {
    @PrimaryKey
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="country_id")
    private Integer country_id;
}
