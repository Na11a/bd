package symonenko.mappers;

import symonenko.dto.SaleDto;
import symonenko.model.Sale;

public class SaleMapper {
    private SaleMapper() {
    }

    public static SaleDto mapDto(Sale sale) {
        return new SaleDto(sale.getId(), sale.getPriceOfKv(), sale.getAmount(), sale.getStationId(), sale.getDate(), sale.getTime());
    }
}
