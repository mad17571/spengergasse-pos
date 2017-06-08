package daten;

public class Student {
	public Student(String name, int age) {
		setName(name);
		setAge(age);
		this.age = age;
	}
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (!(name instanceof String) || name.equals("")) {
			System.out.println("Ung�ltiger Name!");
			return;
		}
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age <= 5 || age >= 25) {
			System.out.println("Ung�ltiger Ageswert!");
			return;
		}
		this.age = age;
	}
	
	public void print() {
		System.out.println(this);
	}

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }
}
