package Task01;

public class Professor extends Person {
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
