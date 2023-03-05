package Data;
public enum Difficulty {
    VERY_EASY("very_easy"),
    VERY_HARD("very_hard"),
    IMPOSSIBLE("impossible");
    private final String name;
    Difficulty(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
