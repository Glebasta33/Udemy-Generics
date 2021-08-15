public class Main {
    public static void main(String[] args) {
        Basket<Fruit> fruitBasket = new Basket<>();
        fruitBasket.add(new Apple());
        fruitBasket.add(new Orange());
        System.out.println(fruitBasket.getWeight());

        Basket<Orange> orangeBasket = new Basket<>();
        orangeBasket.add(new Orange());

        System.out.println(fruitBasket.compare(orangeBasket));
    }
}
