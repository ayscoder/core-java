package corejava.interfaces;

import corejava.beans.Employee;

/**
 * Here I am not going to explain that interface is a keyword in java we will
 * focus on beyond the keyword. Actually interface in java is the core part of
 * programming, it is not for hello world type of application, it is using for
 * abstraction and decoupling concept in java. It is simple object oriented term
 * to define contract or rules and abstraction between producer and consumer for
 * applications.
 * 
 * Advantages or key facts of making use of them in Java
 * 
 * In very basic it allows us for multiple inheritance in java. In Spring
 * Dependency Injection interface is very powerful to run time injection of
 * various concrete implementations of an interface in the application. By using
 * references to interfaces instead of their concrete implementation classes
 * help to minimize ripple effects, as the user of interface reference doesn’t
 * have to worry about the changes in the underlying concrete implementation.
 * Interfaces are a way to declare a contract for implementing classes to
 * fulfill, it’s the primary tool to create abstraction and decoupled designs
 * between consumers and producers. In an example we have a service to implement
 * to save employee data to RDBMS and NoSQL database. If we were not using
 * interface, the EmployeeRegistrationService may be implemented with two
 * functions saveToRDBMS() and saveToNoSQL().
 * 
 * 
 * Solution: In this case, the EmplyeeRegistrationController should be aware of
 * the concrete implementation of these two functions in
 * EmployeeRegistrationService to use them. Suppose we want to add additional
 * functionality to save the information as JSON is required then you will have
 * to add a new function saveToJson() in the Service class as well as make
 * changes in the Controller. This adds lots of complication to maintenance of
 * our huge application with hundreds of controllers and services. To avoid
 * these complications we could use interface instead of implementation of
 * registration service.
 * 
 * @author ayush
 *
 */
public class ProblemEmpRegistrationService {
	public void saveToRDBMS(Employee employee) {
		// save to RDBMS
	}

	public void saveToNoSQL(Employee employee) {
		// save to NoSQL DB
	}
}