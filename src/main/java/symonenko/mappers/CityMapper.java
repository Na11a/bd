package symonenko.mappers;
import symonenko.dto.CityDto;
import symonenko.model.City;
import symonenko.model.Station;

import java.util.stream.Collectors;
import java.util.Collections;

public class CityMapper {

    private static CityDto cityDto;

    private CityMapper(){}
    public static CityDto mapDto(City city){
        cityDto = new CityDto(city.getId(), city.getName(), city.getCountryId(),
                city.getStations() != null
                        ? city.getStations().stream().map(Station::getId).collect(Collectors.toList())
                        : Collections.emptyList()
                );
        return cityDto;
    }
}
