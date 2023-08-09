package August;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamCase {

	public static void main(String[] args)
	{
        Employee[] empList = 
        	{
        		new Employee("59-385-1088","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0),
                new Employee("73-274-6476","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2),
                new Employee("85-939-9584","Axe","Gumb","agumb2@twitter.com","Female","FALSE",62291,4),
                new Employee("08-180-8292","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4),
                new Employee("21-825-2623","Ulick","Burrel","uburrel4@google.ru","Male","FALSE",128764,5),
                new Employee("66-708-5539","Tailor","Ridding","Ridding","Female","FALSE",152924,4),
                new Employee("81-697-2363","Joete","Braybrooke","jbraybrooke6@prnewswire.com","Male","TRUE",128907,0),
                new Employee("63-019-1110","Elroy","Baverstock","ebaverstock7@ehow.com","Male","TRUE",2510,0)
        	};
        
        System.out.println("********1**********");
      
        List<Employee> clist= Arrays.asList(empList);
//        List<String> abd = (List<String>) clist.stream().filter(e -> e.getGender().equals("Female"));
//        System.out.println(abd);
     
        System.out.println(clist.stream().filter(e -> e.getGender().equals("Female")));
        System.out.println("********2**********");
        //method reference//forEach(System.out::println);
        //clist.stream().filter(e -> e.getGender().equals("Female")).forEach(e -> System.out.println(e));
        clist.stream().filter(e -> e.getGender().equals("Female")).forEach(e ->
        		{
        			System.out.println(e);
        			});
        System.out.println("********3**********");
        
        clist.stream().filter(e -> e.getNewJoiner().equals("True")).forEach(e -> System.out.println(e));
        System.out.println("*********4*********");
        // for sort
        clist.stream().sorted(Comparator.comparing(Employee::getRating)).forEach(e -> System.out.println(e));
        System.out.println("********5**********");
        //Match method
        boolean sl = clist.stream().allMatch(e -> e.getSalary() > 1000);
        System.out.println(sl);
}
       
	

}
class Employee {
	 private String empId;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private String gender;
	 private String newJoiner;
	 private int salary;
	 private int rating;
	 
	 public Employee(String id, String fn, String ln, String em, String gn, String nj,int i, int j) 
	 {
		 this.empId = id;
		 this.firstName= fn;
		 this.lastName=ln;
		 this.email=em;
		 this.gender= gn;
		 this.newJoiner = nj;
		 this.salary = i;
		 this.rating = j;
	 }
	 
	 public String getGender()
	 {
		 return this.gender;
	 }
	 public void setGender(String gn){
		 this.gender = gn;
	 }
	 
	 public String getNewJoiner() {
		 return this.newJoiner;
	 }
	 public void setNewJoiner(String nj){
		 this.newJoiner = nj;
	 }
	 public int getRating() {
		 return this.rating;
	 }
	 public void setRating(int j){
		 this.rating = j;
	 }
	 public int getSalary() {
		 return this.salary;
	 }
	 public void setSalary(int i){
		 this.salary = i;
	 }
	 public void getEmpList()
	 {
		System.out.println(this.empId +this.firstName+this.lastName+this.email+this.gender+this.newJoiner+this.salary+this.rating);
	 }
}


