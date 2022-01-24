package symonenko.dto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OwnerDto {
    private Integer id;
    private String name;
    private String surname;
    private String age;
    private List<Integer> stantions;
}
