package symonenko.mappers;

import symonenko.dto.CountryDto;
import symonenko.model.City;
import symonenko.model.Country;

import java.util.Collections;
import java.util.stream.Collectors;

public class CountryMapper {
    private CountryMapper(){}
    public static CountryDto mapDto(Country country){
        return new CountryDto(country.getId(),country.getName(),
                country.getCities() != null
                        ? country.getCities().stream().map(City::getId).collect(Collectors.toList())
                        : Collections.emptyList());
    }
}
