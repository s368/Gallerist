package utils

import java.util.List

class Deck<T> 
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
   
   public shuffle()
   {
	   Collections.shuffle(this.localt);
   }

   public T dealOne()
   {
	   return localt.pop();
   }
}

