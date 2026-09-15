package methods;

import java.util.Scanner;

public class Hospital {
	static String getPatientName(String name) {
		return name;
	}
	static int getPatientId(int id) {
		return id;
	}
	static byte getPatientAge(byte age) {
		return age;
	}
	static char getPatientGender(char gender) {
		return gender;
	}
	static String getBloodGroup(String bloodGroup) {
		return bloodGroup;
	}
	static String getDoctorName(String doctor) {
		return doctor;
	}
	static String getDepartment(String department) {
		return department;
	}
	static String getDisease(String disease) {
		return disease;
	}
	static String getHospitalName(String hospital) {
		return hospital;
	}
	static String getCity(String city) {
		return city;
	}
	static long getPhoneNumber(long phone) {
		return phone;
	}
	static String getEmail(String email) {
		return email;
	}
	static double getConsultationFee(double fee) {
		return fee;
	}
	static double getMedicineCost(double cost) {
		return cost;
	}
	static int getRoomNumber(int room) {
		return room;
	}
	static boolean getPatientStatus(boolean status) {
		return status;
	}
	static boolean checkAge(int age) {
		boolean age1=true;
		return age1;
	}
	static boolean checkPayment(boolean paid) {
		boolean py=true;
		return py;
	}
	static String getAppointmentType(String type) {
		return type;
	}
	
	static String getPatientStatus(String status) {
		return status;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Patient Details:");
		System.out.println("Enter Patient Name:");
		String name=s.nextLine();
		System.out.println("Enter Patient Id:");
		int id=s.nextInt();
		System.out.println("Enter Patient Age:");
		byte age=s.nextByte();
		System.out.println("Enter Patient Gender:");
		char gender=s.next().charAt(0);
		s.nextLine();
		System.out.println("Enter Patient Blood Group:");
		String bg=s.nextLine();
		System.out.println("Enter Doctor Name :");
		String dn=s.nextLine();
		System.out.println("Enter Department:");
		String d=s.nextLine();
		System.out.println("Enter Your Problem:");
		String p=s.nextLine();
		System.out.println("Enter Hospital Name:");
		String hn=s.nextLine();
		System.out.println("Enter City :");
		String c=s.nextLine();
		System.out.println("Enter Phone Number :");
		long pn=s.nextLong();
		s.nextLine();
		System.out.println("Enter E-mail :");
		String e=s.nextLine();
		System.out.println("Enter Fee :");
		double fee=s.nextDouble();
		System.out.println("Enter Medicine Cost :");
		double mc=s.nextDouble();
		System.out.println("Enter Room Number :");
		int room=s.nextInt();
		System.out.println("Enter Status :");
		boolean st=s.nextBoolean();
		System.out.println("Checking Age :");
		int ca=s.nextInt();
		System.out.println("Checking  Payment Status :");
		boolean ps=s.nextBoolean();
		s.nextLine();
		System.out.println("Enter Appointment type :");
		String ap=s.nextLine();
		System.out.println("Enter Patient Status:");
		String pas=s.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Patient Details:");
		System.out.println("Name:"+getPatientName(name));
		System.out.println("ID:"+getPatientId(id));
		System.out.println("Age:"+getPatientAge(age));
		System.out.println("Gender:"+getPatientGender(gender));
		System.out.println("Blood Group:"+getBloodGroup(bg));
		System.out.println("DoctorName:"+getDoctorName(dn));
		System.out.println("Department:"+getDepartment(d));
		System.out.println("Problem:"+getDisease(p));
		System.out.println("Hospital Name:"+getHospitalName(hn));
		System.out.println("City:"+getCity(c));
		System.out.println("Phone Number:"+getPhoneNumber(pn));

		System.out.println("Email:"+getEmail(e));

		System.out.println("ConsultationFee:"+getConsultationFee(fee));

		System.out.println("Medicine cost:"+getMedicineCost(mc));

		System.out.println("Room Number:"+getRoomNumber(room));

		System.out.println("Patient Status:"+getPatientStatus(st));

		System.out.println("Age check:"+checkAge(ca));

		System.out.println("Payment Checking:"+checkPayment(ps));

		System.out.println("Appointment Type:"+getAppointmentType(ap));

		System.out.println("Patient Status:"+getPatientStatus(pas));



		s.close();

	}

}
