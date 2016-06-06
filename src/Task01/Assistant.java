package Task01;

public class Assistant extends Person {
	public void infoAss() {
		System.out.print("Assistant [mainAss=" + mainAss + ", getMainAss()=" + getMainAss() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + "]");
	}
	public void examCheck() {
		System.out.print("Let me check ur exam ?");
	}
	public void checkHomework() {
		System.out.print("Where is your homework ?");
	}
	public Assistant(String mainAss) {
		super();
		this.mainAss = mainAss;
	}

	public String getMainAss() {
		return mainAss;
	}

	public void setMainAss(String mainAss) {
		this.mainAss = mainAss;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}

	String mainAss = "mainAssistant";
}
