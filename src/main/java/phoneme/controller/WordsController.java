package phoneme.controller;


import org.springframework.web.bind.annotation.*;
import phoneme.dto.Shape;
import phoneme.generator.WordGenerator;

import java.util.Arrays;
import java.util.List;

@RestController
public class WordsController {

@RequestMapping(method= RequestMethod.POST, name="/words")
    public List<String> getWords(@RequestBody Shape shape) {
        return WordGenerator.generateWords(shape);
    }
}
