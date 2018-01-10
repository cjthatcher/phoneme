package phoneme.controller;

import phoneme.dto.Sound;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import phoneme.generator.Sounds;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SoundController {

    @RequestMapping(method = GET, path = "/sounds")
    public List<Sound> getSounds() {
        List<Sound> sounds = new ArrayList<Sound>(6);

        Sound consonant = Sounds.getSoundByName("Consonant");
        Sound vowel = Sounds.getSoundByName("Vowel");

        sounds.add(consonant);
        sounds.add(vowel);

        return sounds;
    }



}
