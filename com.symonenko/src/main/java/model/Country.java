package model;


import annotations.Column;
import annotations.PrimaryKey;
import annotations.Table;
import lombok.*;

@Table(name = "country")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Country {
    @PrimaryKey
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;
}
