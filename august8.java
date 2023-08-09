package August;

import java.util.List;
import java.util.stream.Collectors;

public class august8 {
	public static void main(String[] args) 
	{
		List<ClassRoom> cr = List.of(
				new ClassRoom("Ram Shrma", 15, "Mathematics"),
				new ClassRoom("Krishna Shrma", 45, "Physics"),
				new ClassRoom("Rahul Pandit", 22, "Chemistry"),
				new ClassRoom("Samira Joshi", 31, "Computer")								
				);
			List<ClassRoom> abc= cr.stream().filter(i ->i.getRollNo() < 32)
				.collect(Collectors.toList());
			//System.out.println(abc);
			for(int i =0; i<abc.size(); i++)
			{
				System.out.println(abc.get(i).getRollNo());
				System.out.println(abc.get(i).getStuName());
				System.out.println(abc.get(i).getSubj());
			}
			
			// map and collect
			List<String> name=cr.stream().map(x->x.getStuName())
					.collect(Collectors.toList());
			for( String ap:name) {
				System.out.println(ap);
			}
			
			//Name and subj
			
			List<String> sn= cr.stream().map(p->p.getStuName()
					.concat(" : ")
					.concat(p.getSubj()))
					.collect(Collectors.toList());
			for(String sp:sn) {
				System.out.println(sp);
			}
	}
}
class ClassRoom{
	private String Stu_Name;
	private int Roll_No;
	private String Subj;
	
	public ClassRoom(String nm, int no, String sb) 
	{
		this.Stu_Name = nm;
		this.Roll_No =no;
		this.Subj = sb;
	}
	public String getStuName()
	{
		return this.Stu_Name;
	}
	
	public void setStuName(String nm) 
	{
		this.Stu_Name = nm;
	}
	public int getRollNo()
	{
		return this.Roll_No;
	}
	
	public void setRollNo(int no) 
	{
		this.Roll_No = no;
	}
	public String getSubj()
	{
		return this.Subj;
	}
	
	public void setSubj(String sb) 
	{
		this.Subj = sb;
	}
}
