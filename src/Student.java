
public class Student implements ToSwap<Student>, Compare<Student> {          // ...implements interface1,interface2,...
private String name;
private byte age;
public Student( String n , byte a) {
	name = n;
	age = a;
}
public byte getAge() {
	return age;
}
public String getName() {
	return name;
}

public String toString() {
	return "{" + name + " - " + age + "}";
}
public void swap(Student s) {
	String n ;
	byte b;
	
	n= s.name;
	s.name = this.name ;
	this.name= n;

	b = s.age;
	s.age=this.age;
	this.age= b;

}
public boolean less( Student s) {
	if( this.age == s.age) {
		return name.compareTo(s.name) < 0 ;
	}
	return this.age < s.age ;
}
}
