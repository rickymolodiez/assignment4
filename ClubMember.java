package assignment4;

import java.util.ArrayList;


public  class ClubMember {

	 final int MAX = 20;
     static ArrayList<ClubMember> members = new ArrayList<>();
     static int memberAmount = members.size();
     
     
     //initializing object variables for the Club member
  
 	 private String fullName;
 	 private int year;
 	 private int month;
     private int day;
     private String gender;
     private String clubAddy;
     private String clubCity;
     private String clubPosty;
     private String clubPhone;
     private String randomNum;
     
     public String getFullName() { return fullName; }
     public int getYear() { return year; }
     public int getMonth() { return month; }
     public int getDay() { return day; }
     public String getGender() { return gender; }
     public String getClubAddy() { return clubAddy; }
     public String getClubCity() { return clubCity; }
     public String getClubPosty() { return clubPosty; }
     public  String getClubPhone() { return clubPhone; }
     public String getRandomNum() { return randomNum; }
     
     
     //constructor for club member
     public ClubMember(String fullName, int year, int month, int day, String gender, String clubAddy, String clubCity, String ClubPosty, String clubPhone, String randomNum)
     {
    	 this.fullName = fullName;
    	 this.year = year;
    	 this.month = month;
    	 this.day = day;
    	 this.gender = gender;
    	 this.clubAddy = clubAddy;
    	 this.clubCity = clubCity;
    	 this.clubPosty = clubPosty;
    	 this.clubPhone = clubPhone;
    	 this.randomNum = randomNum;
    	 
     }
	
	
	
}
