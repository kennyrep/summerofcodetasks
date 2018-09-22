package com.makotojava.intro;
import java.math.BigDecimal;
public class Employee extends Person {
	
	private String taxpayerIdentificationNumber;
	private String employeeNumber;
    private BigDecimal salary;

	public Employee() {
		super();
		
	}

	public Employee(String name, int age, int height, int weight,
			String department, String gender) {
		super(name, age, height, weight, department, gender);
	}
	
	  public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getTaxpayerIdentificationNumber() {
		    return taxpayerIdentificationNumber;
		  }
		  public void setTaxpayerIdentificationNumber(String taxpayerIdentificationNumber) {
		    this.taxpayerIdentificationNumber = taxpayerIdentificationNumber;
		  }

		@Override
		public void printAudit(StringBuilder buffer) {
			// TODO Auto-generated method stub
			super.printAudit(buffer);
			buffer.append("TaxpayerIdentificationNumber=");
			buffer.append(getTaxpayerIdentificationNumber());
		    buffer.append(","); buffer.append("EmployeeNumber=");
			buffer.append(getEmployeeNumber());
			buffer.append(","); buffer.append("Salary=");
			buffer.append(getSalary().setScale(2).toPlainString());
			buffer.append(toString());
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime
					* result
					+ ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
			result = prime * result
					+ ((salary == null) ? 0 : salary.hashCode());
			result = prime
					* result
					+ ((taxpayerIdentificationNumber == null) ? 0
							: taxpayerIdentificationNumber.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (employeeNumber == null) {
				if (other.employeeNumber != null)
					return false;
			} else if (!employeeNumber.equals(other.employeeNumber))
				return false;
			if (salary == null) {
				if (other.salary != null)
					return false;
			} else if (!salary.equals(other.salary))
				return false;
			if (taxpayerIdentificationNumber == null) {
				if (other.taxpayerIdentificationNumber != null)
					return false;
			} else if (!taxpayerIdentificationNumber
					.equals(other.taxpayerIdentificationNumber))
				return false;
			return true;
		}

		@Override
		public String toString() {
			 return super.toString() + "Employee [taxpayerIdentificationNumber="
					+ taxpayerIdentificationNumber + ", employeeNumber="
					+ employeeNumber + ", salary=" + salary + "]";
		}
		
}
