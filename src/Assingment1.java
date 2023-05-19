import java.util.Locale;
import java.util.Scanner;
public class Assingment1 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		double max_energyRatioOfProtein=0;			 //declaring parameters to get max value
		int max_id=0;
		int max_age=0;
		
		System.out.println("--------- Statistics Daily Food Intake Calculator ---------\n");
		int i=0;
		for(;;) {
			
		
		System.out.println("If u want to stop the program enter (-1) for either of input :)\n");	//if user enter -1 to any input the program will stop
		
		int id;		//declaring the id
		System.out.print("Please enter the ID: ");		//ask user to enter id
		id=in.nextInt();
		
		if(id==-1) {		//if user enter -1 the program will stop
			System.out.println("\nThe program is closed. ");
			System.out.println("------------------------------------------\n");
			break;
		}
		else {
			
			int age;		//declaring the age
			System.out.print("Please enter the age: ");		//ask user to enter the age
			age=in.nextInt();
			if(age==-1) {
				System.out.println("\nThe program is closed. ");
				System.out.println("------------------------------------------\n");
				break;
			}
			else {
			double carbo;		//declaring carbohydrate
			System.out.print("Please enter the amount of carbohydrate in (grams): ");	//ask user to enter carbohydrate in (grams)
			carbo=in.nextDouble();
			if(carbo==-1) {		//if user enter -1 the program will stop
				System.out.println("\nThe program is closed. ");
				System.out.println("------------------------------------------\n");
				break;
			}
			else {
			double fat;		//declaring fat
			System.out.print("Please enter the amount of fat in (grams): ");		//ask user to enter fat in (grams)
			fat=in.nextDouble();
			if(fat==-1) {		//if user enter -1 the program will stop
				System.out.println("\nThe program is closed. ");
				System.out.println("------------------------------------------\n");
				break;
			}
			else {
			double protein;		//declaring protein
			System.out.print("Please enter the amount of protein in (grams): ");	//ask user to enter protein in (grams)
			protein=in.nextDouble();
			if(protein==-1) {		//if user enter -1 the program will stop
				System.out.println("\nThe program is closed. ");
				System.out.println("------------------------------------------\n");
				break;
			}
			else {
			System.out.println("------------------------------------------");
			i++;
			System.out.println("Information about person ("+i+"): \n");
		
			System.out.println("Total Grams: "+avgGrams(carbo,fat,protein));	//print Average Grams
			System.out.println("Total Calories: "+avgCal(carbo,fat,protein));	//print Average Calories
			
			System.out.println("\nPercent of calories from each macronutrient: \n");
			
			System.out.printf(Locale.US,"Carbohydrate: %.2f%%\n", perCarbo(carbo,fat,protein));	//print the percent of carbohydrate
			System.out.printf(Locale.US,"Fat: %.2f%%\n", perFat(carbo,fat,protein));			//print the percent of fat
			System.out.printf(Locale.US,"Protein: %.2f%%\n", perProtein(carbo,fat,protein));    //print the percent of protein

			
			System.out.printf(Locale.US, "Protein:Energy Ratio : %.2f%%\n", enRatio(carbo,fat,protein));  //print the Energy Ratio of protein
	
			if(enRatio(carbo,fat,protein)>max_energyRatioOfProtein) { 	 //make condition to find the id and age to the person who has a max Protein:Energy Ratio
				max_energyRatioOfProtein=enRatio(carbo, fat, protein);
				max_id=id;
				max_age=age;
			}
			
			System.out.println("\nthe person who has the max (Protein:Energy Ratio) his ID: "+max_id+" ,age: "+max_age);	//print the id and age to the person who 
			System.out.println("-------------------------------------------------------------------------");				//has the max (Protein:Energy Ratio)
			System.out.println("-------------------------------------------------------------------------\n");
						}
					}
				}
			}
		}
	}
	}
	
	public static int avgGrams(double carbo,double fat,double protein) {	//method to get the Average Grams
		int res_Grams=(int) (carbo+fat+protein);
		return res_Grams;
	}
	
	public static int avgCal(double carbo,double fat,double protein) {		//method to get the Average Calories
		int res_Cal=(int) ((carbo*4)+(fat*9)+(protein*4));
		return res_Cal;
	}
	
	public static double perCarbo(double carbo,double fat,double protein) {	//method to get the percent of carbohydrate
		double per_Carbo=(carbo/avgGrams(carbo,fat,protein));
		return per_Carbo*100;
	}
	public static double perFat(double carbo,double fat,double protein) {	//method to get the percent of fat
		double per_Fat=(fat/avgGrams(carbo,fat,protein));
		return per_Fat*100;
	}
	public static double perProtein(double carbo,double fat,double protein) {	//method to get the percent of protein
		double per_Protein=(protein/avgGrams(carbo,fat,protein));
		return per_Protein*100;
	}
	public static double enRatio(double carbo,double fat,double protein) {		//method to get the Energy Ratio of protein
		double en_Ratio=(protein/(carbo+fat));
		return en_Ratio;
	}
}