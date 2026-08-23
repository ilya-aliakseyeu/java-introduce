public class Person {
  String firstName;
  String lasName;
  int age;

  public Person(String firstName, String lasName, int age) {
    this.firstName = firstName;
    this.lasName = lasName;
    this.age = age;
  }

  public void introduce() {
    System.out.println("Привет, меня зовут " + firstName + " " + lasName + ". Мне " + age + " лет.");
  }

  public static void main(String[] args) {
    Person person = new Person("Илья", "Алексеев", 28);
    person.introduce();
  }
}
