package pl.wojciechlangowski.peopledbweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wojciechlangowski.peopledbweb.web.service.LemEntityService;

import java.io.IOException;

@Controller
@RequestMapping("/lemproductstatistics")
public class LemProductStatisticsController  {
    @GetMapping()
    public String getData(Model model) throws IOException, InterruptedException {
        LemEntityService lemEntityService = new LemEntityService();
        model.addAttribute("message", lemEntityService.getLemEntityList());
        return "lemproductstatistics";
    }



}

