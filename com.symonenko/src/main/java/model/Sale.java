package model;
import annotations.Column;
import annotations.PrimaryKey;
import annotations.Table;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@Table(name = "sale")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Sale {
    @PrimaryKey
    @Column(name="id")
    private Integer id;

    @Column(name="station_id")
    private Integer station_id;

    @Column(name="price_of_kv")
    private Float price_of_kv;

    @Column(name="amount")
    private Float amount;

    @Column(name = "date")
    private Date date;

    @Column(name = "time")
    private Time time;

}
