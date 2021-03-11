package day3;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	
	public Student() {
		
	}
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]\n";
	}
	@Override
	public int compareTo(Student st2) {
		
		//return(this.getId() - st2.getId());  //ascending order id
		
		//return(st2.getId() - this.getId());  //descending order id
		
		//return (this.getName().compareTo(st2.getName())); //ascending order name
		return (st2.getName().compareTo(this.getName())); //descending order name
			
	}
	
}
