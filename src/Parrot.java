public class Parrot extends Bird {

  public Parrot(String name, String color) {
    super(name, color);
  }

  @Override
  public void speak() {
    System.out.println("Squawk-a-doodle-do I'm " + name + " and I'm a " + color + " parrot.");
  }
}
