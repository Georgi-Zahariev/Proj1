
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s = new Student( "Plamen" ,(byte) 18);
Student n = new Student( "Plamen", (byte) 18);
System.out.println(s.toString() + " "+ n.toString());
System.out.println( s.less(n));
s.swap(n);
System.out.println(s.toString() + " "+ n.toString());
System.out.println( s.less(n));

	}

}
