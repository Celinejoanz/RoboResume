import java.util.ArrayList;

public class UserAccounts {

    private ArrayList<UserInput> resumes;

    public UserAccounts() {
        resumes = new ArrayList<UserInput>();
    }

    public void addResume(UserInput toAdd) {
        this.resumes.add(toAdd);
    }

    public ArrayList<UserInput> getResumes() {
        return resumes;
    }

    public void setResumes(ArrayList<UserInput> resumes) {
        this.resumes = resumes;
    }
public String display() {
    String toDisplay = "";
    for (UserInput thisUserInput: resumes){
        toDisplay+=thisUserInput.getUserEducationLevel() + " in " + thisUserInput.getUserMajor() + "," +"\n"+ thisUserInput.getUserSchool() + ", " + thisUserInput.getUserYear()+"\n";
}
return toDisplay;
}
    public String display2() {
        String toDisplay2 = "";
        for (UserInput thisUserInput: resumes){
            toDisplay2+=thisUserInput.getUserPosition()+ "\n"+ thisUserInput.getUserCompany() + ", " + thisUserInput.getUserDuration()+"\n"+ thisUserInput.getUserDuties();
        }
        return toDisplay2;
}
    public String display3() {
        String toDisplay3 = "";
        for (UserInput thisUserInput : resumes) {
            toDisplay3 += thisUserInput.getUserSkill() + " " + thisUserInput.getUserLevel();
        }
        return toDisplay3;
    }
}