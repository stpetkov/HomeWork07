package Task01;

public class Teacher extends Person {
	
	public Teacher(String firstName, String lastName, int age, int profExp, String teachSubject) {
		super(firstName, lastName, age, profExp);
		this.teachSubject = teachSubject;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}

	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}

	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public int getProfExp() {
		// TODO Auto-generated method stub
		return super.getProfExp();
	}

	@Override
	public void setProfExp(int profExp) {
		// TODO Auto-generated method stub
		super.setProfExp(profExp);
	}

	public void checkHomework() {
		
			System.out.print("Homework checked");
		
	}

	public void sayHello() {
		System.out.print(" Hello,good day !");
	}

	public void sayGoodbye() {
		System.out.print(" Goodbye !");
	}

	public String getTeachSubject() {
		return teachSubject;
	}

	public void setTeachSubject(String teachSubject) {
		this.teachSubject = teachSubject;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String teachSubject) {
		super();
		this.teachSubject = teachSubject;
	}

	private String teachSubject;
}
