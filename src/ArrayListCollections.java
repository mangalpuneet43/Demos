import java.util.ArrayList;

public class ArrayListCollections {

	public static void main(String[] args) {

		 ArrayList<Students> ar4= new ArrayList<Students>();
		 ArrayList<Students> ar5= new ArrayList<Students>();
		 Students s1=new Students("Puneet",12,15);
		 Students s2=new Students("Puneet",12,15);
		 Students s3=new Students("Puneet",12,15);
		 Students s4=new Students("Puneet",12,15);
		 
		 Students s5=new Students("Puneet",12,15);
		 Students s6=new Students("Puneet",12,15);
		 
		ar4.add(s1);
		ar4.add(s2);
		ar4.add(s3);
		ar4.add(s4);
		ar5.add(s5);
		ar5.add(s6);
		
		ar4.addAll(ar5);
for(Students a: ar4)
{
	System.out.println(a.EmpName+" "+a.age+" "+a.salary);
}
	}

}
