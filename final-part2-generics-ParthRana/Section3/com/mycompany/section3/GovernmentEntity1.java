/**
 * 
 */
package com.mycompany.section3;

import com.mycompany.section2.HasCapital;
import com.mycompany.section2.HasName;

/**
 * @author Parth
 *
 */
public class GovernmentEntity1<T> implements HasCapital<T>, HasName {

	/* (non-Javadoc)
	 * @see com.mycompany.section2.HasName#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section2.HasCapital#getCapital()
	 */
	public T getCapital() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section2.HasCapital#getCapitalName()
	 */
	public String getCapitalName() {
		// TODO Auto-generated method stub
		return null;
	}

}
