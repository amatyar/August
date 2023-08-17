package August;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class new2 {

	public static void main(String[] args) {
		List<EmployeeR> empList  = List.of(new EmployeeR("59-385-1088","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0),
                new EmployeeR("73-274-6476","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2),
                new EmployeeR("85-939-9584","Axe","Gumb","agumb2@twitter.com","Female","FALSE",62291,4),
                new EmployeeR("08-180-8292","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4),
                new EmployeeR("21-825-2623","Ulick","Burrel","uburrel4@google.ru","Male","FALSE",128764,5),
                new EmployeeR("66-708-5539","Tailor","Ridding","tailor@google.ru","Female","FALSE",152924,4),
                new EmployeeR("81-697-2363","Joete","Braybrooke","jbraybrooke6@prnewswire.com","Male","TRUE",128907,0),
                new EmployeeR("63-019-1110","Elroy","Baverstock","ebaverstock7@ehow.com","Male","TRUE",2510,0));
         
        List<EmployeeR> GenderF = (empList.stream().filter(e->e.getGender().equals("Female")).toList());
       System.out.println(GenderF);   
     System.out.println("*************1***********");
       
       //only displays Zacharias Schwerin because of case sensetiveness
       List<EmployeeR> Njoiner = (empList.stream().filter(a->a.getNewJoiner().equals("True")).toList());
       System.out.println(Njoiner);
       
      
       System.out.println("**********2**************");
      
      
      List<EmployeeR> sortedList = empList.stream().sorted(Comparator.comparingInt(EmployeeR::getRating))
          .collect(Collectors.toList());

      sortedList.forEach(System.out::println);
      System.out.println("***********3*************");
      
      boolean SL = (empList.stream().allMatch(c->c.getSalary()>1000));
           System.out.println(SL);

	}

}
class EmployeeR {
	  private String empId;
	  private String firstName;
	  private String lastName;
	  private String email;
	  private String gender;
	  private String newJoiner;
	  private int salary;
	  private int rating;
	  
	  public EmployeeR(String id, String fn, String ln, String em, String gn, String nj,int i, int j) 
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
	  public void setGender(){
	  System.out.println(this.gender);  
	  }
	  
	  public String getNewJoiner() {
	   return this.newJoiner;
	  }
	  public void setNewJoiner(){
	  System.out.println(this.newJoiner);
	  }
	  public int getRating() {
	   return this.rating;
	  }
	  public void setRating(){
	   
	  System.out.println(this.rating); 
	  
	  
	  }
	  public int getSalary() {
	   return this.salary;
	  }
	  public void setSalary(){
	  System.out.println(this.salary);
	  }
	  public void getEmpList()
	  {
	  System.out.println(this.empId +this.firstName+this.lastName+this.email+this.gender+this.newJoiner+this.salary+this.rating);
	  }
	  
	  //because the first name and last name are private so overriding to display in output
	  public String toString() {
	         return "Employee: " + firstName + " " + lastName +
	                ", Gender: " + gender +
	                ", New Joiner: " + newJoiner +
	                ", Salary: " + salary +
	                ", Rating: " + rating;
	     }
	}

