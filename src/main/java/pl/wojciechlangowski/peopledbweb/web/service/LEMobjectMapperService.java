package pl.wojciechlangowski.peopledbweb.web.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.wojciechlangowski.peopledbweb.web.model.LemEntityModel;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class LEMobjectMapperService {
    public void mapLemEntity(String leMgetResponse) throws IOException, InterruptedException, URISyntaxException {
        List<LemEntityModel> lemEntities = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        LemEntityModel leMentity = objectMapper.readValue(leMgetResponse, LemEntityModel.class);
        lemEntities.add(leMentity);
    }
}
