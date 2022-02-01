package symonenko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import symonenko.dto.SolarPanelDto;
import symonenko.mappers.SolarPanelMapper;
import symonenko.model.SolarPanel;
import symonenko.service.impl.SolarPanelService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@AllArgsConstructor
@RequestMapping("/cities")
public class SolarPanelController {
    private final SolarPanelService SolarPanelService;

    @GetMapping
    List<SolarPanelDto> getAllElements(){
        return SolarPanelService.getAllElements().stream().map(SolarPanelMapper::mapDto).collect(Collectors.toList()) ;
    }
    @GetMapping("/{id}")
    SolarPanelDto getElementById(@PathVariable("id") Integer id ){
        return SolarPanelMapper.mapDto(SolarPanelService.getElementById(id));
    }
    @DeleteMapping("/{id}")
    void deleteElementById(@PathVariable("id") Integer id){
        SolarPanelService.deleteElement(id);
    }
    @PostMapping
    SolarPanelDto createElement(final @Valid @ModelAttribute SolarPanel SolarPanel){
        return SolarPanelMapper.mapDto(SolarPanelService.createElement(SolarPanel));
    }
    @PutMapping
    SolarPanelDto updateElement(final @Valid @ModelAttribute SolarPanel SolarPanel){
        return SolarPanelMapper.mapDto(SolarPanelService.updateElement(SolarPanel));
    }
}
