package corejava.multisorter;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{
    /**
     * How to sort list of class objects
     * @author www.instanceofjava.com
     */
    @Override
    public int compare(Student obj1, Student obj2) {
     
         return obj1.getName().compareTo(obj2.getName());
    }
   
 
}
