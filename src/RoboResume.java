import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RoboResume {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        UserAccounts userAccounts = new UserAccounts();
        userAccounts.addResume(userInput);
        ArrayList<UserInput> resumes = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String education="";
        String answer;
        String answer2;
        String answer3;
        String answer4;
        String firstName = "x";
        String lastName = "x";
        String email = "x";
        String educationLevel = "x";
        String major = "x";
        String school = "x";
        long year = 1;
        String answer1;
        String position = "x";
        String company = "x";
        String duration = "x";
        String duties = "x";
        String experiences="";
        //make experience duties begin with - and make them numbered
        String skill = "x";
        String level = "x";
        int counter = 1;
        int counter2 = 1;
        int counter3 = 1;

        System.out.println("What is your first name?");
        firstName = scan.next();
        while (firstName == "") {
            System.out.println("Incorrect Input.Try again");
            firstName = scan.next();
        }
        System.out.println("What is your last name?");
        lastName = scan.next();
        while (lastName == "") {
            System.out.println("Incorrect Input.Try again");
            lastName = scan.next();
        }
        System.out.println("What is your email address");
        email = scan.next();
        while (email == "") {
            System.out.println("Incorrect Input.Try again");
            email = scan.next();
        }
        System.out.println("Input all previous education");
        do {
            System.out.println("Level of education: ");
            System.out.println("Select A for Bachelors");
            System.out.println("Select B for Masters");
            System.out.println("Select C for PhD");
            educationLevel = scan.next();
            if (educationLevel.equalsIgnoreCase("a")) {
                educationLevel = "BS";
            } else if (educationLevel.equalsIgnoreCase("b")) {
                educationLevel = "MS";
            } else if (educationLevel.equalsIgnoreCase("c")) {
                educationLevel = "PhD";
            }
            while (educationLevel == "") {
                System.out.println("Incorrect Input.Try again");
                educationLevel = scan.next();
            }
            System.out.println("Area of Study:");
            major = scan.next();
            while (major == "") {
                System.out.println("Incorrect Input.Try again");
                major = scan.next();
            }
            System.out.println("School:");
            school = scan.next();
            while (school == "") {
                System.out.println("Incorrect Input.Try again");
                school = scan.next();
            }
            System.out.println("Year degree was obtained:");
            year = scan.nextLong();
            while (year == 0) {
                System.out.println("Incorrect Input.Try again");
                year = scan.nextLong();
            }
            counter++;
            System.out.println("Is that all? y/n");
            answer = scan.next();
        } while (answer.equalsIgnoreCase("n") && !answer.equalsIgnoreCase("y") && counter < 11);
        System.out.println("Do you have any experience? y/n");
        answer1 = scan.next();
        if (answer1.equalsIgnoreCase("y") && !answer1.equalsIgnoreCase("n")) {
            do {
                System.out.println("Input your experience");
                System.out.println("Position");
                position = scan.next();
                while (position == "") {
                    System.out.println("Incorrect Input.Try again");
                    position = scan.next();
                }
                System.out.println("Company");
                company = scan.next();
                while (company == "") {
                    System.out.println("Incorrect Input.Try again");
                    company = scan.next();
                }
                System.out.println("Duration of Work");
                duration = scan.next();
                while (duration == "") {
                    System.out.println("Incorrect Input.Try again");
                    duration = scan.next();
                }
                System.out.println("Duties:");
                System.out.println("List duties line by line");
                do {
                    duties = scan.next();
                    System.out.println("Want to add more duties? y/n");
                    answer4 = scan.next();
                    // or input duties separated by commas System.out.println("Input your duties")
                } while (answer4.equalsIgnoreCase("y") && !answer4.equalsIgnoreCase("n"));
                counter++;
                System.out.println("Do you want to add any more experience? y/n");
                answer2 = scan.next();
            } while (answer2.equalsIgnoreCase("y") && !answer2.equalsIgnoreCase("n") && counter2 < 11);
        }
        System.out.println("Input your skills");
        do {
            System.out.println("Skill:");
            skill = scan.next();
            System.out.println("Level of proficiency");
            System.out.println("Input A for Highly skilled");
            System.out.println("Input B for Proficient");
            System.out.println("Input C for Intermediate level");
            System.out.println("Input D for Familiar");
            level = scan.next();
            if (level.equalsIgnoreCase("a")) {
                level = "highly skilled";
            } else if (level.equalsIgnoreCase("b")) {
                level = "proficient";
            } else if (level.equalsIgnoreCase("c")) {
                level = "intermediate level";
            } else if (level.equalsIgnoreCase("d")) {
                level = "familiar";
            }
            counter++;
            System.out.println("Do you have any more skills to add? y/n");
            answer3 = scan.next();
        } while (answer3.equalsIgnoreCase("y") && !answer3.equalsIgnoreCase("n") && counter3 < 20);



        userInput.setUserFirstName(firstName);
        userInput.setUserLastName(lastName);
        userInput.setUserEmail(email);
        userInput.setUserEducationLevel(educationLevel);
        userInput.setUserMajor(major);
        userInput.setUserSchool(school);
        userInput.setUserPosition(position);
        userInput.setUserCompany(company);
        userInput.setUserDuration(duration);
        userInput.setUserDuties(duties);
        userInput.setUserSkill(skill);
        userInput.setUserLevel(level);

        resumes.add(userInput);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Print out your created resume below!");
        System.out.println("Best of luck!!");
        System.out.println("\n");
        System.out.println("=================================================================================================================================");
        System.out.println("\n");

        String skills="";
        experiences+=userAccounts.display2();
        education+=userAccounts.display();
        skills+=userAccounts.display3();
        for (UserInput thisUserInput : resumes) {

            System.out.println(thisUserInput.getUserFirstName() + thisUserInput.getUserLastName());
            System.out.println(thisUserInput.getUserEmail());
            System.out.println("\n");
            System.out.println("Education");
            System.out.println(education);
            System.out.println("\n");
            if (answer1.equalsIgnoreCase("y")) {
                System.out.println("Experience");
                System.out.println(experiences);
                System.out.println("\n");
            }
            //("-" + duties/n);
            //be sure to find a way to separate each experience- when printing add "\n"
            System.out.println("Skills");
            System.out.println(skills);
        }
    }
}
