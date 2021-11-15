package model;
import annotations.Column;
import annotations.PrimaryKey;
import annotations.Table;
import lombok.*;

@Table(name = "owner")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Owner {
    @PrimaryKey
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

}
