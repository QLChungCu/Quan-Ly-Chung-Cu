package smartcity.AttributeClass;

public class Person {
    private String personName;
    private String personGender; 
    private String personBirthday;
    private String personHomeTown;
    private String personIC;
    private String personJob;
    private String personPhoneNumber;

    public Person() {}

    public Person(String personName, String personGender, String personBirthday, 
            String personHomeTown, String personIC, String personJob, 
            String personPhoneNumber) {
        this.personName = personName;
        this.personGender = personGender;
        this.personBirthday = personBirthday;
        this.personHomeTown = personHomeTown;
        this.personIC = personIC;
        this.personJob = personJob;
        this.personPhoneNumber = personPhoneNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public String getPersonBirthday() {
        return personBirthday;
    }

    public void setPersonBirthday(String personBirthday) {
        this.personBirthday = personBirthday;
    }

    public String getPersonHomeTown() {
        return personHomeTown;
    }

    public void setPersonHomeTown(String personHomeTown) {
        this.personHomeTown = personHomeTown;
    }

    public String getPersonIC() {
        return personIC;
    }

    public void setPersonIC(String personIC) {
        this.personIC = personIC;
    }

    public String getPersonJob() {
        return personJob;
    }

    public void setPersonJob(String personJob) {
        this.personJob = personJob;
    }

    public String getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(String personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }
    
}