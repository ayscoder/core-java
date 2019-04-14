package corejava.dp.creational.builder;

public class BuildEmployee {

	private int empId;
	private String empName;
	private String address;

	public static class Builder {
		private int empId;
		private String empName;

		private String address;

		public Builder(int id, String name) {
			this.empId = id;
			this.empName = name;
		}

		public Builder address(String address) {
			this.address = address;
			return this;
		}

		public BuildEmployee build() {
			return new BuildEmployee(this);
		}
	}

	public BuildEmployee(Builder builder) {
		this.empId = builder.empId;
		this.empName = builder.empName;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "EmployeeBuilderDP [empId=" + empId + ", empName=" + empName
				+ ", address=" + address + "]";
	}

	public static void main(String[] args) {
		BuildEmployee empWithoutAddress = new BuildEmployee.Builder(1, "Ayush")
				.build();
		System.out.println(empWithoutAddress);

		BuildEmployee empWithAddress = new BuildEmployee.Builder(1, "Ayush")
				.address("Bangalore").build();
		System.out.println(empWithAddress);
	}
}
