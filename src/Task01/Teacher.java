package Task01;

public class Teacher extends Person {
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
