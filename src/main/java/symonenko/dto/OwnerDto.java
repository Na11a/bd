package symonenko.dto;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OwnerDto implements Serializable {
    private Integer id;
    private String name;
    private String surname;
    private String age;
    private List<Integer> stantions;
}
