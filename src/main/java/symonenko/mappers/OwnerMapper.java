package symonenko.mappers;

import symonenko.dto.OwnerDto;
import symonenko.model.Owner;
import symonenko.model.Station;

import java.util.Collections;
import java.util.stream.Collectors;

public class OwnerMapper {
    private OwnerMapper(){}
    public static OwnerDto mapDto(Owner owner){
        return new OwnerDto(owner.getId(),owner.getName(),owner.getSurname(),owner.getAge(),owner.getStantions()!=null
                ? owner.getStantions().stream().map(Station::getId).collect(Collectors.toList()) : Collections.emptyList());
    }
}
