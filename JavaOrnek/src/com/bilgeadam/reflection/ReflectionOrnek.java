package com.bilgeadam.reflection;

import java.lang.reflect.Method;

public class ReflectionOrnek {
	public static void main(String[] args) {
		try
		{
			Class cls = Class.forName("com.bilgeadam.reflection.Ornek");
			    for( Method m : cls.getDeclaredMethods())
			    {
			    	System.out.println("Metod Ismi : "+m.getName() +
			    	   " Metodun dönüş Tipi : "+m.getReturnType() +
			           " Parametre Sayısı "+m.getParameterCount());
			    }
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
}
