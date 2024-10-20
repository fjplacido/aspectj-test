package br.com.jsolutions.annotations;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Francisco");
		Class<Cliente> myClass = (Class<Cliente>) cliente.getClass();
		Method methods[] = myClass.getMethods();
		for (Method method : myClass.getDeclaredMethods()) {
			System.out.println(method.getName());
		}
		System.out.println(myClass.getName());
		System.out.println(myClass.getName());
	}

}
