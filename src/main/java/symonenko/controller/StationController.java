package symonenko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import symonenko.dto.StationDto;
import symonenko.mappers.StationMapper;
import symonenko.model.Station;
import symonenko.service.impl.StationService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@AllArgsConstructor
@RequestMapping("/cities")
public class StationController {
    private final StationService StationService;

    @GetMapping
    List<StationDto> getAllElements(){
        return StationService.getAllElements().stream().map(StationMapper::mapDto).collect(Collectors.toList()) ;
    }
    @GetMapping("/{id}")
    StationDto getElementById(@PathVariable("id") Integer id ){
        return StationMapper.mapDto(StationService.getElementById(id));
    }
    @DeleteMapping("/{id}")
    void deleteElementById(@PathVariable("id") Integer id){
        StationService.deleteElement(id);
    }
    @PostMapping
    StationDto createElement(final @Valid @ModelAttribute Station Station){
        return StationMapper.mapDto(StationService.createElement(Station));
    }
    @PutMapping
    StationDto updateElement(final @Valid @ModelAttribute Station Station){
        return StationMapper.mapDto(StationService.updateElement(Station));
    }
}
