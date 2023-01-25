package pl.wojciechlangowski.peopledbweb.web.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.wojciechlangowski.peopledbweb.web.model.LEMentity;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class LEMgetDataRequest {
    private String lemUri = "https://riverdi-lem.herokuapp.com/api/lineorder/";
    private String lemAuthorizationKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjI1ZjM5NDliNTMwYzAwMWZmYjQ3ZTkiLCJpYXQiOjE2NDY2NTQzNzYzMDN9.X3tvfka2zIcZj1hdNxj0htqH2HWBXnf1JaktE7dmGK8";
    private byte minLineNumber = 1;
    private byte maxLineNumber = 11;

    public List<LEMentity> LEMgetData() throws IOException, InterruptedException, URISyntaxException {

        ObjectMapper objectMapper = new ObjectMapper();
        List<LEMentity> lemEntityList = new ArrayList<>();
        HttpResponse httpResponse = null;
        for (int i = minLineNumber; i <= maxLineNumber; i++) {
            StringBuilder uriBuilder = new StringBuilder(lemUri);
            if (i < 10) {
                uriBuilder.append("0").append(i);
            } else uriBuilder.append(i);

            HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI(uriBuilder.toString())).header("authorization", lemAuthorizationKey).timeout(Duration.ofSeconds(10)).GET().build();
            httpResponse = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofString());
            LEMentity lemEntity = objectMapper.readValue(httpResponse.body().toString(), LEMentity.class);
            lemEntityList.add(lemEntity);

        }
//        System.out.println("Wysłane z obiektu: " + lemEntityList);
        return lemEntityList;

    }

//    public HttpClient makeClient() {
//        HttpClient client = HttpClient.newHttpClient();
//        return client;
//    }
//
//    public HttpRequest buildRequest() throws URISyntaxException {
//        HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI(lemUri)).header("authorization", lemAuthorizationKey).timeout(Duration.ofSeconds(10)).GET().build();
//        return httpRequest;
//    }
//
//    public HttpResponse makeResponse() throws URISyntaxException, IOException, InterruptedException {
//        HttpResponse httpResponse;
//        httpResponse = makeClient().send(buildRequest(), HttpResponse.BodyHandlers.ofString());
//        return httpResponse;
//    }

}
