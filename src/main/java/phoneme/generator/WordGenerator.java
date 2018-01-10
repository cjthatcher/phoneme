package phoneme.generator;

import phoneme.dto.Shape;
import phoneme.dto.Sound;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class WordGenerator {

    public static List<String> generateWords(Shape shape) {

        Set<String> words = new HashSet<String>();
        List<Sound> sounds = shape.instantiateSounds();

        for (int i = 0; i < shape.getCount(); i++) {
            StringBuilder word = new StringBuilder();

            for (Sound sound : sounds) {
                word.append(sound.getRandomPhoneme());
            }
            words.add(word.toString());
        }

        return new LinkedList<String>(words);
    }

}
