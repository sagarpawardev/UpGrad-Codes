public enum ActionType {

    FLY(Fly::new);

    private final PlayerA<TheMagician> constructor;

    ActionType(PlayerA<TheMagician> constructor) {
        this.constructor = constructor;
    }

    public PlayerA<TheMagician> getConstructor() {
        return this.constructor;
    }
}