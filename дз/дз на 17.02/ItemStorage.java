public class ItemStorage<T> {
    private T value;

    public ItemStorage(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue(T value) {
        return value;
    }

    public void compareWith(T otherValue) {
        if (otherValue == null || this.value == null) {
            System.out.println("Опачки гадэм ватафа. Рецензия пепе невозможна шнене.");
        } else if (otherValue == this.value) {
            System.out.println("Нуууу ватафа, значения ж индентичны");
        } else {
            System.out.println("False");
        }

    }
}

