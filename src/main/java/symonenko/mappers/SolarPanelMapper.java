package symonenko.mappers;

import symonenko.dto.SolarPanelDto;
import symonenko.model.CurrentInfo;
import symonenko.model.SolarPanel;

import java.util.stream.Collectors;
import java.util.Collections;

public class SolarPanelMapper {
    private SolarPanelMapper() {

    }

    public static SolarPanelDto mapDto(SolarPanel solarPanel) {
        return new SolarPanelDto(solarPanel.getId(), solarPanel.getPower(), solarPanel.getCapacity(),
                solarPanel.getStationId(), solarPanel.getYearOfInstallation(), solarPanel.getGuarantee(),
                solarPanel.getCurrent_infos() != null
                        ? solarPanel.getCurrent_infos().stream().map(CurrentInfo::getId).collect(Collectors.toList())
                        : Collections.emptyList());
    }
}
