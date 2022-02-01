package symonenko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import symonenko.dto.CountryDto;
import symonenko.mappers.CountryMapper;
import symonenko.mappers.CountryMapper;
import symonenko.model.Country;

import symonenko.service.impl.CountryService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/cities")
public class CountryController {
    private final CountryService countryService;

    @GetMapping
    List<CountryDto> getAllElements(){
        return countryService.getAllElements().stream().map(CountryMapper::mapDto).collect(Collectors.toList()) ;
    }
    @GetMapping("/{id}")
    CountryDto getElementById(@PathVariable("id") Integer id ){
        return CountryMapper.mapDto(countryService.getElementById(id));
    }
    @DeleteMapping("/{id}")
    void deleteElementById(@PathVariable("id") Integer id){
        countryService.deleteElement(id);
    }
    @PostMapping
    CountryDto createElement(final @Valid @ModelAttribute  Country country){
        return CountryMapper.mapDto(countryService.createElement(country));
    }
    @PutMapping
    CountryDto updateElement(final @Valid @ModelAttribute Country country){
        return CountryMapper.mapDto(countryService.updateElement(country));
    }
}
