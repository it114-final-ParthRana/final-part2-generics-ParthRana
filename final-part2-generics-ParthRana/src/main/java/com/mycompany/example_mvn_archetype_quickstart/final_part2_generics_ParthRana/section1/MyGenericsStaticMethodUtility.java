package com.mycompany.example_mvn_archetype_quickstart.final_part2_generics_ParthRana.section1;


import java.util.Collection;

/**
 * @author Parth
 * @param <T>
 *
 */
public class MyGenericsStaticMethodUtility
{

	/**
	 * 
	 */
	public MyGenericsStaticMethodUtility() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static<T> T add2Collection(T e, Collection<T> collect)
	{
		collect.add(e);
		return e;
	}

}
