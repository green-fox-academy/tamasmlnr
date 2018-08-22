public abstract class Animal {

  public String name;
  public int age;
  public int legs;
  public int cutenessFactor;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract String breed();
  public abstract String bodyCoveredBy();
  public abstract String environent();

}

