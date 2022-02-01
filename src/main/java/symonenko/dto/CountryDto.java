package symonenko.dto;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CountryDto implements Serializable {
    private Integer id;
    private String name;
    private List<Integer> cities;
}
