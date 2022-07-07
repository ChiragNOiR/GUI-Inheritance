public class AcademicCourse extends Course {
    /*
     * declearing 7 different instance variables of this child class.
     */
    private String lecturerName;
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;

    public AcademicCourse(String courseId, String courseName, String level, int duration, String credit,
                        int numberOfAssessments) {
        /* creating a constructor of this class for initializing instance variables. */
        super(courseId, courseName, duration);
        this.numberOfAssessments = numberOfAssessments;
        this.lecturerName = "";
        this.level = level;
        this.credit = credit;
        this.startingDate = "";
        this.completionDate = "";
        this.isRegistered = false;
    }

    /*
     * Accessor and Mutator method for all attribute of AcademicCourse
     */
    public String getlecturerName() {
        return this.lecturerName;
    }

    public String getlevel() {
        return this.level;
    }

    public String getcredit() {
        return this.credit;
    }

    public String getstartingDate() {
        return this.startingDate;
    }

    public String getcompletionDate() {
        return this.completionDate;
    }

    public int getnumberOfAssessments() {
        return this.numberOfAssessments;
    }

    public boolean getisRegistered() {
        return this.isRegistered;
    }

    public void setlecturerName(String lectureName) {
        this.lecturerName = lectureName;
    }

    public void setlevel(String level) {
        this.level = level;
    }

    public void setcredit(String credit) {
        this.credit = credit;
    }

    public void setstartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public void setcompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public void setnumberOfAssessments(int numberOfAssessments) {
        this.numberOfAssessments = numberOfAssessments;
    }

    public void setisRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    /*
     * Creating method for Academic Course and printing various values like name of
     * lecturer,level, credit, starting date and completion date of the lecturer.
     */
    public void registerCourse(String courseLeader, String lecturerName, String startingDate, String completionDate) {
        if (!isRegistered) {
            super.setcourseLeader(courseLeader);
            this.setlecturerName(lecturerName);
            this.startingDate = startingDate;
            this.completionDate = completionDate;
            this.isRegistered = true;
            //System.out.println("Course has been registered.");
        } else {
            System.out.println("Notice: Course is already registered.");
            System.out.println("Lecturer Name: " + this.lecturerName);
            System.out.println("Credit: "+ this.credit);
            System.out.println("Level: "+ this.level);
            System.out.println("Started on: " + this.startingDate);
            System.out.println("Completion Date: " + this.completionDate);
        }
    }

    /*
     * creating a method name display that prints different values
     */
    public void display() {
        super.display();
        if (isRegistered = true) {
            System.out.println("\t-----------------------------------");
            System.out.println("\t\tDetails of Academic Course");
            System.out.println("\t-----------------------------------");
            System.out.println("\tFull name of Lecturer is: " + this.getlecturerName());
            System.out.println("\tCourse Level: " + this.getlevel());
            System.out.println("\tCredit is: " + this.getcredit());
            System.out.println("\tThe Course started on: " + this.getstartingDate());
            System.out.println("\tCompletion Date of Course is: " + this.getcompletionDate());
        }
    }
}