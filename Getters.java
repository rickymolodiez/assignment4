package assignment4;
import java.util.ArrayList;
import java.util.Random;

public class Getters {

	public static String getFamilyName()

	{
		 //initializing the while loop with the conditional variables
        int famfirstNameLength = -1;
        int famlastNameLength = -1;
       
        //prompting and storing choices
        while(famlastNameLength < 2 || famfirstNameLength < 2  )
        {	
			String famFullName;

            System.out.println("Please enter your family Member's First Name and Last Name: ");

            famFullName = A4.kb.nextLine();
            int famspaceName = famFullName.indexOf(" ", 0);

            //dividing string into individual ones
            String famfirstName = famFullName.substring(0, famspaceName);
            String famlastName = famFullName.substring(famspaceName + 1, famFullName.length());
            famfirstNameLength = famfirstName.length();
            famlastNameLength = famlastName.length();
            
            //verifying length
            if (famlastNameLength < 2 || famfirstNameLength < 2) 
            {
                System.out.println("Invalid first name or last name: " + famFullName);
                System.out.println("First Name and Last Name should have at least two characters.");
            }
            else
            {
				return famFullName;

            }

        }//while loop famname end
        return "";
	}//famname class end

public static String getChoice()
{
 
		int choice = -1;
		
		 //prompting choices
		 while(choice < 1 || choice > 8 )
		 {
		  	   	System.out.println("Please Enter the Relationship between the family member and the new club member: ");
		         System.out.printf(" 1 - Father%n 2 - Mother%n 3 - GrandFather%n 4 - GrandMother%n 5 - Tutor%n 6 - Partner%n 7-  Friend%n 8 - Other%n");
		         System.out.println("Please enter your choice: (1-8): ");
		         choice = A4.kb.nextInt();
		        String fix = A4.kb.nextLine();
		         
		         //making sure choice is valid
		         if(choice < 1 || choice > 8)
		         {
		      	   System.out.println("Invalid relationship: " + choice);
		      	   System.out.println("Valid relationship between 1 and 8");
		         }
		 } 
		    String returnValue = "";
		    		//assigning return value to choice inputted
		        	 switch(choice)
		        	 {
		        	 case 1:
		        		 returnValue = "Father";
		        		 break;
		        	 case 2:
		        		 returnValue = "Mother";
		        		 break;
		        	 case 3:
		        		 returnValue = "GrandFather";
		        		 break;
		        	 case 4:	
		        		 returnValue = "GrandMother";
		        		 break;
		        	 case 5: 
		        		 returnValue = "Tutor";
		        		 break;
		        	 case 6:
		        		 returnValue = "Partner";
		        		 break;
		        	 case 7:
		        		 returnValue = "Friend";
		        		 break;
		        	 case 8:
		        		 returnValue = "Other";
		        		 break;
		        	 
		        	 }//switch end
		            return returnValue;

}   	  
 
 
public static String getAddress()
{
		 //prompting for address and storing values
		 int addressLength = -1;
		  while(addressLength < 2)
		  {
			   System.out.println("Please enter your address: ");
			   String address = A4.kb.nextLine();
			   addressLength = address.length();
			   
			   //verifying length
			   if(addressLength < 2)
			   {
				   System.out.println("Invalid address: " + address);
				   System.out.println("Address should have at least two characters.");
				   
			   }
			   else
			   {
				 return address;
			   }
		  }
		  return "";
}


public static String getCity()
{
 
		 //prompting for city and storing the length
		 int cityLength = -1;
		while(cityLength < 2)
		{
			   System.out.println("Please enter your City: ");
			   String city = A4.kb.nextLine();
			   cityLength = city.length();
			   
			   //checking length
			   if(cityLength < 2)
			   {
				   System.out.println("Invalid city: " + city);
				   System.out.println("City should have at least two characters.");
				   
			   }
			   else
			   {
				 return city;
			   }
		}
		return "";
}

public static String getPost()
{
 
		 //prompting and storing the postal code
		 int postLength = -1;
		while(postLength < 6)
		{
			   System.out.println("Please enter your postal code: ");
			   String post = A4.kb.nextLine();
			   postLength = post.length();
			   
			   //checking the length
			   if(postLength < 6)
			   {
				   System.out.println("Invalid postal code: " + post);
				   System.out.println("Postal code should have at least six characters.");
				   
			   }
			   else
			   {
				 return post;
			   }
		}
		return "";
}

public static String getPhone()
{
 
		 //prompting and storing the length of the phone num
		 int phoneLength = -1;
		while(phoneLength < 6)
		{
			   System.out.println("Please enter your phone number: ");
			   String phone = A4.kb.nextLine();
			   phoneLength = phone.length();
			   
			   //checking its long enough
			   if(phoneLength < 10)
			   {
				   System.out.println("Invalid phone number: " + phone);
				   System.out.println("Valid phone number should contain at least 10 digits.");
		
			   }
			   else
			   {
				 return phone;
			   }
		}
		return "";
}	 

public static String getOwnName()
{
			 //initializing the while loop with the conditional variables
		    int ownFirstNameLength = -1;
		    int ownLastNameLength = -1;
		   
		
		    while(ownLastNameLength < 2 || ownFirstNameLength < 2  )
		    {	
				String ownFullName;
		
		        System.out.println("Please enter the new Club Member's First Name and Last Name: ");
		
		        ownFullName = A4.kb.nextLine();
		        int ownSpaceName = ownFullName.indexOf(" ", 0);
		
		        //splitting the full name into individual strings, to check for length
		        String ownFirstName = ownFullName.substring(0, ownSpaceName);
		        String ownLastName = ownFullName.substring(ownSpaceName + 1, ownFullName.length());
		        ownFirstNameLength = ownFirstName.length();
		        ownLastNameLength = ownLastName.length();
		        
		        //checking length
		        if (ownLastNameLength < 2 || ownFirstNameLength < 2) 
		        {
		            System.out.println("Invalid first name or last name: " + ownFullName);
		            System.out.println("First Name and Last Name should have at least two characters.");
		        }
		        else
		        {
					return ownFullName;
		
		        }
		
		    }//while loop famname end
		    return "";
}//ownname class end

public static int getYear()

{
		 int year = -1;
		while(year < 2014 || year > 2024)
		{
			   
			   //prompting and storing year of birth
			   System.out.println("Please enter year of birth (2014-2024):  ");
			    year = A4.kb.nextInt();
			   String fix = A4.kb.nextLine();
			   
			   if(year < 2014 || year > 2024)
			   {
				   System.out.println("Invalid year of birth: " + year);
				   System.out.println("Year of birth should be between 2014 to 2024");
				   System.out.println("Do you wish to continue? (yes/no): ");
				   String continueResponse = A4.kb.nextLine();
				   
				   //asking if they want to continue despite age if it is wrong
				   if(continueResponse.equals("yes") || continueResponse.equals("y"))
				   {
					   //continue
				   }
				   else if(continueResponse.equals("no") || continueResponse.equals("n"))
				   {
					  System.out.println("Sorry, there is no membership for your child's age." );
				   return -1;
				   }
				   
			   }
			   else
			   {
				 return year;
			   }
		}
	//redundant but still need to compile
	return year;
}


public static int getMonth()
{
 
		 //prompting and storing month
		 int month = -1;
		while(month < 1 || month > 12)
		{
			   System.out.println("Please enter the club member's month of birth (1-12): ");
			    month = A4.kb.nextInt();
			   
			   if(month < 1 || month > 12)
			   {
				   System.out.println("Invalid month: " + month);
				   System.out.println("Month should be from 1 to 12.");
				   
			   }
			   else
			   {
				 return month;
			   }
		}
		return month;//wont matter but need to complile
}

public static int getDay()
{
		 int day = -1;
		while(day < 1 || day > 31)
		{
			   
			   //prompting and storing the day of birth
			   System.out.println("Please enter the club member's day of birth (1-31): ");
			    day = A4.kb.nextInt();
			    String fix = A4.kb.nextLine();
			   
			    //checking for correct values
			   if(day < 1 || day > 31)
			   {
				   System.out.println("Invalid day: " + day);
				   System.out.println("Day should be from 1 to 31.");
				   
			   }
			   else
			   {
				 return day;
			   }
		}
	return day;//wont matter but need to complile
}

public static String getGender()
{
		 
		 //promtping and storing gender
		 System.out.println("Please Enter the Gender Of the new club member (M/F): ");
		 String gender = A4.kb.nextLine();
		 return gender;
		}
		
