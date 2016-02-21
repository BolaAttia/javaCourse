class NewStudent {
	public static void main(String[] args) {
		int SsName=0;

		DataSet ds = new DataSet();
		studentArray[SsNum] = new Student();
		for (int i=0;i<ds.getLength() ;i++ ) {
			

			studentArray[SsName].setName 			(	ds.getName(i)		);
			studentArray[SsName].setState 			(	ds.getState(i)		);
			studentArray[SsName].setAcademicNumber	(	ds.getAcNumber(i)	);
			studentArray[SsName].setAcademicYear	(	ds.getAcYear(i)		);
			studentArray[SsName].setStudentDivesion	(	ds.getDivesion(i)	);

			SsNum++;
		}
		ds.fillRandomResults();
		
		for(int i=0;i<10;i++){
			for(int j=0;j<5;j++){
				for(int k=0;k<14;k++){
					studentArray[i].setResultsFromDataSet(j,k,ds.getResult(i,j,k));
				}
			}
		}
	}












/*	void enterCourses(int[] chooseYear, String[] chooseDepartment) {

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
}*/

}