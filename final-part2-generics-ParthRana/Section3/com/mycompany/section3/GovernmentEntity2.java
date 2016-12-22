/**
 * 
 */
package com.mycompany.section3;

import com.mycompany.section2.HasGovernor;
import com.mycompany.section2.HasName;

/**
 * @author Parth
 *
 */
public class GovernmentEntity2<T> implements HasGovernor<T>, HasName {

	/* (non-Javadoc)
	 * @see com.mycompany.section2.HasName#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section2.HasGovernor#getGovernor()
	 */
	public T getGovernor() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.section2.HasGovernor#getGovernorName()
	 */
	public String getGovernorName() {
		// TODO Auto-generated method stub
		return null;
	}

}
