class StudentData {
	String name=null;
	String[] governorate = {"Menofia","Gharbia","Qalubia"}; 
	int academicNumber=0;
	int year = 0;
	String[] department= {"Computer Engineering","Comunication Engineering","Automation Control"};
	String[] courses= new String [4];
	float result=0;
	String departmentOut=null;
	String governorateOut=null;
	int[] outResult;
 	void enterData(String enterName, int chooseGovernorate,int enterAcademicNumber, int enterYear, int chooseDepartment) {
 		name=enterName;
 		
 		if(chooseGovernorate>3){System.out.println("Error");}
 		else {
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

 	}
	void enterCourses(int[] chooseYear, String[] chooseDepartment) {

	}
 	void enterDegree(int chooseAcademicNumber,int resultS, int[] result) {
 		if(chooseAcademicNumber==academicNumber)
 			for (int i=0;i<resultS ; i++) {
 				outResult[i]=result[i];
 			}
 	}
 	void printResultAllYears(String enterName) {
 		if (enterName==name) {
 			for (int i : outResult) {
 				System.out.println(i);
 			}
 		} else {System.out.println("Try Again");}
 	}
 	void printSpecificYearResult(String enterName ,int enterYear) {
 		if (enterName==name) {
 			if (enterYear==year) {
 				for (int i : outResult) {
 					System.out.println(i);
 				}
 			} else {System.out.println("Try Again");}
 		} else {System.out.println("Try Again");}
 	}
 	void printAlphabetOrder() {

 	}
 	void printResultOrder() {

 	}
 	void printGovernorateOrder() {

 	}
}