package Task01;

public class Main {

	public static void main(String[] args) {
		String[] classes={"2A", "2B", "3C", "2C", "3B"};
		Teacher teacher=new Teacher("Stefan","Karadja",25,12,"Mathematics");
		Teacher teacher1=new Teacher("Krali Marko","Ivanov",10,34,"Bulgarian");

		Professor professor=new Professor("Filip","Totio",10,23,"UNSS");

		System.out.println("The number of instances is: "+ Person.count);
		
		System.out.println("Teacher: ");
		teacher.sayHello();
		teacher.sayGoodbye();
		
		System.out.println();
		
		System.out.println("Teacher1: ");
		teacher1.sayHello();
		teacher.sayGoodbye();
		
		System.out.println();

		System.out.println("Professor: ");
		professor.info();
		System.out.println();
		professor.checkHomework();
		System.out.println();
		professor.examStart();
		System.out.println();
	}


	}


