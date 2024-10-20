package br.com.jsolutions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspectJ {
	@Before("execution(public String Monitored.getMessage(..))")
	public void getMessageBefore() {
		System.out.println("Executing before monitored class");
	}
}