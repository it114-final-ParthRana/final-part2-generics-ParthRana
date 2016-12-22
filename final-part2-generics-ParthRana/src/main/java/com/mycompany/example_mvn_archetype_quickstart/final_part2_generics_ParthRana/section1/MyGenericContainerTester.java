/**
 * 
 */
package com.mycompany.example_mvn_archetype_quickstart.final_part2_generics_ParthRana.section1;

/**
 * @author paran
 *
 */
public class MyGenericContainerTester {

public MyGenericContainerTester() 	{
		// TODO Auto-generated constructor stub
	}	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	
	MyGenericContainerlnterface<String> c4String = new MyGenericContainerClass("ilker");
	MyGenericContainerlnterface<Integer> c4Integer = new MyGenericContainerClass(1234);
	
	System.out.println("String Container contains:" + " " + c4String.getContained());
	System.out.println("Integer Container contains:" + " " + c4Integer.getContained());

	}
}
