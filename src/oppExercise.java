public class oppExercise {

  public static void main(String[] args) {
    Pigeon pippa = new Pigeon("Pippa", "Grey");
    pippa.speak();
    pippa.fly();
    pippa.eatPizza();

    Penguin pingu = new Penguin("Pingu", "Black & White");
    pingu.speak();
    pingu.fly();

    Parrot roger = new Parrot("Roger", "Red & Yellow");
    roger.speak();
    roger.fly();
  }
}
