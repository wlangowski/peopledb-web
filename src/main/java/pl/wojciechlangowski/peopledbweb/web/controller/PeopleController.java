package pl.wojciechlangowski.peopledbweb.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wojciechlangowski.peopledbweb.web.biz.model.Person;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @GetMapping
    public String getPeople(Model model) {
        List<Person> people = List.of(
                new Person(10l, "Wojciech", "Langowski", LocalDate.of(1983, 7, 16), new BigDecimal(14000)),
                new Person(20l, "Marta", "Langowska", LocalDate.of(1985, 8, 20), new BigDecimal(5500)),
                new Person(30l, "Nadia", "Langowska", LocalDate.of(2013, 2, 19), new BigDecimal(10)),
                new Person(40l, "Michalina", "Langowska", LocalDate.of(2014, 2, 19), new BigDecimal(10))
        );

        model.addAttribute("people", people);
        return "people";
    }
}
