package symonenko.dto;

import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SaleDto implements Serializable {
    private Integer id;
    private Double priceOfKv;
    private Integer amount;
    private Integer stationId;
    private Date date;
    private Time time;
}
