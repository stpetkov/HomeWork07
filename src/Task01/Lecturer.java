package Task01;

public class Lecturer extends Person {
	protected int maxLecturesPW = 10;

	public int getMaxLectures() {
		return maxLecturesPW;
	}

	public void setMaxLecturesPW(int maxLecturesPW) {
		this.maxLecturesPW = maxLecturesPW;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Lecturer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lecturer(String university) {
		super();
		this.university = university;
	}

	private String university;

	public void checkHomework() {
		System.out.print("Homework missing");
	}

	public void train(String teach, int hours) {

	}

	public void train(int a, int b) {

	}

	public void train(int c, int d, int f) {

	}

	public void sayHello() {
		System.out.print(" Hello,good day !");
	}
}
