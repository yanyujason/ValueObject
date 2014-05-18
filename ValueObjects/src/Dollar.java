/**
 * Created by yyan on 5/15/14.
 */
public class Dollar {
    private final int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollar dollar = (Dollar) o;

        if (amount != dollar.amount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    public int getAmount() {
        return amount;
    }
}
