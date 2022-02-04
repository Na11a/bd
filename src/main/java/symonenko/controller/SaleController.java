package symonenko.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import symonenko.model.Sale;

import symonenko.service.impl.SaleService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/sales")
public class SaleController {
    private final SaleService saleService;
    private Sale saleById;

    @GetMapping
    List<Sale> getAllElements(){
     return saleService.getAllElements();
    }
    @GetMapping("/{id}")
    Sale getElementById(@PathVariable("id") Integer id ){
        return saleService.getElementById(id);
    }
    @DeleteMapping("/{id}")
    void deleteElementById(@PathVariable("id") Integer id){
        saleService.deleteElement(id);
    }
    @PutMapping
}
