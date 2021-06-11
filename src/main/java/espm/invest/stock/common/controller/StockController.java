package espm.invest.stock.common.controller;

import espm.invest.stock.common.datatype.Stock;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient("stock-service")
public interface StockController {


    @GetMapping("/stocks")
    List<Stock> stock();

    @GetMapping("/stock/{name}")
    Stock stock(@PathVariable String name);

    @GetMapping("/stock/{id}")
    Stock stockById(@PathVariable String id);

    @GetMapping("/stock/{name}/{date}")
    Stock stock(
            @PathVariable String name,
            @PathVariable String date
    );

    @GetMapping("/stock") //cotações da mesma moeda
    List<Stock> cotacoes(
            @RequestParam String name,
            @RequestParam String ini,
            @RequestParam String fim
    );
}
