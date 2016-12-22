/**
 * 
 */
package com.mycompany.example_mvn_archetype_quickstart.final_part2_generics_ParthRana.section1;

/**
 * @author Parth
 *  @param <T>
 *
 */
public class MyGenericContainerClass<T> implements MyGenericContainerlnterface<T> {

	/**
	 * 
	 */
private T contained;
	
	public MyGenericContainerClass(T _contained) 
	{
		contained = _contained;
		// TODO Auto-generated constructor stub
	}
	
	public T getContained() 
	{
		// TODO Auto-generated method stub
		return contained;
	}

}
