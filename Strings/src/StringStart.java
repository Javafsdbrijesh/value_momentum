
import java.util.*;

public class StringStart {
	 public static void main(String args[]) {
		   StringBuilder sb = new StringBuilder();
		    String myStr = "this is a demo program it helps to get concept";
		    for (String b : myStr.split(" ")) {
		        if (b.startsWith("i") ) {
		            sb.append(b + " ");
		        }
		    }
		    System.out.println(sb.toString());
		   }
		
}
