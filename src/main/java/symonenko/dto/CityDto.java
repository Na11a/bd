package symonenko.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CityDto {
    private Integer id;
    private String name;
    private Integer countryId;
    private List<Integer> stations;
}
