package personal.xuzj157.stocksyn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import personal.xuzj157.stocksyn.service.CalculatorService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Resource
    CalculatorService calculatorService;

    @GetMapping("/getRandomUnit")
    public void genRandom() {
        calculatorService.getRandomUnit();
    }

    @GetMapping("/calculator")
    public void calculator(@RequestParam int times) {
        calculatorService.calculator(times);
    }
}