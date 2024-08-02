package assignment4;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

//----------------------------------------------------------------------------------
//Assignment 4
//Written by: Ricardo Morales Lopez 40226139
//For Comp 248 Section AA – Summer 2024
//---------------------------------------------------------------------------------


public class A4 {

    	public static final Scanner kb = new Scanner(System.in);

    
    	public static void main(String[]  args)
    	{

    			//welcome message printing
    			System.out.println("Welcome to Montreal youth Soccer Club (MYSC) Registration System");
    			System.out.printf("_______________________________________________________________%n%n");
		
    			System.out.println("Current amount of members: " + ClubMember.memberAmount);

    			//Checking for the amount of club members, and asking if they want to add another one.
    			while(ClubMember.memberAmount <= 20)
    			{
    					System.out.println("Would you like to add another member to the club? (y/n): "); 
    					String moreMembers = kb.nextLine();
        
    						if(moreMembers.equals("n"))
    						{
    							break;
    						}
    						//end of checking
         
    					//setting variables for every class that is called, which prompts the user and checks input.
				         String famName = Getters.getFamilyName();
				         String choice = Getters.getChoice();
				         String addy = Getters.getAddress();
				         String city = Getters.getCity();
				         String posty = Getters.getPost();
				         String phone = Getters.getPhone();
				         String fullName = Getters.getOwnName();
				         int year = Getters.getYear();
				         
				         //making sure that the user is in the correct birth year range, and closing the program if not
				         if(year == -1)
				         {
				      	   System.out.printf("____________________________________________%n");
				      	   System.out.printf("Thank you for using our Registration System.%n");
				      	   System.out.printf("______________________________________________%n");
				
				         }
				         
				         //getting the info from the user using more classes and assigning them to variables
				         int month = Getters.getMonth();
				         int day = Getters.getDay();
				         String gender = Getters.getGender();
				         String clubAddy = Getters.getClubAddress();
				         String clubCity = Getters.getClubCity();
				         String clubPosty = Getters.getClubPost();
				         String clubPhone = Getters.getClubPhone();
         
         
				         //creating the random number for the user ID.
				         String randomNum = String.format("%04d", new Random().nextInt(10000));
         
				         //creating the new club member and fam members.
         
				         ClubMember Member = new ClubMember(fullName, year, month, day, gender, clubAddy, clubCity, clubPosty, clubPhone, randomNum);
				         ClubMember.members.add(Member);
				         
				         FamilyMember FamMember = new FamilyMember(famName, choice, addy, city, posty, phone);
				         FamilyMember.FamMembers.add(FamMember);
				         
				         //End of infot registration
				         System.out.printf("____________________________________________%n");
				         System.out.printf("Thank you for using our Registration System.%n");
				         System.out.printf("______________________________________________%n");
				         
				         //start of period registration
				         System.out.printf("____________________________________________%n");
					  	 System.out.printf("Thank you for using our Registration System.%n");
					  	 System.out.printf("______________________________________________%n");

  		 
					  	 //printing the welcome message for registration
					  	 System.out.println("Summer of 2024 Tournaments Registration");
					  	 System.out.printf("______________________________________________%n");
  		 
					  	 System.out.println("Do you wish to continue (yes/no)? ");
					  	 String contAnswer = kb.nextLine();
  		 
					  	 //setting up the periods.
  		 
					  	 //making the arraylist which will store available periods
					  	 ArrayList<String> periods = new ArrayList<String>();
  		 
				  		 //adding the periods into the arraylist
				  		 periods.add("Period 1: June 3-28");
				  		 periods.add("Period 2: July 1-26");
				  		 periods.add("Period 3: Aug 5-30");
  		 
				  		 //declaring arraylist which will store the periods the club member is registered in.
				  		 ArrayList<String> registeredPeriods = new ArrayList<>();
				  		 
				  		 //declaring variables to keep track of the cost.
				  		 int cost = 100;
				  		 int totalCost = 0;
  		 
				  		 //while loop which will prompt the periods and add/remove them accordingly as they get selected
				  		 while(contAnswer.equals("yes"))
				  		 {
				  			 System.out.println("Periods available to register your child: ");	

				  			 //for loop which loops through available periods
				  			 for(int i = 0; i < periods.size(); i++)
				  			 {
				  				 if(!registeredPeriods.contains(periods.get(i)))
				  				 {
				  					 System.out.println((i + 1) + ". " + periods.get(i));

				  				 }
  			
  					
				  			 }
  			
				  			//prompting and storing choices
				  			System.out.println("Please enter your choice: ");
				  			int choiceRemove = kb.nextInt();
				  			String fix = kb.nextLine(); 
				  			
				            int index = choiceRemove - 1;
				  			
				            //removing selected period from first arraylist
				  			periods.remove(index);
				  			
				  			//adding the total cost.
				  			totalCost += cost;
  			
				  			 System.out.println("Do you wish to continue (yes/no)? ");
				  	          contAnswer = kb.nextLine().trim().toLowerCase();
  			
				  		 }//while loop end
  		
				  		//printing out closing statement
				        System.out.println("Registration Summary:");
				        for (String period : registeredPeriods) 
				        {
				            System.out.println(period);
				        }
				        
				        System.out.println("Total Cost: $" + totalCost);
				        System.out.println("Thank you for registering!");
  	 
          
    			}//while loop end

         
	         
		        Getters.printMemberDetails (ClubMember.members,FamilyMember.FamMembers);
		
		        //printing in alphabetical order, and the oldest and youngest member
		        String[] sortNames = new String[ClubMember.members.size()];
		        for(int i = 0; i < ClubMember.members.size(); i++)
		        {
		        	sortNames[i] = ClubMember.members.get(i).getFullName();
		        }
		        
		        int[] agesYear = new int[ClubMember.members.size()];
		        for(int i = 0; i < ClubMember.members.size(); i++)
		        {
		        	agesYear[i] = ClubMember.members.get(i).getYear();
		        }
		        int[] agesMonth = new int[ClubMember.members.size()];
		        for(int i = 0; i < ClubMember.members.size(); i++)
		        {
		        	agesMonth[i] = ClubMember.members.get(i).getMonth();
		        	
		        }
		        int[] agesDay = new int[ClubMember.members.size()];
		        for(int i = 0; i < ClubMember.members.size(); i++)
		        {
		        	agesDay[i] = ClubMember.members.get(i).getDay();
		        }
		        
		        //bubble sort algorithm to sort the members by age.
		        //an array is made for year, month and day and adjusted accordingly.
		        for(int i = 0; i < ClubMember.members.size() - 1; i++)
		        {
		        	if(agesYear[i]  > agesYear[i+1])
		        	{
		        		  int temp = agesYear[i];
		        	      agesYear[i] = agesYear[i+1];
		        	      agesYear[i+1] = temp;
		        	      
		        	      int tempMonth = agesMonth[i];
		        	      agesMonth[i] = agesMonth[i+1];
		        	      agesMonth[i+1] = tempMonth;
		
		        	        int tempDay = agesDay[i];
		        	        agesDay[i] = agesDay[i+1];
		        	        agesDay[i +1] = tempDay;
		        	}
		        	else if(agesYear[i] == agesYear[i+1])
		        	{
		        		if(agesMonth[i] == agesMonth[i+1])
		            	{
		        			int tempMonth = agesMonth[i];
		                    agesMonth[i] = agesMonth[i + 1];
		                    agesMonth[i + 1] = tempMonth;
		
		                    int tempDay = agesDay[i];
		                    agesDay[i] = agesDay[i + 1];
		                    agesDay[i + 1] = tempDay;
		            	}
		        		else if(agesMonth[i] == agesMonth[i + 1])
		        		{
		        			if(agesDay[i]  > agesDay[i+1])
		                	{
		        				int tempDay = agesDay[i];
		                        agesDay[i] = agesDay[i + 1];
		                        agesDay[i + 1] = tempDay;
		                	}
		        		}
		        	}//for loop to sort the sizes
		        	
		        	//loop to print all the members in alphabetical order
		        	System.out.println("Following is the list of new members:");
		            for (String name : sortNames) 
		            {
		            	
		                System.out.println(name);
		            }
		            //printing the oldest and youngest club members
		            System.out.println("");
		            System.out.printf("The youngest club member born on %d/%d/%d is: %s%n",agesDay[0],agesMonth[0],agesYear[0], sortNames[0]);
		            System.out.printf("The oldest club member born on %d/%d/%d is: %s%n",agesDay[agesDay.length -1],agesMonth[agesMonth.length -1],agesYear[agesYear.length-1], sortNames[sortNames.length-1]);
		
		        }
	         
	        
			
		}//main
		
	
	
	
	}//class a4
	
