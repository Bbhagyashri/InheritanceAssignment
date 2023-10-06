package InheritanceAssignment;

class Fruit {
    private int numberOfFruits;

    public Fruit(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }

    public int getNumberOfFruits() {
        return numberOfFruits;
    }

    public void setNumberOfFruits(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }
}

class Apples extends Fruit {
    private int numberOfApples;

    public Apples(int numberOfApples) {
        super(numberOfApples);
        this.numberOfApples = numberOfApples;
    }

    public int getNumberOfApples() {
        return numberOfApples;
    }

    public void setNumberOfApples(int numberOfApples) {
        this.numberOfApples = numberOfApples;
    }
}

class Mangoes extends Fruit {
    private int numberOfMangoes;

    public Mangoes(int numberOfMangoes) {
        super(numberOfMangoes);
        this.numberOfMangoes = numberOfMangoes;
    }

    public int getNumberOfMangoes() {
        return numberOfMangoes;
    }

    public void setNumberOfMangoes(int numberOfMangoes) {
        this.numberOfMangoes = numberOfMangoes;
    }
}

public class FruitBasket {
    public static void main(String[] args) {
        Apples apples = new Apples(10);
        Mangoes mangoes = new Mangoes(5);

        int totalFruits = apples.getNumberOfFruits() + mangoes.getNumberOfFruits();
        int totalApples = apples.getNumberOfApples();
        int totalMangoes = mangoes.getNumberOfMangoes();

        System.out.println("Number of apples: " + totalApples);
        System.out.println("Number of mangoes: " + totalMangoes);
        System.out.println("Total number of fruits: " + totalFruits);
    }
}
