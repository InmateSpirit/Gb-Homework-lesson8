package prev;

public class Cat {
    private String name;
    private boolean isFed;

    public Cat(String name) {
        this.name = name;
        isFed = false;
    }

    public void eat(Plate plate, int mealSize) {
        boolean isDone = plate.reduce(mealSize);
        if (isDone) {
            System.out.println("Cat aet successfully");
            isFed = true;
        } else {
            System.out.println("Cat did not eat");
            isFed = false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", isFed=" + isFed +
                '}';
    }
}
