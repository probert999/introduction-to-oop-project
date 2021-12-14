public abstract class Bird {

  protected String name;
  protected String color;

  public Bird(String name, String color) {
    this.name = name;
    this.color = color;
  }

  //This method is marked with Abstract keyword
  //This means that any classes extending on Bird must implement this
  //Abstract methods don't have a method body
  public abstract void speak();

  public void fly() {
    System.out.println("Hi there! I can fly.");
  }
}
