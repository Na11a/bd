package symonenko.dto;
import lombok.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SolarPanelDto implements Serializable {
    private Integer id;
    private Integer power;
    private Integer capacity;
    private Integer stationId;
    private Integer yearOfInstallation;
    private Integer guarantee;
    private List<Integer> current_infos;
}
