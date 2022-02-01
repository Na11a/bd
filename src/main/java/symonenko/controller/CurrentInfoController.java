package symonenko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import symonenko.dto.CurrentInfoDto;
import symonenko.mappers.CurrentInfoMapper;
import symonenko.model.CurrentInfo;
import symonenko.service.impl.CurrentInfoService;


import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/cities")
public class CurrentInfoController {
    private final CurrentInfoService currentInfoService;
    
    @GetMapping
    List<CurrentInfoDto> getAllElements(){
        return currentInfoService.getAllElements().stream().map(CurrentInfoMapper::mapDto).collect(Collectors.toList()) ;
    }
    @GetMapping("/{id}")
    CurrentInfoDto getElementById(@PathVariable("id") Integer id ){
        return CurrentInfoMapper.mapDto(currentInfoService.getElementById(id));
    }
    @DeleteMapping("/{id}")
    void deleteElementById(@PathVariable("id") Integer id){
        currentInfoService.deleteElement(id);
    }
    @PostMapping
    CurrentInfoDto createElement(final @Valid @ModelAttribute CurrentInfo currentInfo){
        return CurrentInfoMapper.mapDto(currentInfoService.createElement(currentInfo));
    }
    @PutMapping
    CurrentInfoDto updateElement(final @Valid @ModelAttribute CurrentInfo currentInfo){
        return CurrentInfoMapper.mapDto(currentInfoService.updateElement(currentInfo));
    }
}
