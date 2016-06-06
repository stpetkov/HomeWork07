package Task01;

public class Person {
	public Person(String firstName, String lastName, int age, int profExp) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.profExp = profExp;
		count++;
	}

	private String firstName;
	private String lastName;
	private int age;
	private int profExp;
	static int count=0;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getProfExp() {
		return profExp;
	}

	public void setProfExp(int profExp) {
		if (profExp > 0) {
			this.profExp = profExp;
		} else {
			System.out.print("Wrong professional experience");
		}
	}
}
