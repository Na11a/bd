package symonenko.dto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CountryDto {
    private Integer id;
    private String name;
    private List<Integer> cities;
}
