package pl.wojciechlangowski.peopledbweb.web.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.wojciechlangowski.peopledbweb.web.model.NbpCurrency;
import pl.wojciechlangowski.peopledbweb.web.model.NbpCurrencyViewModel;
import pl.wojciechlangowski.peopledbweb.web.model.NbpRatesArray;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.stream.Collectors;

public class NbpCurrencyEntityService {
    public List<NbpCurrencyViewModel> getNbpCurrencyEntityList() throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create("http://api.nbp.pl/api/exchangerates/tables/a/")).GET().build();
        HttpResponse<String> json = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        ObjectMapper objectMapper = new ObjectMapper();

        NbpRatesArray[] nbpRatesArray = objectMapper.readValue(json.body(), NbpRatesArray[].class);

        //dostałem się na 1 poziom tablicy
        NbpRatesArray nbpRatesArray1 = nbpRatesArray[0];

        // następnie pobieram listę obiektów rates tej tablicy stąd lista przyjmuje typ NbpCurrency
        List<NbpCurrency> rates = nbpRatesArray1.getRates();

        String effectiveDate = nbpRatesArray1.getEffectiveDate();



        //tworze listę która przyjmuje NbpCurrencyViewModel utworzoną z pól listy NbpRatesArray oraz NbpCurrency
//        List<NbpCurrencyViewModel> collect = rates.stream().map(dupa -> new NbpCurrencyViewModel(dupa.getCode(), dupa.getMid())).collect(Collectors.toList());

        List<NbpCurrencyViewModel> collect = rates.stream().map(dupa -> new NbpCurrencyViewModel(dupa.getCode(), dupa.getMid(),nbpRatesArray1.getTable(), nbpRatesArray1.getNo(), nbpRatesArray1.getEffectiveDate())).collect(Collectors.toList());

//        return collect.stream().filter(d->d.code().equals("EUR")).toList();
        return collect;

    }


}




