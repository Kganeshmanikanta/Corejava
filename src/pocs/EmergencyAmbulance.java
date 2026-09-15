package pocs;

import java.util.Scanner;

public class EmergencyAmbulance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("**********EMERGENCY RESPONSE SYSTEM**********");
		String yn = "";
		
		do {
			String emergencyName = "";
			String ambName="";
			String hospitalName="";
			String status="";
			boolean isApproved=false;
		
			System.out.println("Enter Patient Name:");
			String pname = sc.nextLine();
			System.out.println("Enter Patient Age:");
			int age = sc.nextInt();
			System.out.println("*****Emergency Type*****");
			System.out.println("1->Accident");
			System.out.println("2->Heart Emergency");
			System.out.println("3->Breathing Problem");
			System.out.println("4->Fire Accident");
			System.out.println("5->Others");
			int etype = sc.nextInt();
			sc.nextLine();
			switch (etype) {
			case 1 -> {
				emergencyName = "Accident";
				System.out.println("*****Patient Condition*****");
				System.out.println("1->Critical");
				System.out.println("2->Serious");
				System.out.println("3->Stable");
				System.out.println("Enter Condidtion:");
				int con = sc.nextInt();
				if (con == 1) {
					System.out.println("Priority:1");
					System.out.println("Status:Immediate Response Required!");
					status="Critical";

				} else if (con == 2) {
					System.out.println("Priority:2");
					System.out.println("Status:Respond As soon As Possible!");
					status="Serious";

				} else if (con == 3) {
					System.out.println("Priority:3");
					System.out.println("Status:Respond fast!");
					status="Stable";

				} else {
					System.out.println("Invalid");
				}
				String ayn = "";
				boolean isSutableAmbulance;
				do {
					System.out.println("*****Ambulance*****");
					System.out.println("1->BLS");
					System.out.println("2->ALS");
					System.out.println("3->ICU");
					System.out.println("Select Ambulance:");
					int amb = sc.nextInt();
					if (con == 1 && amb == 1 || con == 1 && amb == 2) {
						System.out.println("Not Suitable need ICU!");
					
						isSutableAmbulance=false;
					} else if (con == 2 && amb == 1) {
						System.out.println("Not Suitable need ALS!");
					
						isSutableAmbulance=false;

					} else {
						System.out.println("Suitable!");
						isSutableAmbulance=true;
						if(amb==1) {
							 ambName="BASIC LIFE SUPPORT ";

						}else if(amb==2) {
							 ambName="ADVANCE LIFE SUPPORT ";

						}else if(amb==3) {
							 ambName="ICU";

						}else {
							System.out.println("Invalid name");
						}
						
					}
					

				} while (!isSutableAmbulance);
				String hyn = "";
				boolean isHospital=false;
				do {
					System.out.println("Select Hospital!");
					System.out.println("1->LifeCare");
					System.out.println("2->Apollo");
					System.out.println("3->WaterDrop");
					System.out.println("4->Care");
					System.out.println("5->Boom");
					int h = sc.nextInt();
					switch (h) {
					case 1 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Life Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Life Care";
						}else {
							System.out.println("Invalid");
						}

					}
					case 2 -> {
						if(con==2||con==3) {
							System.out.println("Apollo Hospital!");
							System.out.println("ICU: Not Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Apollo";

						}else {
							System.out.println("Invalid");
							isHospital=false;
							System.out.println("Choose Other Hospital:");
						}
						


					}
					case 3 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Water Drop Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Water Drop";

						}else {
							System.out.println("Invalid");
						}


					}
					case 4 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Care";

						}else {
							System.out.println("Invalid");
						}


					}
					case 5 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Boom Hospital!");
							System.out.println("ICU:Not Available");
							System.out.println("Normal:Not Available");
							
							isHospital=false;
							hospitalName="Boom";

							System.out.println("Choose Other Hospital:");
						}else {
							System.out.println("Invalid");
						}

						

					}
					default -> {
						System.out.println("Invalid Hospital!");
					}
					}
					

				} while (!isHospital);
				
				if(isHospital&&isSutableAmbulance) {
					System.out.println("Approved");
					isApproved=true;
				}else {
					System.out.println("Not Approved");
					isApproved=false;
				}

			}
			case 2 -> {
				emergencyName = "Heart Emergency";
				System.out.println("*****Patient Condition*****");
				System.out.println("1->Critical");
				System.out.println("2->Serious");
				System.out.println("3->Stable");
				System.out.println("Enter Condidtion:");
				int con = sc.nextInt();
				if (con == 1) {
					System.out.println("Priority:1");
					System.out.println("Status:Immediate Response Required!");
					status="Critical";

				} else if (con == 2) {
					System.out.println("Priority:2");
					System.out.println("Status:Respond As soon As Possible!");
					status="Serious";

				} else if (con == 3) {
					System.out.println("Priority:3");
					System.out.println("Status:Respond fast!");
					status="Stable";

				} else {
					System.out.println("Invalid");
				}
			
				boolean isSutableAmbulance;
				do {
					System.out.println("*****Ambulance*****");
					System.out.println("1->BLS");
					System.out.println("2->ALS");
					System.out.println("3->ICU");
					System.out.println("Select Ambulance:");
					int amb = sc.nextInt();
					if (con == 1 && amb == 1 || con == 1 && amb == 2) {
						System.out.println("Not Suitable need ICU!");
					
						isSutableAmbulance=false;
					} else if (con == 2 && amb == 1) {
						System.out.println("Not Suitable need ALS!");
					
						isSutableAmbulance=false;

					} else {
						System.out.println("Suitable!");
						isSutableAmbulance=true;
						if(amb==1) {
							 ambName="BASIC LIFE SUPPORT ";

						}else if(amb==2) {
							 ambName="ADVANCE LIFE SUPPORT ";

						}else if(amb==3) {
							 ambName="ICU";

						}else {
							System.out.println("Invalid name");
						}
						
					}
					

				} while (!isSutableAmbulance);
				
				boolean isHospital=false;
				do {
					System.out.println("Select Hospital!");
					System.out.println("1->LifeCare");
					System.out.println("2->Apollo");
					System.out.println("3->WaterDrop");
					System.out.println("4->Care");
					System.out.println("5->Boom");
					int h = sc.nextInt();
					switch (h) {
					case 1 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Life Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Life Care";
						}else {
							System.out.println("Invalid");
						}

					}
					case 2 -> {
						if(con==2||con==3) {
							System.out.println("Apollo Hospital!");
							System.out.println("ICU: Not Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Apollo";

						}else {
							System.out.println("Invalid");
							isHospital=false;
							System.out.println("Choose Other Hospital:");
						}
						


					}
					case 3 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Water Drop Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Water Drop";

						}else {
							System.out.println("Invalid");
						}


					}
					case 4 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Care";

						}else {
							System.out.println("Invalid");
						}


					}
					case 5 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Boom Hospital!");
							System.out.println("ICU:Not Available");
							System.out.println("Normal:Not Available");
							
							isHospital=false;
							hospitalName="Boom";

							System.out.println("Choose Other Hospital:");
						}else {
							System.out.println("Invalid");
						}

						

					}
					default -> {
						System.out.println("Invalid Hospital!");
					}
					}
					

				} while (!isHospital);
				
				if(isHospital&&isSutableAmbulance) {
					System.out.println("Approved");
					isApproved=true;
				}else {
					System.out.println("Not Approved");
					isApproved=false;
				}
			}
			case 3 -> {
				emergencyName="Breathing Problem";
				System.out.println("*****Patient Condition*****");
				System.out.println("1->Critical");
				System.out.println("2->Serious");
				System.out.println("3->Stable");
				System.out.println("Enter Condidtion:");
				int con = sc.nextInt();
				if (con == 1) {
					System.out.println("Priority:1");
					System.out.println("Status:Immediate Response Required!");
					status="Critical";

				} else if (con == 2) {
					System.out.println("Priority:2");
					System.out.println("Status:Respond As soon As Possible!");
					status="Serious";

				} else if (con == 3) {
					System.out.println("Priority:3");
					System.out.println("Status:Respond fast!");
					status="Stable";

				} else {
					System.out.println("Invalid");
				}
				String ayn = "";
				boolean isSutableAmbulance;
				do {
					System.out.println("*****Ambulance*****");
					System.out.println("1->BLS");
					System.out.println("2->ALS");
					System.out.println("3->ICU");
					System.out.println("Select Ambulance:");
					int amb = sc.nextInt();
					if (con == 1 && amb == 1 || con == 1 && amb == 2) {
						System.out.println("Not Suitable need ICU!");
					
						isSutableAmbulance=false;
					} else if (con == 2 && amb == 1) {
						System.out.println("Not Suitable need ALS!");
					
						isSutableAmbulance=false;

					} else {
						System.out.println("Suitable!");
						isSutableAmbulance=true;
						if(amb==1) {
							 ambName="BASIC LIFE SUPPORT ";

						}else if(amb==2) {
							 ambName="ADVANCE LIFE SUPPORT ";

						}else if(amb==3) {
							 ambName="ICU";

						}else {
							System.out.println("Invalid name");
						}
						
					}
					

				} while (!isSutableAmbulance);
				
				boolean isHospital=false;
				do {
					System.out.println("Select Hospital!");
					System.out.println("1->LifeCare");
					System.out.println("2->Apollo");
					System.out.println("3->WaterDrop");
					System.out.println("4->Care");
					System.out.println("5->Boom");
					int h = sc.nextInt();
					switch (h) {
					case 1 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Life Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Life Care";
						}else {
							System.out.println("Invalid");
						}

					}
					case 2 -> {
						if(con==2||con==3) {
							System.out.println("Apollo Hospital!");
							System.out.println("ICU: Not Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Apollo";

						}else {
							System.out.println("Invalid");
							isHospital=false;
							System.out.println("Choose Other Hospital:");
						}
						


					}
					case 3 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Water Drop Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Water Drop";

						}else {
							System.out.println("Invalid");
						}


					}
					case 4 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Care";

						}else {
							System.out.println("Invalid");
						}


					}
					case 5 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Boom Hospital!");
							System.out.println("ICU:Not Available");
							System.out.println("Normal:Not Available");
							
							isHospital=false;
							hospitalName="Boom";

							System.out.println("Choose Other Hospital:");
						}else {
							System.out.println("Invalid");
						}

						

					}
					default -> {
						System.out.println("Invalid Hospital!");
					}
					}
					

				} while (!isHospital);
				
				if(isHospital&&isSutableAmbulance) {
					System.out.println("Approved");
					isApproved=true;
				}else {
					System.out.println("Not Approved");
					isApproved=false;
				}
				
			}
			case 4 -> {
				emergencyName="Fire Accident";
				System.out.println("*****Patient Condition*****");
				System.out.println("1->Critical");
				System.out.println("2->Serious");
				System.out.println("3->Stable");
				System.out.println("Enter Condidtion:");
				int con = sc.nextInt();
				if (con == 1) {
					System.out.println("Priority:1");
					System.out.println("Status:Immediate Response Required!");
					status="Critical";

				} else if (con == 2) {
					System.out.println("Priority:2");
					System.out.println("Status:Respond As soon As Possible!");
					status="Serious";

				} else if (con == 3) {
					System.out.println("Priority:3");
					System.out.println("Status:Respond fast!");
					status="Stable";

				} else {
					System.out.println("Invalid");
				}
				
				boolean isSutableAmbulance;
				do {
					System.out.println("*****Ambulance*****");
					System.out.println("1->BLS");
					System.out.println("2->ALS");
					System.out.println("3->ICU");
					System.out.println("Select Ambulance:");
					int amb = sc.nextInt();
					if (con == 1 && amb == 1 || con == 1 && amb == 2) {
						System.out.println("Not Suitable need ICU!");
					
						isSutableAmbulance=false;
					} else if (con == 2 && amb == 1) {
						System.out.println("Not Suitable need ALS!");
					
						isSutableAmbulance=false;

					} else {
						System.out.println("Suitable!");
						isSutableAmbulance=true;
						if(amb==1) {
							 ambName="BASIC LIFE SUPPORT ";

						}else if(amb==2) {
							 ambName="ADVANCE LIFE SUPPORT ";

						}else if(amb==3) {
							 ambName="ICU";

						}else {
							System.out.println("Invalid name");
						}
						
					}
					

				} while (!isSutableAmbulance);
				
				boolean isHospital=false;
				do {
					System.out.println("Select Hospital!");
					System.out.println("1->LifeCare");
					System.out.println("2->Apollo");
					System.out.println("3->WaterDrop");
					System.out.println("4->Care");
					System.out.println("5->Boom");
					int h = sc.nextInt();
					switch (h) {
					case 1 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Life Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Life Care";
						}else {
							System.out.println("Invalid");
						}

					}
					case 2 -> {
						if(con==2||con==3) {
							System.out.println("Apollo Hospital!");
							System.out.println("ICU: Not Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Apollo";

						}else {
							System.out.println("Invalid");
							isHospital=false;
							System.out.println("Choose Other Hospital:");
						}
						


					}
					case 3 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Water Drop Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Water Drop";

						}else {
							System.out.println("Invalid");
						}


					}
					case 4 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Care";

						}else {
							System.out.println("Invalid");
						}


					}
					case 5 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Boom Hospital!");
							System.out.println("ICU:Not Available");
							System.out.println("Normal:Not Available");
							
							isHospital=false;
							hospitalName="Boom";

							System.out.println("Choose Other Hospital:");
						}else {
							System.out.println("Invalid");
						}

						

					}
					default -> {
						System.out.println("Invalid Hospital!");
					}
					}
					

				} while (!isHospital);
				
				if(isHospital&&isSutableAmbulance) {
					System.out.println("Approved");
					isApproved=true;
				}else {
					System.out.println("Not Approved");
					isApproved=false;
				}
				
			}
			case 5 -> {
				emergencyName="Other";
				System.out.println("*****Patient Condition*****");
				System.out.println("1->Critical");
				System.out.println("2->Serious");
				System.out.println("3->Stable");
				System.out.println("Enter Condidtion:");
				int con = sc.nextInt();
				if (con == 1) {
					System.out.println("Priority:1");
					System.out.println("Status:Immediate Response Required!");
					status="Critical";

				} else if (con == 2) {
					System.out.println("Priority:2");
					System.out.println("Status:Respond As soon As Possible!");
					status="Serious";

				} else if (con == 3) {
					System.out.println("Priority:3");
					System.out.println("Status:Respond fast!");
					status="Stable";

				} else {
					System.out.println("Invalid");
				}
			
				boolean isSutableAmbulance;
				do {
					System.out.println("*****Ambulance*****");
					System.out.println("1->BLS");
					System.out.println("2->ALS");
					System.out.println("3->ICU");
					System.out.println("Select Ambulance:");
					int amb = sc.nextInt();
					if (con == 1 && amb == 1 || con == 1 && amb == 2) {
						System.out.println("Not Suitable need ICU!");
					
						isSutableAmbulance=false;
					} else if (con == 2 && amb == 1) {
						System.out.println("Not Suitable need ALS!");
					
						isSutableAmbulance=false;

					} else {
						System.out.println("Suitable!");
						isSutableAmbulance=true;
						if(amb==1) {
							 ambName="BASIC LIFE SUPPORT ";

						}else if(amb==2) {
							 ambName="ADVANCE LIFE SUPPORT ";

						}else if(amb==3) {
							 ambName="ICU";

						}else {
							System.out.println("Invalid name");
						}
						
					}
					

				} while (!isSutableAmbulance);
				
				boolean isHospital=false;
				do {
					System.out.println("Select Hospital!");
					System.out.println("1->LifeCare");
					System.out.println("2->Apollo");
					System.out.println("3->WaterDrop");
					System.out.println("4->Care");
					System.out.println("5->Boom");
					int h = sc.nextInt();
					switch (h) {
					case 1 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Life Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Life Care";
						}else {
							System.out.println("Invalid");
						}

					}
					case 2 -> {
						if(con==2||con==3) {
							System.out.println("Apollo Hospital!");
							System.out.println("ICU: Not Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Apollo";

						}else {
							System.out.println("Invalid");
							isHospital=false;
							System.out.println("Choose Other Hospital:");
						}
						


					}
					case 3 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Water Drop Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Water Drop";

						}else {
							System.out.println("Invalid");
						}


					}
					case 4 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Care Hospital!");
							System.out.println("ICU:Available");
							System.out.println("Normal:Available");
							isHospital=true;
							hospitalName="Care";

						}else {
							System.out.println("Invalid");
						}


					}
					case 5 -> {
						if(con==1||con==2||con==3) {
							System.out.println("Boom Hospital!");
							System.out.println("ICU:Not Available");
							System.out.println("Normal:Not Available");
							
							isHospital=false;
							hospitalName="Boom";

							System.out.println("Choose Other Hospital:");
						}else {
							System.out.println("Invalid");
						}

						

					}
					default -> {
						System.out.println("Invalid Hospital!");
					}
					}
					

				} while (!isHospital);
				
				if(isHospital&&isSutableAmbulance) {
					System.out.println("Approved");
					isApproved=true;
				}else {
					System.out.println("Not Approved");
					isApproved=false;
				}
				
			}

			}
			System.out.println("**********Ambulance Dispatch Result**********");
			System.out.println("Patient Name        :"+pname);
			System.out.println("Patient Age         :"+age);
			System.out.println("Emergency Type      :"+emergencyName);
			System.out.println("Codition            :"+status);
			System.out.println("Ambulance Type      :"+ambName);
			System.out.println("Hospital Name       :"+hospitalName);
			if(isApproved) {
				System.out.println("Staus           :Approved");
			}else {
				System.out.println("Staus           :Not Approved");

			}
			System.out.println("Another Emergency?");
			System.out.println("Y-yes or N-no");
			yn=sc.next();
			sc.nextLine();


			

			

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Exited!");
		sc.close();

	}

}
