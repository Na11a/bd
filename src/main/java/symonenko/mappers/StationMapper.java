package symonenko.mappers;

import symonenko.dto.StationDto;
import symonenko.model.Owner;
import symonenko.model.Sale;
import symonenko.model.SolarPanel;
import symonenko.model.Station;

import java.util.Collections;
import java.util.stream.Collectors;

public class StationMapper {
    private StationMapper(){}
    public static StationDto mapDto(Station station){
        return new StationDto(station.getId(), station.getName(), station.getStreet(), station.getCityId(),
                station.getOwners()!=null
                        ? station.getOwners().stream().map(Owner::getId).collect(Collectors.toList())
                : Collections.emptyList(),
                station.getSales()!=null
                        ? station.getSales().stream().map(Sale::getId).collect(Collectors.toList())
                        : Collections.emptyList(),
                station.getPanels()!=null ?
                station.getPanels().stream().map(SolarPanel::getId).collect(Collectors.toList())
                        : Collections.emptyList());
    }
}
