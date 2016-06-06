package Task01;

public class CollegeTeacher extends Teacher {
public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
public CollegeTeacher(String collegeName) {
		super();
		CollegeName = collegeName;
	}
@Override
	public void checkHomework() {
		// TODO Auto-generated method stub
		super.checkHomework();
	}
private String CollegeName;
public void scienceArticles(){
	System.out.print("Boooring");
}
}
