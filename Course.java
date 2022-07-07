/**
 * creating a parent class named "Course" which has 4 attributes The Course
 * class is parent class and has 4 attributes: courseID which is String,
 * CourseName which is String, courseLeader which is String, duration which is
 * int.
 */
public class Course {
    /*
     * Declaring attribute of Course class
     */
    private String courseId;
    private String courseName;
    public String courseLeader;
    private int duration;

    public Course(String courseId, String courseName, int duration) {
        /*
         * creating a constructor which initializes values to instant variables of
         * Course class
         */
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseLeader = "";
        this.duration = duration;
        /*
         * The 'this.' keyword is used so that the program doesn't confuse the instance
         * and local variable.
         */
    }

    /*
     * Accessor and Mutator method for all attribute of Course class
     */
    public void setcourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getcourseId() {
        return courseId;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getcourseName() {
        return courseName;
    }

    public void setcourseLeader(String courseLeader) {
        this.courseLeader = courseLeader;
    }

    public String getcourseLeader() {
        return courseLeader;
    }

    public void setduration(int time) {
        this.duration = duration;
    }

    public int getduration() {
        return duration;
    }

    /*
     * Creating method named display for printing out different values
     */
    public void display() {
        System.out.println("\t-----------------------------------");
        System.out.println("\t\tDetails of course");
        System.out.println("\t-----------------------------------");
        System.out.println("\tCourse ID: " + this.getcourseId());
        System.out.println("\tCourse Name: " + this.getcourseName());
        System.out.println("\tDuration: " + this.getduration());

        if (courseLeader != "") {
            System.out.println("\tCourse Leader: " + this.getcourseLeader());
        }
    }
}