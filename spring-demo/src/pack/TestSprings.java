package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSprings {

	public static  void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		/*Identifier id = (Identifier)context.getBean("b1");
		id.display();*/
		/*Customer c = (Customer)context.getBean("c1");
		c.getInformations();*/

		bank bank1 = (bank)context.getBean("bank1");
		
		System.out.println(bank1.getLocations());
		

	}

}
