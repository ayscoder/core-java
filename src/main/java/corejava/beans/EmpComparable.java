package corejava.beans;

import java.util.Set;
import java.util.TreeSet;

public class EmpComparable implements Comparable<EmpComparable> {
	private int id;
	private String name;

	public EmpComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		EmpComparable other = (EmpComparable) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(EmpComparable o) {
		if (this.name.compareTo(o.getName()) > 1)
			return 1;
		if (this.name.compareTo(o.getName()) < 1)
			return -1;
		return 0;

//		if (new Integer(id).compareTo(o.getId()) > 1)
//			return 1;
//		if (new Integer(id).compareTo(o.getId()) < 1)
//			return -1;
//		return 0;
	}

	public static void main(String[] args) {
		Set<EmpComparable> s = new TreeSet<>();
		s.add(new EmpComparable(11, "Z"));
		s.add(new EmpComparable(2, "A"));
		System.out.println(s);
	}

}
