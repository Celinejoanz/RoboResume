public class UserInput {
    public UserInput() {
    }

    //String educationLevel = ("High School Diploma","Bachelors", "Masters", "PhD" );
    //String list for -level

    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userEducationLevel;
    private String userMajor;
    private String userSchool;
    private long userYear;
    private String userPosition = "";
    private String userCompany = "";
    private String userDuration = "";
    private String userDuties = "";
    private String userSkill;
    private String userLevel;

    public UserInput(String userFirstName, String userLastName, String userEmail, String userEducationLevel, String userMajor, String userSchool, long userYear, String userPosition, String userCompany, String userDuration, String userDuties, String userSkill, String userLevel) {
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userEducationLevel = userEducationLevel;
        this.userMajor = userMajor;
        this.userSchool = userSchool;
        this.userYear = userYear;
        this.userPosition = userPosition;
        this.userCompany = userCompany;
        this.userDuration = userDuration;
        this.userDuties = userDuties;
        this.userSkill = userSkill;
        this.userLevel = userLevel;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEducationLevel() {
        return userEducationLevel;
    }

    public void setUserEducationLevel(String userEducationLevel) {
        this.userEducationLevel = userEducationLevel;
    }

    public String getUserMajor() {
        return userMajor;
    }

    public void setUserMajor(String userMajor) {
        this.userMajor = userMajor;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public long getUserYear() {
        return userYear;
    }

    public void setUserYear(long userYear) {
        this.userYear = userYear;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserDuration() {
        return userDuration;
    }

    public void setUserDuration(String userDuration) {
        this.userDuration = userDuration;
    }

    public String getUserDuties() {
        return userDuties;
    }

    public void setUserDuties(String userDuties) {
        this.userDuties = userDuties;
    }

    public String getUserSkill() {
        return userSkill;
    }

    public void setUserSkill(String userSkill) {
        this.userSkill = userSkill;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }
}