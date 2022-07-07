public class nonAcademicCourse extends Course {
    /*
     * declearing 7 different instance variables of this child class.
     */
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;

    public nonAcademicCourse(String courseId, String courseName, int duration, String prerequisite) {
        /* creating a constructor of this class for initializing instance variables. */
        super(courseId, courseName, duration);
        this.prerequisite = prerequisite;
        this.instructorName = "";
        this.startDate = "";
        this.completionDate = "";
        this.examDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }

    /*
     * Accessor and Mutator method for all attribute of AcademicCourse
     */
    public String getprerequisite() {
        return this.prerequisite;
    }

    public String getstartDate() {
        return this.startDate;
    }

    public String getcompletionDate() {
        return this.completionDate;
    }

    public String getexamDate() {
        return this.examDate;
    }

    public boolean getisRegistered() {
        return this.isRegistered;
    }

    public boolean getisRemoved() {
        return this.isRemoved;
    }

    public void setprerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public void setstartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setcompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    public void setexamDate(String examDate) {
        this.examDate = examDate;
    }

    public void setisRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public void setisRemoved(boolean isRemoved) {
        this.isRemoved = isRemoved;
    }

    /*
     * method to accept the new value for the instructorName if its false
     */
    public void setinstructorName(String instructorName) {
        if (isRegistered == false) {
            this.instructorName = instructorName;
        } else {
            System.out.println("The Academic Course is not registered");
        }
    }

    /*
     * method to register the Non-Academic Course by accepting 5 parameters while
     * giving out conditions
     */
    public void registerCourse(String courseLeader, String instructorName, String startDate, String completionDate,
            String examDate) {
        if (!isRegistered) {
            super.setcourseLeader(courseLeader);
            this.setinstructorName(instructorName);
            this.startDate = startDate;
            this.completionDate = completionDate;
            this.examDate = examDate;
            this.isRegistered = true;
            //System.out.println("Non-Academic Course has been registered.");
        } else {
            System.out.println("Notice: Course already registered");
            System.out.println("Instructor Name: " + this.instructorName);
            System.out.println("Started on: " + this.startDate);
            System.out.println("Completion date: " + this.completionDate);
            System.out.println("Exam date: " + this.examDate);
        }
    }

    /*
     * method to remove the instructor registered on the Non-Academic Course
     */
    public void remove() {
        if (isRemoved == true) {
            System.out.println("The course is already Removed");
        } else {
            super.setcourseLeader("");
            instructorName = "";
            startDate = "";
            completionDate = "";
            examDate ="";
            isRegistered = false;
            isRemoved = true;
        }
    }

    /*
     * creating a method name display that prints different values
     */
    public void display() {
        super.display();
        System.out.println("\tPrerequisite: " + prerequisite);
        if (isRegistered == true) {
            System.out.println("\t-----------------------------------");
            System.out.println("\tDetails of Academic Course");
            System.out.println("\t-----------------------------------");
            System.out.println("\tThe name of the instructor is: " + instructorName);
            System.out.println("\tStart Date: " + startDate);
            System.out.println("\tCompletion Date: " + completionDate);
            System.out.println("\tExam Date: " + examDate);
        }
    }
}
