import java.util.Scanner;
class Student {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String name=null;
	String[] governorate = {"Menofia","Gharbia","Qalubia"}; 
	int academicNumber=0;
	int year = 0;
	String[] department= {"Computer Engineering","Comunication Engineering","Automation Control"};
	String[] courses= new String [4];
	float result=0;
	for(String i : department)
		{
			System.out.println(i);
		}
	for(String i : governorate)
		{
			System.out.println(i);
		}
 	System.out.println("1. Enter Courses");
 	System.out.println("2. Enter Data");
 	System.out.println("3. Enter Degree");
 	System.out.println("4. Print result for all years");
 	System.out.println("5. Print Spesfic Year Result");
 	System.out.println("6. Print AlphabetOrder");
 	System.out.println("7. Print Result Order");
 	System.out.println("8. Print Governorate Order");
 		int choice = 0;
 		String chosen ;
  		loop:  while(scan.hasNextInt()) { 
  				choice=scan.nextInt();
  				switch (choice) {
  					case 0: break loop;
 					case 1 :
 					System.out.println("enter student name");
 					name=enterName;
 					
 					if(chooseGovernorate>3){System.out.println("Error");}
 					eslse {
 						for (int i=0;i<chooseGovernorate ;i++ ) {
 							governorateOut=governorate[i];
 						}
 					}
			
 					academicNumber=enterAcademicNumber;
			
 					year=enterYear;
			
 					if(chooseDepartment>3){System.out.println("Error");}
 					else { 		
 						for (int i=0;i<chooseDepartment ;i++ ) {
 							departmentOut=department[i];
 						}
 					}
 					break;
 					case 2 :
 					System.out.println();
 					chooseAcademicNumber=scan.nextInt();
 				 		if(chooseAcademicNumber==academicNumber)
 							for (int i=0;i<resultS ; i++) {
 								outResult[i]=result[i];
 							}
 					break;
 					case 3 :
 					System.out.println();
 					break;
 					case 4 :
 					System.out.println();
 					break;
 					case 5 :
 					System.out.println();
 					break;
 					case 6 :
 					System.out.println();
 					break;
 					case 7 :
 					System.out.println();
 					break;
 					case 8 :
 						chosen = "Menofia";
							if (governorate==chosen) {
								for(float i : result) {
									if(i<(i+1)) {
										System.out.println(i);
									}
								}
							}
	 					break;
 					default:
 					System.out.println("error");
 						break;
 			}
 		}
	} 
}