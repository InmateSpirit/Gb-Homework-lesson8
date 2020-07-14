package prev;

public class Plate {
    private int capacity;
    private int size;

    public Plate(int capacity, int size) {
        this.capacity = capacity;
        if (size > capacity) {
            System.out.println(String.format("Too much food, we can put only %s", capacity));
            this.size = capacity;
        } else {
            this.size = size;
        }
    }

    public boolean reduce(int requestedSize) {
        if (requestedSize > size) {
            System.out.println(
                    String.format(
                            "There is no enough food: requested size - %s, remaining size - %s, capacity - %s", requestedSize, size, capacity
                    )
            );
            return false;
        }

        size -= requestedSize;
        System.out.println(String.format("Animal was fed: remaining size - %s, capacity - %s", size, capacity));
        return true;
    }

    public void addFood(int size) {
        if (size > this.capacity) {
            System.out.println(String.format("Too much food, we can put only %s", this.capacity));
            this.size = capacity;
        } else {
            this.size = size;
        }

        System.out.println(
                String.format(
                        "There is no enough food: remaining size - %s, capacity - %s",
                        this.size, this.capacity
                )
        );
    }
}
