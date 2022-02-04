package symonenko.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StationDto {
    private Integer id;
    private String name;
    private String street;
    private Integer cityId;
    private List<Integer> owners;
    private List<Integer> sales;
    private List<Integer> panels;
}
