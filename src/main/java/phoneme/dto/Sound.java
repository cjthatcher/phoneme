package phoneme.dto;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sound {

    private final String name;
    private final List<String> phonemes;

    public Sound(String name, String... phonemes) {
        this.name = name;
        this.phonemes = Arrays.asList(phonemes);
    }

    public String getName() {
        return name;
    }

    public List<String> getPhonemes() {
        return phonemes;
    }


    public String getRandomPhoneme() {
        return phonemes.get(new Random().nextInt(phonemes.size()));
    }
}
