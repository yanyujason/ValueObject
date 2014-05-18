public class Euro {

    private final int amount;

    public Euro(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (o instanceof Dollar) {
            return this.amount == ((Dollar) o).getAmount() / 1.2;
        }
        else if(o instanceof Euro) {
            Euro euro = (Euro) o;
            return this.amount == euro.amount;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Euro plus(Euro euro) {
        return new Euro(this.amount + euro.amount);
    }
}
