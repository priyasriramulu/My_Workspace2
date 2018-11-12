package Practice.Practice;

import java.util.ArrayList;

public class Generics <T extends String>
{

	T ob;
	Generics g;
	static Juice Liquid;
	public static void main(String[] args) 
	{
		Generics<String> obj = new Generics<String>("sdd");
		System.out.println(" Obj type"+obj.getClass().getName());
		ArrayList<String> List = new ArrayList<String>();
		//List.add(10);
	//	List.add(20.50);
		List.add("test");
		List.add("Sample");
		List.add("testing");
		
		Object var = List.get(1);
		System.out.println(var);
		var = List.get(2);
		System.out.println(var);
		Liquid = new Juice();
		// TODO Auto-generated method stub
		
		ArrayList list1 = new ArrayList();
		list1.add("ddf");
		list1.add("dsadf");
		
		m1(list1);

	}
	
	public void add(Object o)
	{
		
	}
	
	public Object get(int index)
	{
		return null;
	}
	
	public interface WebDriver
	{
		
	}
	public  Generics(T ob)
	{
		this.ob = ob;
	}
	public T get()
	{
		return this.ob;
		
	}
	public static  void m1(ArrayList<?> List)
	
	{
		//List.add("sdd");
		String fin = (String) List.get(0) + List.get(1);
		System.out.println(fin);
		System.out.println(List);
	}

}
