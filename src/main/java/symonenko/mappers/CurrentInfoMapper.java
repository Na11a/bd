package symonenko.mappers;

import symonenko.dto.CurrentInfoDto;
import symonenko.model.CurrentInfo;

public class CurrentInfoMapper {
    private CurrentInfoMapper(){}
    public static CurrentInfoDto mapDto(CurrentInfo currentInfo){
        return new CurrentInfoDto(currentInfo.getId(),currentInfo.getCharge(), currentInfo.getAngle(), currentInfo.getEnergyDo(), currentInfo.getSolarPanelId(), currentInfo.getDate(),currentInfo.getTime());
    }
}

