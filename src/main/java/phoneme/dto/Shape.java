package phoneme.dto;

import phoneme.generator.Sounds;

import java.util.ArrayList;
import java.util.List;

public class Shape {

    private final List<String> soundNames;
    private final int count;
    private final int primaryIndex;

    public Shape(List<String> sounds, int count, int primaryIndex) {
        this.soundNames = sounds;
        this.count = count;
        this.primaryIndex = primaryIndex;
    }

    public List<String> getSounds() {
        return soundNames;
    }

    public int getCount() {
        return count;
    }

    public int getPrimaryIndex() {
        return primaryIndex;
    }

    public List<Sound> instantiateSounds() {
        List<Sound> sounds = new ArrayList<Sound>(soundNames.size());
        for (String s: soundNames) {
            sounds.add(Sounds.getSoundByName(s));
        }
        return sounds;
    }
}
