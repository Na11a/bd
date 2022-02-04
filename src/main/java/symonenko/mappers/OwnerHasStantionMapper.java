package symonenko.mappers;

import symonenko.dto.OwnerHasStantionDto;
import symonenko.model.OwnerHasStantion;

public class OwnerHasStantionMapper {
    private OwnerHasStantionMapper(){}
    public static OwnerHasStantionDto mapDto(OwnerHasStantion ownerHasStantion){
        return new OwnerHasStantionDto(ownerHasStantion.getOwnerId(), ownerHasStantion.getStationId());
    }
}
