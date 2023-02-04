package pl.wojciechlangowski.peopledbweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.wojciechlangowski.peopledbweb.web.service.LemEntityService;

import java.io.IOException;

@Controller
@RequestMapping("/api/prodstats/lemproductstatistics")
public class LemProductStatisticsController {
    //        @GetMapping()
//    public String getData(Model model) throws IOException, InterruptedException {
//        LemEntityService lemEntityService = new LemEntityService();
//
//        model.addAttribute("message", lemEntityService.getLemEntityList().stream().sorted(Comparator.comparingInt(value -> -value.getGivenTactTime())));
//        return "lemproductstatistics";
//    }
    @GetMapping()
    public String getPartNumber(Model model, @RequestParam(name = "pn") String partNumber) throws IOException, InterruptedException {
        LemEntityService lemEntityService = new LemEntityService();
        model.addAttribute("message", lemEntityService.getLemEntityList(partNumber));
        return "lemproductstatistics";
    }


}

