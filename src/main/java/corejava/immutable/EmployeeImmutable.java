package corejava.immutable;

import java.util.Date;

/**
 * Create a final class. Set the values of properties using constructor only.
 * Make the properties of the class final and private Do not provide any setters
 * for these properties. If the instance fields include references to mutable
 * objects, don't allow those objects to be changed: Don't provide methods that
 * modify the mutable objects. Don't share references to the mutable objects.
 * Never store references to external, mutable objects passed to the
 * constructor; if necessary, create copies, and store references to the copies.
 * Similarly, create copies of your internal mutable objects when necessary to
 * avoid returning the originals in your methods.
 */

public final class EmployeeImmutable {

	private final int empid;
	private final Date doj;
	private int hash;

	public EmployeeImmutable(int empid, Date doj) {
		this.empid = empid;
		// Repaired constructor - makes defensive copies of parameters
		this.doj = new Date(doj.getTime());
	}

	public int getEmpid() {
		return empid;
	}

	/**
	 * Defensive copy so that caller can not change doj
	 * 
	 * @return
	 */
	public Date getDoj() {
		return new Date(doj.getTime());
	}

	// cache the hash
	@Override
	public int hashCode() {
		int result = hash;
		if (result == 0) {
			final int prime = 31;
			result = prime * result + ((doj == null) ? 0 : doj.hashCode());
			result = prime * result + empid;
			hash = result;
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeImmutable other = (EmployeeImmutable) obj;
		if (doj == null) {
			if (other.doj != null)
				return false;
		} else if (!doj.equals(other.doj))
			return false;
		if (empid != other.empid)
			return false;
		return true;
	}

	public static void main(String[] args) {

	}
}
