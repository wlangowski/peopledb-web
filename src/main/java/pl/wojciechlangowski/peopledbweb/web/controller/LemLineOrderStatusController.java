package pl.wojciechlangowski.peopledbweb.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.wojciechlangowski.peopledbweb.web.service.LEMgetDataRequestService;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
@RequestMapping("/lemresponsedata")
public class LemLineOrderStatusController {
    @GetMapping
    public String getPeople(Model model) throws URISyntaxException, IOException, InterruptedException {
//
//        int maxLineNumberInclusive = 11;
//        int minLineNUmberInclusive = 1;
//        String authorizationKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjI1ZjM5NDliNTMwYzAwMWZmYjQ3ZTkiLCJpYXQiOjE2NDY2NTQzNzYzMDN9.X3tvfka2zIcZj1hdNxj0htqH2HWBXnf1JaktE7dmGK8";
//        String siteAddress = "https://riverdi-lem.herokuapp.com/api/lineorder/";
//
//        HttpResponse httpResponse = null;
//        LEMentity LEMdataRow = null;
//        ObjectMapper mapper = new ObjectMapper();
//        List<LEMentity> leMentities = new ArrayList<>();
//        for (int i = minLineNUmberInclusive; i <= maxLineNumberInclusive; i++) {
//            StringBuilder stringBuilder = new StringBuilder(siteAddress);
//            if (i < 10) {
//                stringBuilder.append("0").append(i);
//            } else {
//                stringBuilder.append(i);
//            }
//
//            HttpClient client = HttpClient.newHttpClient();
//
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(new URI(stringBuilder
//                            .toString()))
//                    .header("authorization", authorizationKey)
//                    .timeout(Duration.ofSeconds(10))
//                    .GET()
//                    .build();
//
//            httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
//            LEMdataRow = mapper.readValue(httpResponse.body().toString(), LEMentity.class);
//            leMentities.add(LEMdataRow);
//        }
//        System.out.println("Entity static method: " + leMentities);

        LEMgetDataRequestService leMgetDataRequest = new LEMgetDataRequestService();
        leMgetDataRequest.LEMgetData();


        model.addAttribute("lemresponsedata", leMgetDataRequest.LEMgetData());
//        model.addAttribute("lemresponsedata", leMentities);
        return "lemresponsedata";
    }
}
