package main

class testShuffle {
	
	public static def aaa = 1..10;
	public static def bbb = [1,2,3,4,5,6,7,8,9,10];
	public static def ccc = new LinkedList<String>(["A","B","C"]);
	
	public static void main(args)
	{

		//aaa.swap(0,9);
		println(aaa.class);
		println(bbb.class);

		Collections.shuffle(ccc);	

		for(item in ccc)
		{
			println("item = " + item);
		}
	}

}
