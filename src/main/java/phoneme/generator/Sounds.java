package phoneme.generator;

import phoneme.dto.Sound;

import java.util.HashMap;
import java.util.Map;

public class Sounds {

    private static final Map<String, Sound> soundMap = new HashMap<String, Sound>();

    public static Sound getSoundByName(String name) {
        initMap();
        return soundMap.get(name);
    }

    private static void initMap() {
        if (soundMap.isEmpty()) {
            Sound consonants = new Sound("Consonant", "b","c","d","f","g","h","j","k","k","m","n","p","q","r","s","t","v","w","x","y","z");
            soundMap.put(consonants.getName(), consonants);

            Sound vowels = new Sound("Vowels", "a","e","i","o","u");
            soundMap.put(vowels.getName(), vowels);
        }
    }


}
