package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ya to akele baithaa karo nhi to unko bolo pdte time distrub mt kiya kro
		
		

		// there are two way we can create instance by ioc contianer
		// 1 BeanFactory
		// 2 applicationContext
		
		
		// 1 BeanFactory
		//Resource resource=new ClassPathResource("applicationContext.xml");  // read xml file
	//	BeanFactory factory = new XmlBeanFactory(resource);// create beans(Object) of employee 
		
	// 2  Create object by ApplicationContex
	    ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml"); 
	
		
		
		Employee emp=(Employee)context.getBean("emp");
		
		
			///	Employee emp =new Employee();
		//<bean id="stu" class="com.spring.Employee"></bean>
				
				
		
		/*Employee emp1=new Employee(101, "Bam Bam", "Bhole", "00000000", "bambambhole@gmail.com");
		Employee  radha =new Employee(101, "Radhey", "Radhey", "000000001", "shreeradhey@gmail.com");
		Employee krishan=new Employee(101, "Jay Shree ", "Krishna", "000000002", "shreekrishan@gmail.com");
		Employee waheguru=new Employee(101, "wahe", "guru", "000000001", "wahegur@gmail.com");
		
		*/
		
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getFname());
		System.out.println(emp.getLname());
		System.out.println(emp.getMobile());
		System.out.println(emp.getEmail());
		
		
		
		
		
		/*emp.setEmail("komal123@gmail.com");
		emp.setEmpid(101);
		emp.setFname("Komal");
		emp.setLname("Tardeja");
		emp.setMobile("8888738983");
		
		System.out.println(emp.getEmail());
		System.out.println(emp.getFname());
		System.out.println(emp.getEmpid());
		System.out.println(emp.getMobile());
		System.out.println(emp.getLname());*/
		
		
		
		//System.out.println("komal--------"+resource);
	   
	}

}
