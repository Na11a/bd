package symonenko.dto;
import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OwnerHasStantionDto {
    private Integer ownerId;
    private Integer stationId;
}
