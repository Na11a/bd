package model;
import annotations.Column;
import annotations.PrimaryKey;
import annotations.Table;
import lombok.*;

import java.sql.Time;
import java.time.Year;
import java.util.Date;
import java.lang.Float;
@Table(name = "solar_panel")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SolarPanel {
    @PrimaryKey
    @Column(name="id")
    private Integer id;

    @Column(name="power")
    private Integer power;

    @Column(name="capacity")
    private Integer capacity;

    @Column(name="station_id")
    private Integer station_id;

    @Column(name = "guarantee")
    private Integer guarantee;

    @Column(name = "year_of_installation")
    private Integer year_of_installation;


}
