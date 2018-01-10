package phoneme.controller;

import phoneme.dto.Sound;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class SoundController {

    @RequestMapping(method = GET, path = "/sounds")
    public List<Sound> getSounds() {
        List<Sound> sounds = new ArrayList<Sound>(6);

        Sound consonant = new Sound("Consonant", "b","c","d","f","g","h","j","k","k","m","n","p","q","r","s","t","v","w","x","y","z");
        Sound vowel = new Sound("vowel", "a","e","i","o","u");

        sounds.add(consonant);
        sounds.add(vowel);

        return sounds;
    }



}
