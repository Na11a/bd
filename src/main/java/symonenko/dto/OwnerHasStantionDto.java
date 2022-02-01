package symonenko.dto;
import lombok.*;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OwnerHasStantionDto implements Serializable {
    private Integer ownerId;
    private Integer stationId;
}
