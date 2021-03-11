package day3;

import java.util.Comparator;

public class StudentComparatorByIdAsc implements Comparator<Student> {
	@Override
	public int compare(Student st1, Student st2)
	{
	  return(st1.getId() - st2.getId());	
	}
}

 class StudentComparatorByIdDsc implements Comparator<Student> {
	@Override
	public int compare(Student st1, Student st2)
	{
	  return(st2.getId() - st1.getId());	
	}
}

 class StudentComparatorByNameAsc implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2)
		{
		  return(st1.getName() .compareTo(st2.getName()));	
		}
	}

  class StudentComparatorByNameDsc implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2)
		{
			return(st2.getName() .compareTo(st1.getName()));		
		}
	}
