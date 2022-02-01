package symonenko.dto;
import lombok.*;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CurrentInfoDto implements Serializable {
    private Integer id;
    private Double charge;
    private Double angle;
    private Integer energyDo;
    private Integer solarPanelId;
    private Timestamp date;
    private Time time;
}
