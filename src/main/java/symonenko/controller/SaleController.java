package symonenko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import symonenko.dto.SaleDto;
import symonenko.mappers.SaleMapper;
import symonenko.model.Sale;

import symonenko.service.impl.SaleService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/sales")
public class SaleController {
    private final SaleService saleService;

    @GetMapping
    List<SaleDto> getAllElements(){
     return saleService.getAllElements().stream().map(SaleMapper::mapDto).collect(Collectors.toList()) ;
    }
    @GetMapping("/{id}")
    SaleDto getElementById(@PathVariable("id") Integer id ){
        return SaleMapper.mapDto(saleService.getElementById(id));
    }
    @DeleteMapping("/{id}")
    void deleteElementById(@PathVariable("id") Integer id){
        saleService.deleteElement(id);
    }
    @PostMapping
    SaleDto createElement(final @Valid @ModelAttribute  Sale sale){
        return SaleMapper.mapDto(saleService.createElement(sale));
    }
    @PutMapping
    SaleDto updateElement(final @Valid @ModelAttribute  Sale sale){
        System.out.println(sale);
        return SaleMapper.mapDto(saleService.updateElement(sale));
    }
}
