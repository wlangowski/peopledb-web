package pl.wojciechlangowski.peopledbweb.web.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.wojciechlangowski.peopledbweb.web.model.LEMentity;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class LEMobjectMapper {
    public void mapLemEntity(String leMgetResponse) throws IOException, InterruptedException, URISyntaxException {
        List<LEMentity> lemEntities = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        LEMentity leMentity = objectMapper.readValue(leMgetResponse, LEMentity.class);
        lemEntities.add(leMentity);
    }
}
