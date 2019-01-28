package com.bit.di.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        TestBean bean=new TestBean();
//        bean.func01();
//    	GenericXmlApplicationContext gxac =null;
//    	gxac= new GenericXmlApplicationContext("classpath:applicationContext.xml");
//    	BeanInter bean=(BeanInter)gxac.getBean("beanInter");
//    	
//    	bean.func01();
    	
    	// IoC
    	// DI
//    	TestBean10 bean10=new TestBean10(new TestBean());
////    	bean10.setBean(new TestBean2());
//    	bean10.func02();
    	ApplicationContext ac = new GenericXmlApplicationContext("classpath:applicationContext.xml");
    	TestBean10 test=(TestBean10)ac.getBean("testBean");
    	test.func02();
    }
}














