package main;

public class templateClassJava {
	public static void main(String[] args) 
	{
		// Creating a generic List collection
		ListType<String> lststr = new ListType<>();
		lststr.set("First String");
		System.out.println(lststr.get());
		System.out.println(lststr.localt);
		  
		ListTypeJava<Integer> lstint = new ListTypeJava<>();
		lstint.set(1);
		System.out.println(lstint.get());
	 }
}
