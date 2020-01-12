package comm.employeee;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		int result=0;
		
		if(o1.getAge()>o2.getAge()) {
			return result=-1;
		}
		else if(o1.getAge()<o2.getAge())
		{
			return result=1;
		}
		else if(o1.getAge()==o2.getAge())
		{
			result= (o1.getDateOfJoining().compareTo(o2.getDateOfJoining()));
			return result;
		}
		return result;
	}

}