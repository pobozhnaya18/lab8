package application;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExtractorService {
    @Autowired
    Extractor extractor;

    @GetMapping(path = "get-value-at-pos-end-minus-offset")
    public int getValueAtPosEndMinusOffset(@RequestBody JSONObject object) {
        return extractor.getValueAtPosEndMinusOffset((List<Integer>)object.get("values"),(int)object.get("offset"));
    }
}
