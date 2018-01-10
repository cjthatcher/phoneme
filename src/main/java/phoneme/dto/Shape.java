package phoneme.dto;

import java.util.List;

public class Shape {

    private final List<String> sounds;
    private final int count;
    private final int primaryIndex;

    public Shape(List<String> sounds, int count, int primaryIndex) {
        this.sounds = sounds;
        this.count = count;
        this.primaryIndex = primaryIndex;
    }

    public List<String> getSounds() {
        return sounds;
    }

    public int getCount() {
        return count;
    }

    public int getPrimaryIndex() {
        return primaryIndex;
    }
}
