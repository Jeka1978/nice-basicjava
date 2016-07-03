package shay;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

/**
 * Created by Jeka on 03/07/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = "{'name' : 'mkyong'}";

//JSON from file to Object
        ObjectDefinition s = mapper.readValue(new File("data.json"), ObjectDefinition.class);
        System.out.println(s);


    }
}
