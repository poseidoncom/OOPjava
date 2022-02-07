import java.io.Serializable;

//---------------
//Employee.java
//---------------
/*
 * Base class for employee class hierarchy
 */
@SuppressWarnings("serial")
public abstract class Employee implements Serializable{

    private String name;
    
    public Employee() {}

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
		this.name = name;
	}

	public abstract double calculateSalary();
}