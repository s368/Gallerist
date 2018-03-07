package main;

public class ListTypeJava<T> 
{
	 private T localt;
	  
	 public T get() 
	 {
		return this.localt;
	 }
	  
	 public void set(T plocal) 
	 {
		this.localt = plocal;
	 }
}
