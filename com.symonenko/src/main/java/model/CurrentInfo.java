package model;
import annotations.Column;
import annotations.PrimaryKey;
import annotations.Table;
import lombok.*;

import java.sql.Time;
import java.sql.Date;

@Table(name = "current_info")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CurrentInfo {
    @PrimaryKey
    @Column(name="id")
    private Integer id;

    @Column(name="solar_panel_id")
    private Integer solar_panel_id;

    @Column(name="charge")
    private Float charge;

    @Column(name = "angle")
    private Float angle;

    @Column(name = "energy_do")
    private Integer energy_do;

    @Column(name="date")
    private Date date;

    @Column(name="time")
    private Time time;
}
