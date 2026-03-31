package day1DataTypes;

public class DataTypes_Assignment {

	public static void main (String[] args)
	{
		
		// Problem 1 Student marks conversion system
		float marks = 87.6f;
		System.out.println(marks);
		double marksdb =  marks;
		System.out.println(marksdb);
		
		int marksint = (int)marks;
		System.out.println(marksint);
		
		char chmarks = (char)marksint;
		System.out.println(chmarks);
		
		
		//Problem 2
		
		char value1 = 'A';
		int valueint=value1;
		System.out.println(valueint);
		int value2=valueint + 5;
		char value3= (char)(value2);
		System.out.println(value3);
	}
	
}
