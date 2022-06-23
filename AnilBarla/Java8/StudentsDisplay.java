package Basics1;

import java.util.ArrayList;
import java.util.Collections;
public class StudentsDisplay {
	public static void main(String []args) {
		ArrayList<StudentsDetails> list = new ArrayList<StudentsDetails>();
		list.add(new StudentsDetails("Bahu", 19, 445));
        list.add(new StudentsDetails("Raam", 22, 500));
        list.add(new StudentsDetails("Pasupathi", 20, 300));
        list.add(new StudentsDetails("Gani", 18, 449));
        
        Collections.sort(list);
        System.out.println("Students are sorted based on marks ");
        
        for(StudentsDetails a : list) {
        	System.out.println(a.getName() + " "+a.getAge() + " " +a.getMarks()+ " ");
        }
	}

}
