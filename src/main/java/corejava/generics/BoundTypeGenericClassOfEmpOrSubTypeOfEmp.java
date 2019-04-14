package corejava.generics;

import java.util.List;

interface Emp {
	void performance();
}

class GoodEmp implements Emp {

	@Override
	public void performance() {
		System.out.println("Performance is good");
	}

}

class AverageEmp implements Emp {

	@Override
	public void performance() {
		System.out.println("Performance is Average");
	}

}

interface EmpPerformanceCheckerIfc<T extends Number> {
	
	
}
interface GenericInterface1<T1>
{
    //Generic interface with one type parameter
}

interface GenericInterface2<T2, T3>
{
    //Generic interface with two type parameters
}
 
class GenericClass<T1,T2, T3> implements GenericInterface1<T1>, GenericInterface2<T2, T3>
{
    //Class having parameters of both the interfaces
}
public class BoundTypeGenericClassOfEmpOrSubTypeOfEmp{

	public BoundTypeGenericClassOfEmpOrSubTypeOfEmp() {
		super();
	}
	

	public void save(List<? super Integer> t) {
	}
	
	public static void main(String[] args) {
	}
}
