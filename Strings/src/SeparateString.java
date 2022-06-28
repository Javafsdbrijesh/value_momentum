import java.io.*;
import java.util.*;
public class SeparateString {
public static void main(String arg[]) {
	StringTokenizer st=new StringTokenizer("this is a test");
	while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
	}
}
}
