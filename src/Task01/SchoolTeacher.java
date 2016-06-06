package Task01;

import java.util.Arrays;

public class SchoolTeacher extends Teacher {
	@Override
	public void checkHomework() {
		// TODO Auto-generated method stub
		super.checkHomework();
	}

	public void funKids(){
		System.out.print("FuNNNNNnnNNnNN");
	}
	
	public String[] getWhichClass() {
		return whichClass;
	}

	public void setWhichClass(String[] whichClass) {
		this.whichClass = whichClass;
	}

	public SchoolTeacher(String[] whichClass) {
		super();
		this.whichClass = whichClass;
	}

	public void showClass() {
		System.out.print("SchoolTeacher [whichClass=" + Arrays.toString(whichClass) + "]");
	}

	private String[] whichClass = new String[5];
}
