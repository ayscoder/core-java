package corejava.multisorter;

import java.util.Comparator;

public class RollNoComparator implements Comparator<Student>{
    /**
     * How to sort list of class objects
     * @author www.instanceofjava.com
     */
    @Override
    public int compare(Student obj1, Student obj2) {
     
         return ((Integer)obj1.getRollno()).compareTo((Integer)obj2.getRollno());
    }
   
 
}