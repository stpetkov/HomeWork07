package Task01;

public class Professor extends Person {
	public Professor(String firstName, String lastName, int age, int profExp, String title) {
		super(firstName, lastName, age, profExp);
		this.title = title;
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
	public void setProfExp(int profExp) {
		// TODO Auto-generated method stub
		super.setProfExp(profExp);
	}
	public void info() {
		System.out.print(
				"Professor [title=" + title + ", getProfExp()=" + getProfExp() + ", getTitle()=" + getTitle() + "]");
	}
	public void checkHomework() {
		System.out.print("Homework ready");
	}
	public void examStart() {
		System.out.print("Let the exam begin ?");
	}
	@Override
	public int getProfExp() {
		// TODO Auto-generated method stub
		return super.getProfExp();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String title;
}
