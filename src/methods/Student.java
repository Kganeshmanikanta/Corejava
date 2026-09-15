package methods;

// With return type and with parameters with out Scanner class
public class Student {
	int claculateTotalMarks(int tel, int hin, int eng, int maths, int sci, int soc) {
		int total = tel + hin + eng + maths + sci + soc;
		return total;
	}

	int languagesMarks(int tel, int hin, int eng) {
		int languagesTotal = tel + hin + eng;
		return languagesTotal;
	}

	int mainSubjectMarks(int maths, int sci, int soc) {
		int mainTotal = maths + sci + soc;
		return mainTotal;

	}

	double percentage(int total) {
		float percentage = (total * 100) / 600;
		return percentage;

	}

	String grade(double percentage) {
		String g;
		if (percentage > 95) {
			g = "O";
		} else {
			g = "A";
		}
		return g;

	}

	String StudentDetails(String name, int id, byte age) {
		String details = "Name:" + name + "\n" + "ID:" + id + "\n" + "Age:" + age;
		return details;
	}

	double attendance(int attendedClasses, int totalClasses) {
		double attendance = (attendedClasses / totalClasses) * 100;
		return attendance;
	}

	String collegeDetails(String colName, String branch) {
		String details = "College Name:" + colName + "\n" + "Branch:" + branch;
		return details;
	}

	String personalDetails(long ph, char gender, String email) {
		String personal = "Phone Number:" + ph + "\n" + "Gender:" + gender + "\n" + "E-mail:" + email;
		return personal;
	}

	String hobbies(String a, String b, String c) {
		String h = "First Hobby:" + a + "\n" + "Second:" + b + "\n" + "Third:" + c;
		return h;
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("Main Method Started");
		int t = 98;
		int h = 98;
		int e = 98;
		int m = 98;
		int sc = 98;
		int so = 98;
		String name = "K.Ganesh ManiKanta";
		int id = 599;
		byte a = 21;
		long ph = 9876567899l;
		char gender = 'M';
		String email = "Ganesh8778@gmail.com";
		String h1 = "Cricket";
		String h2 = "VollyBall";
		String h3 = "Gym";

		String colName = "V-Cube";
		String branch = "Java FullStack";
		int totalClasses = 300;
		int presentClasses = 275;
		int total = s.claculateTotalMarks(t, h, e, m, sc, so);
		int langTotals = s.languagesMarks(t, h, e);
		int mainTotals = s.mainSubjectMarks(m, sc, so);
		double per = s.percentage(total);
		String grade = s.grade(per);
		String details = s.StudentDetails(name, id, a);
		double attedance = s.attendance(totalClasses, presentClasses);
		String collegeDetails = s.collegeDetails(colName, branch);
		String personalDetails = s.personalDetails(ph, gender, email);
		String hobbys = s.hobbies(h1, h2, h3);

		System.out.println("Student total Marks:" + total);
		System.out.println("Student Languages Marks:" + langTotals);
		System.out.println("Student Main Subjects Marks:" + mainTotals);
		System.out.println("Student Percentage:" + per);
		System.out.println("Student Grade is:" + grade);
		System.out.println("Student Details:\n" + details);
		System.out.println("Student Attendance:" + attedance);
		System.out.println("Student College details:\n" + collegeDetails);
		System.out.println("Student Personal details:\n" + personalDetails);
		System.out.println("Student Hobbies:\n" + hobbys);
		System.out.println("Main Method Ended");
	}

}
