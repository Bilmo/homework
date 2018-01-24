package lesson10;

public enum Dresses {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    },

    XS(34), S(36), M(38), L(40);
    private int evroSize;

    Dresses(int evroSize) {
        this.evroSize = evroSize;
    }

    public int getEvroSize() {
        return evroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}
