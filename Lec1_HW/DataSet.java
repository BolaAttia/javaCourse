import java.util.Random;

public class DataSet {
	
	// >> DataSet
	private String Name  [] = {"Ahmed","Mohammad","AboRahma","Ghazala","Khalifa","Kamal","Hossam","Mohey","Fathi","Omar"};
	private int AcNumber [] = {120    ,121       ,122       ,123      ,124      ,125    ,126     ,127    ,128    ,129   };
	private int AcYear   [] = {3      ,3         ,3         ,4        ,4        ,5      ,2       ,2      ,1      ,1     };
	private int State    [] = {1      ,1         ,1         ,1        ,2        ,2      ,2       ,3      ,3      ,3     };
	// States   => 1:3  // 1:Menofia  ,  2:Kalyoubia ,  3:Sharkia 
	private int Divesion [] = {0      ,0         ,0         ,3        ,2        ,1      ,0       ,0      ,0      ,0     };
	// Divesion => 0:3  // 0:General  ,  1:Etisalat  ,  2:Control  ,  3:CSE



	/*  NOTES About the Table
	* 
	* 1-) the Divesion Depends on the Academic Year  if you are in 1,2,3 you are in General Divesion
	* 2-) you only have Results for the Preceding Years Only , meaning that 
	* 	  if you are in the 3rd year you have the 1st and 2nd years Results Only
	* 	  you cannot have 3rd Year Results assuming that the year hasn`t finished yet
	*	  and you cannot have the 4th,5th years Results , For Sure 
	* 
	*/
	
	
	
	
	// Results ,,,
	double [][][] Results = new double [10][5][14];
	
   /* 
    *
	* studentsNum=10  ,  5:Years  ,  14:Course/Year,
	* 10*5*14 = 750 Course for 10 Students 
	* 
	* 
	* double Results[][][]  is a three Dimentional array 
	* think of it as an array of 2D array
	* as previously we descriped it before that the student results is a 2D Array
	* [row][column]  <==>  [year][CourseNumber]
	* NOW we Add another pracket []  which is the [StudentIndex]
	* [StudentIndex][year][CourseNumber]
	* 
	*/
	
	
	
	
	// >> Interface
	public String getName(int i){
		return(Name[i]);
	}
	
	public int getAcNumber(int i){
		return(AcNumber[i]);
	}	
	
	public int getAcYear(int i){
		return(AcYear[i]);
	}
	
	public int getState(int i){
		return(State[i]);
	}
	
	public int getDivesion(int i){
		return(Divesion[i]);
	}	
	
	public int getLength(){
		return (10); // 10 array Length number of Registered Students
	}
	
	
	// Must Run First Filling Random Results
	
	public void fillRandomResults(){
		
		for(int i=0;i<10;i++){
			for(int j=0;j<5;j++){
				for(int k=0;k<14;k++){
					
					if(j < AcYear[i]-1){
						Results[i][j][k] = randInt(50,100);
					}
					else{
						Results[i][j][k] = 0.0;
					}
				
				}
			}
		}
		
	}
	
	private static double randInt(int min, int max) {   // this Function Came Directly From StackOverFlow

    Random rand = new Random();

    double randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
	}
	
	
	// i => Student Index    ,  j => Year  ,  k => Course Number
	// 
	// think of it as it is an array of results 
	// and Results is an array of [j][k] // the first index j : is the year
	// and the second index is the Course Number ( we have 14 course per year )
	
	public double getResult(int i , int j , int k){
		return Results[i][j][k];
	}
	
	
	
}


