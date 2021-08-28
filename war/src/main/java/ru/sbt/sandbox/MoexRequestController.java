package ru.sbt.sandbox;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.sbt.sandbox.entity.InputDate;

import javax.validation.Valid;

@Controller
public class MoexRequestController {
//    private final StockDataPipeline stockDataPipeline;
//
//    public MoexRequestController(StockDataPipeline stockDataPipeline) {
//        this.stockDataPipeline = stockDataPipeline;
//    }

    @RequestMapping(method = RequestMethod.GET, path = "/request")
    public String getDataByDate(@Valid @ModelAttribute("inputDate") InputDate inputDate) {
        return "WEB-INF/view/requestData";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/result")
    public String getResult(@Valid @ModelAttribute("inputDate") InputDate inputDate) throws InterruptedException {
//        if (inputDate.isRange()) {
//            System.out.println(stockDataPipeline.rangePipeline(inputDate.getStartDate(), inputDate.getEndDate()));
//        } else if (!(inputDate.isRange())) {
//            System.out.println(stockDataPipeline.rangePipeline(inputDate.getSingleDate()));
//        } else {
//            System.out.println("Некорректный аргумент");
//        }

        return "WEB-INF/view/resultData";
    }
}
