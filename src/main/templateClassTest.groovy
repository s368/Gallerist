package main

class templateClassTest 
{
	static void main(String[] args) 
	{
		// Creating a generic List collection
		ListType<String> lststr = new ListType<>();
		lststr.set("First String");
		println(lststr.get());
		lststr.set("Second String");
		println(lststr.get());
		lststr.set("Third String");
		println(lststr.localt);

		ListType<Integer> lstint = new ListType<>();
		lstint.set(1);
		println(lstint.get());
	 }
}
  
public class ListType<T> 
{
	 public List<T> localt = new LinkedList<T>();
	  
	 public T get() 
	 {
		return this.localt.last();
	 }
	  
	 public void set(T plocal) 
	 {
		this.localt.add(plocal);
	 }
}
