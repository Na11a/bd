package symonenko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import symonenko.dto.CityDto;
import symonenko.mappers.CityMapper;
import symonenko.model.City;

import symonenko.service.impl.CityService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/cities")
public class CityController {
    private final CityService cityService;

    @GetMapping
    List<CityDto> getAllElements(){
        return cityService.getAllElements().stream().map(CityMapper::mapDto).collect(Collectors.toList()) ;
    }
    @GetMapping("/{id}")
    CityDto getElementById(@PathVariable("id") Integer id ){
        return CityMapper.mapDto(cityService.getElementById(id));
    }
    @DeleteMapping("/{id}")
    void deleteElementById(@PathVariable("id") Integer id){
        cityService.deleteElement(id);
    }
    @PostMapping
    CityDto createElement(final @Valid @ModelAttribute  City city){
        return CityMapper.mapDto(cityService.createElement(city));
    }
    @PutMapping
    CityDto updateElement(final @Valid @ModelAttribute City city){
        System.out.println(city);
        return CityMapper.mapDto(cityService.updateElement(city));
    }
}
