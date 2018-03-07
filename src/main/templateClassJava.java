package main;

public class templateClassJava {
	public static void main(String[] args) 
	{
		// Creating a generic List collection
		ListTypeJava<String> lststr = new ListTypeJava<>();
		lststr.set("First String");
		System.out.println(lststr.get());
		  
		ListTypeJava<Integer> lstint = new ListTypeJava<>();
		lstint.set(1);
		System.out.println(lstint.get());
	 }
}
