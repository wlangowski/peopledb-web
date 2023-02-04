package pl.wojciechlangowski.peopledbweb.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wojciechlangowski.peopledbweb.web.service.NbpCurrencyEntityService;

import java.io.IOException;

@Controller
@RequestMapping("/api/nbpcurrency")
public class NbpCurrencyController {
    @GetMapping
    public String getNbpCurrencyByCode(Model model) throws IOException, InterruptedException {
        NbpCurrencyEntityService nbpCurrencyEntityService = new NbpCurrencyEntityService();
        model.addAttribute( "message", nbpCurrencyEntityService.getNbpCurrencyEntityList());
        return "nbpcurrency";
    }
}
