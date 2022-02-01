package symonenko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import symonenko.dto.OwnerDto;
import symonenko.mappers.OwnerMapper;
import symonenko.model.Owner;
import symonenko.service.impl.OwnerService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@AllArgsConstructor
@RequestMapping("/cities")
public class OwnerController {
    private final OwnerService OwnerService;

    @GetMapping
    List<OwnerDto> getAllElements(){
        return OwnerService.getAllElements().stream().map(OwnerMapper::mapDto).collect(Collectors.toList()) ;
    }
    @GetMapping("/{id}")
    OwnerDto getElementById(@PathVariable("id") Integer id ){
        return OwnerMapper.mapDto(OwnerService.getElementById(id));
    }
    @DeleteMapping("/{id}")
    void deleteElementById(@PathVariable("id") Integer id){
        OwnerService.deleteElement(id);
    }
    @PostMapping
    OwnerDto createElement(final @Valid @ModelAttribute Owner Owner){
        return OwnerMapper.mapDto(OwnerService.createElement(Owner));
    }
    @PutMapping
    OwnerDto updateElement(final @Valid @ModelAttribute Owner Owner){
        return OwnerMapper.mapDto(OwnerService.updateElement(Owner));
    }
}
