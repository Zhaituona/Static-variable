package StaticMethod;

public class TestStudent {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.studentID();
		st1.studentAge();
		Student.studentID();
		
		SuperStudent st2 = new SuperStudent();
		st2.studentID();
		SuperStudent.studentID();

	}

}
