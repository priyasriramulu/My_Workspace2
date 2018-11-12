package Practice.Practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Reflection {
	int i=20;
	String s ="hello world";
	
	public Reflection()
	{
		
	}
	
	public Reflection(int i)
	{
		
	}
	private Reflection(String s)
	{
		
	}

	public void m1()
	{
		
	}
	
	public String m2()
	{
		return "hello world";
		
	}
	public static void main(String[] args) throws ClassNotFoundException 
	{
		// TODO Auto-generated method stub
		Reflection ref = new Reflection();
		Class clazz = Class.forName("Practice.Practice.Reflection");
		System.out.println("Method:"+clazz.getDeclaredMethods().length);
		System.out.println(clazz.getName());
		Constructor[] construct = clazz.getDeclaredConstructors();
		
		
		System.out.println(construct.length);
		for(Constructor c:construct)
		{
			System.out.println(Modifier.isPrivate(c.getModifiers()));
			Parameter[] param= (c.getParameters());
			for (Parameter p : param)
			{
				System.out.println(p.getParameterizedType());
			}
		}
		
	}

}
