package espm.invest.stock.common.controller;

import espm.invest.stock.common.datatype.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@FeignClient("stock-service")
public interface StockController {


    @GetMapping("/stock")
    List<Stock> stock();

    @GetMapping("/stock/{id}")
    Stock stock(String id);

    @DeleteMapping("/stock/{id}")
    Stock deleteById(String id);

    @PostMapping("/stock")
    Stock save(Stock stock);

}
