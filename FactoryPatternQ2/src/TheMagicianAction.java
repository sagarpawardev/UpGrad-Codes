public class TheMagicianAction {

    public static TheMagician Action (ActionType type) {
        return type.getConstructor().get();
    }
}