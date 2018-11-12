package Practice.Practice;

import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class Reflection_Generics {
  @Test
  public <T extends Integer> int f(T a)  {
	  
	  System.out.println("Am in f");
	  return 20;
	  
	 // list.add(2);
	  
  }
  @Test
  public void g() {
	  System.out.println("Am in g");
	  int i = f(10);
	  h(30);
	  h("dssadf");
	  h(10.33);
	  System.out.println("i:"+i);
	  
  }
 
  public <T> void h(T b) {
	  System.out.println("Am in h and value"+b);
  }
  @Test
  public void i() {
	  System.out.println("Am in i");
  }
  @BeforeMethod
  public void beforeMethod(Method method) throws ClassNotFoundException 
  {
	  Class clazz = Class.forName("Practice.Practice.Reflection_Generics");
	  System.out.println(clazz.getDeclaredMethods().length);
	  
	  System.out.println(method.getName());
	  System.out.println(method.getModifiers());
	  System.out.println(method.getParameters());
  }

}