		public static String getClubAddress()
		{
		 //prompting and storing address
		 int addressLength = -1;
		  while(addressLength < 2)
		  {
			   System.out.println("Please enter the club member's address: ");
			   String address = A4.kb.nextLine();
			   addressLength = address.length();
			   
			   //checking length
			   if(addressLength < 2)
			   {
				   System.out.println("Invalid address: " + address);
				   System.out.println("Address should have at least two characters.");
				   
			   }
			   else
			   {
				 return address;
			   }
		  }
		  return "";
}

public static String getClubCity()
{
 
		 //prompting and storing city
		 int cityLength = -1;
		while(cityLength < 2)
		{
			   System.out.println("Please enter the club member's City: ");
			   String city = A4.kb.nextLine();
			   cityLength = city.length();
			   
			   //checking for length
			   if(cityLength < 2)
			   {
				   System.out.println("Invalid city: " + city);
				   System.out.println("City should have at least two characters.");
				   
			   }
			   else
			   {
				 return city;
			   }
		}
		return "";
}

public static String getClubPost()
{
 //prompting and storing the length of the postal code
		 int postLength = -1;
		while(postLength < 6)
		{
			   System.out.println("Please enter the club member's postal code: ");
			   String post = A4.kb.nextLine();
			   postLength = post.length();
			   
			   
			   //checking the length
			   if(postLength < 6)
			   {
				   System.out.println("Invalid postal code: " + post);
				   System.out.println("Postal code should have at least six characters.");
				   
			   }
			   else
			   {
				 return post;
			   }
		}
		return "";
}

public static String getClubPhone()
{
 
 //prompting and storing the phone number
	 int phoneLength = -1;
	while(phoneLength < 6)
	{
			   System.out.println("Please enter the club member's phone number: ");
			   String phone = A4.kb.nextLine();
			   phoneLength = phone.length();
			   
			   //checking length
			   if(phoneLength < 10)
			   {
				   System.out.println("Invalid phone number: " + phone);
				   System.out.println("Valid phone number should contain at least 10 digits.");
		
			   }
			   else
			   {
				 return phone;
			   }
			}
		return "";
}	 
	
	
public static void printMemberDetails(ArrayList<ClubMember> members, ArrayList<FamilyMember>FamMembers)
{
	
  //making the random number string
    
	int sizeUse = members.size();
	System.out.println("-----------------------------------------------------------");
    System.out.printf("Montreal Youth Soccer Club (MYSC) has %d New Registrations:%n", sizeUse);
    System.out.println("-----------------------------------------------------------");

    for(int i = 0; i < sizeUse; i++) 
    {
    	 	FamilyMember FamMember = FamMembers.get(i);
    	    ClubMember member = members.get(i);
    
    	
        	String familyName = FamMember.getFamilyName();
            String choice = FamMember.getChoice();
            String addy = FamMember.getAddy();
            String city = FamMember.getCity();
            String posty = FamMember.getPosty();
            String phone = FamMember.getPhone();
        
            // Extracting details from each ClubMember object
            
            String fullName = member.getFullName();
            String gender = member.getGender();
            String clubAddy = member.getClubAddy();
            String clubCity = member.getClubCity();
            String clubPosty = member.getClubPosty();
            String clubPhone = member.getClubPhone();

            // Generating random membership number
            Random random = new Random();
            int randomNumber = random.nextInt(10000);
            String randomNum = String.format("%04d", randomNumber);

            
        			
    
            // Printing formatted details, will only be called after the end of the prgram.
		    System.out.println("____________________________________________");
		    System.out.printf("New Club Member Registration Details");
		    System.out.println("____________________________________________");
		    System.out.printf("%s %s of the new MYSC Club Member.%n", familyName, choice);
		    System.out.printf("%s with new MYSC club membership # %s%n", fullName, randomNum);
		    System.out.printf("Lives at: %s in the city of %s with postal code %s%n", addy, city, posty);
		    System.out.printf("Has the following telephone number: %s%n%n", phone);
		    System.out.printf("The new club member %s who lives at: %s in the city of %s with postal code %s%n", fullName, clubAddy, clubCity, clubPosty);
		    System.out.printf("Has the following telephone number: %s%n%n is successfully added to the MYSC %s teams.%n", clubPhone, gender);
		    System.out.println();
    }
    
    


}//getters bracket
}