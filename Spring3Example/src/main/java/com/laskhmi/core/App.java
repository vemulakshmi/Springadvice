package com.laskhmi.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lakshmi.customer.bo.CustomerBo;

public class App {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/lakshmi/resource/copy/beans.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		//customer.addCustomer();
		
		//customer.addCustomerReturnValue();
		
		//customer.addCustomerThrowException();
		
		customer.addCustomerAround("Lakshmi");

	}
}