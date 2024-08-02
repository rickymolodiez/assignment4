package assignment4;
import java.util.ArrayList;
import java.util.Scanner;


public class FamilyMember 
{
	
		static ArrayList<FamilyMember> FamMembers = new ArrayList<>();
		
		 private String famName;
		 private String choice;
		 private String addy;
		 private String city;
		 private String posty;
		 private String phone;
		 
		 public String getFamilyName() { return famName; }
		 public String getChoice() { return choice; }
		 public String getAddy() { return addy; }
		 public String getCity() { return city; }
		 public String getPosty() { return posty; }
		 public String getPhone() { return phone; }
 
	 	//family member object constructor
		 public FamilyMember(String famName,String choice, String addy, String city, String posty, String phone)
		 {
			 this.famName = famName;
		     this.choice = choice;
		     this.addy = addy;
		     this.city = city;
		     this.posty = posty;
		     this.phone = phone;
		 }
 
 
}
	
	
	









