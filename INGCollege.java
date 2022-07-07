/**
 * Creating Class INGCollege which is a GUI
 * INGCollege class consist GUI for Adding Academic & Non - Academic Course, Registering Academic & Non - Academic Course, Removing Non - Academic Course
 * Displaying all Course Details. 
 * 
 * Author: Chirag Pokharel
 * Date: Friday, 20 August, 2021
 */

// Importing all necessary Packages
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class INGCollege implements ActionListener
{
    private JFrame frame = new JFrame("Course"); //Name of the frame

    //Initilalizing variables used in GUI Form
    private JLabel LacademicCourse, LnonAcademicCourse, Lcourseid, Lcoursename, Llevel, Lcourseleader, Llecturername, Lcredit, LnumberOfAssessments, Lduration, Lstartingdate, Lcompletiondate, Lcourseid1, Lcoursename1, Lduration1, Lcourseleader1,
    Linstructorname, Lprerequisite, Lstartingdate1, Lcompletiondate1, Lexamdate, Lcredit1, LnumberOfAssessments1, Lcourseidreg, LcourseidNreg;

    private JTextField TFcourseid, TFcoursename, TFcourseleader, TFlecturername, TFcredit, TFnumberOfAssessments, TFduration, TFstartingdate, TFcompletiondate, TFcourseid1, TFcoursename1, TFcourseleader1,
    TFinstructorname, TFprerequisite, TFstartingdate1, TFcompletiondate1, TFexamdate, TFcredit1, TFnumberOfAssessments1, TFduration1, TFcourseid4, TFcourseidreg, TFcourseidNreg;

    private JComboBox CBlevel;

    private JButton BaddCourse, BaddCourse1, Bregister, Bregister1, Bdisplay, Bdisplay1, Bnew, Bnew1, Bremove;

    //Creating arraylist
    ArrayList<Course> all = new ArrayList();
    AcademicCourse Aca;
    nonAcademicCourse nonAca;

    public static void main(String[]args){
        INGCollege ing = new INGCollege();
        ing.courseForm();
    }

    public void courseForm(){
        /**
         * Academic Course
         */

        //Creating title for Academic Course
        LacademicCourse = new JLabel("Academic Course");
        LacademicCourse.setFont(new Font("Time New Roman", Font.BOLD, 22));
        LacademicCourse.setBounds(400,5,270,40);

        //Creating label for Course ID
        Lcourseid = new JLabel("Course Id: ");
        Lcourseid.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcourseid.setBounds(100,70,160,20);
        //Creating textfiled for Course ID
        TFcourseid = new JTextField();
        TFcourseid.setBounds(200,65,100,30);

        //Creating label for Course Name
        Lcoursename = new JLabel("Course Name: ");
        Lcoursename.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcoursename.setBounds(385,65,270,30);
        //Creating textfiled for Course Name
        TFcoursename= new JTextField();
        TFcoursename.setBounds(510,65,100,30);

        //Creating label & Combo Box  for Level
        Llevel = new JLabel("Level: ");
        Llevel.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Llevel.setBounds(695,70,120,20);
        String lev[]={"One","Two","Three","Four","Five"};
        CBlevel= new JComboBox(lev);
        CBlevel.setBounds(790,65,100,30);
        CBlevel.setFont(new Font("Time New Roman",Font.BOLD,13));

        //Creating label for Assessments
        LnumberOfAssessments = new JLabel("Assessments: ");
        LnumberOfAssessments.setFont(new Font("Time New Roman", Font.BOLD, 14));
        LnumberOfAssessments.setBounds(101,110,270,30);
        //Creating textfield for Assessments
        TFnumberOfAssessments = new JTextField();
        TFnumberOfAssessments.setBounds(200,105,100,30);

        //Creating label for duration
        Lduration = new JLabel("Duration: ");
        Lduration.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lduration.setBounds(395,110,120,20);
        //Creating textfield for duration
        TFduration = new JTextField();
        TFduration.setBounds(510,105,100,30);

        //Creating button for adding academic course
        BaddCourse = new JButton("Add Course");
        BaddCourse.setBounds(400,140,190,30);
        BaddCourse.setFont(new Font("Time New Roman",Font.BOLD,15));
        BaddCourse.addActionListener(this); 
        BaddCourse.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        //Creating label for Course ID for regestering academic course
        Lcourseidreg = new JLabel("Course ID: ");
        Lcourseidreg.setBounds(100,195,120,20);
        Lcourseidreg.setFont(new Font("Time New Roman", Font.BOLD, 14));
        //Creating tect field 
        TFcourseidreg = new JTextField();
        TFcourseidreg.setBounds(200,190,100,30);

        //Creating label for Credit
        Lcredit = new JLabel("Credit: ");
        Lcredit.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcredit.setBounds(695,110,120,20);
        //Creating textfield for Credit
        TFcredit = new JTextField();
        TFcredit.setBounds(790,105,100,30);

        //Creating label for Course Leader
        Lcourseleader= new JLabel("Course Leader: ");
        Lcourseleader.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcourseleader.setBounds(385,195,120,20);
        //Creating textfield for Course Leader
        TFcourseleader = new JTextField();
        TFcourseleader.setBounds(510,190,100,30);

        //Creating label for lecturer name
        Llecturername = new JLabel("Lecturer Name: ");
        Llecturername.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Llecturername.setBounds(680,190,110,20);
        //Creating textfield for lecturer name
        TFlecturername=new JTextField();
        TFlecturername.setBounds(790,185,100,30);

        //Creating label for Starting Date
        Lstartingdate = new JLabel("Starting Date: ");
        Lstartingdate.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lstartingdate.setBounds(250,245,160,20);
        //Creating textField for Starting Date
        TFstartingdate=new JTextField("DD / MM / YYYY");
        TFstartingdate.setBounds(350,240,100,30);

        //Creating Label for Completion Date
        Lcompletiondate = new JLabel("Completion Date: ");
        Lcompletiondate.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcompletiondate.setBounds(550,245,150,20);
        //Creating textfield for Completion Date
        TFcompletiondate=new JTextField("DD / MM / YYYY");
        TFcompletiondate.setBounds(675,240,100,30);

        //Creating Button for registering the course
        Bregister = new JButton("Register");
        Bregister.setBounds(400,300,200,30);
        Bregister.setFont(new Font("Time New Roman",Font.BOLD,15));
        Bregister.addActionListener(this);
        Bregister.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        //Creating Button for displaying the data of Academic Course
        Bdisplay = new JButton("Display");
        Bdisplay.setBounds(200,350,200,40);
        Bdisplay.setFont(new Font("Time New Roman",Font.BOLD,15));
        Bdisplay.addActionListener(this);
        Bdisplay.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        //Creating button for adding new set of data by clearing old
        Bnew = new JButton("New");
        Bnew.setBounds(600,350,200,40);
        Bnew.setFont(new Font("Time New Roman",Font.BOLD,15));
        Bnew.addActionListener(this);
        Bnew.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        /**
         * Non-Academic Course
         */        

        //Creating heading for Non-Academic Course
        LnonAcademicCourse = new JLabel("Non-Academic Course");
        LnonAcademicCourse.setFont(new Font("Arial", Font.BOLD, 22));
        LnonAcademicCourse.setBounds(380,450,270,40);

        //Creating Label for Course Id
        Lcourseid1 = new JLabel("Course ID: ");
        Lcourseid1.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcourseid1.setBounds(100,550,160,20);
        //Creating textfield for Course Id
        TFcourseid1 =new JTextField();
        TFcourseid1.setBounds(200,545,100,30);

        //Creating label for Course Name
        Lcoursename1 = new JLabel("Course Name: ");
        Lcoursename1.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcoursename1.setBounds(385,525,120,20);
        //Creating textfield for Course Name
        TFcoursename1 = new JTextField();
        TFcoursename1.setBounds(510,520,100,30);

        //Creating label & Combo Box for duration
        Lduration1 = new JLabel("Duration: ");
        Lduration1.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lduration1.setBounds(700,550,120,20);
        //Creating Textfield for duration
        TFduration1 = new JTextField();
        TFduration1.setBounds(790,545,100,30);

        //Creating label for prerequisite
        Lprerequisite = new JLabel("Prerequisite: ");
        Lprerequisite.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lprerequisite.setBounds(388,580,120,20);
        //Creating text field for prerequisite
        TFprerequisite = new JTextField();
        TFprerequisite.setBounds(510,580,100,30);

        //Creating button to add non academic course
        BaddCourse1 = new JButton("Add Course");
        BaddCourse1.setBounds(400,625,200,30);
        BaddCourse1.setFont(new Font("Time New Roman",Font.BOLD,15));
        BaddCourse1.addActionListener(this);
        BaddCourse1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        //Creating label for Starting Date
        Lstartingdate1 = new JLabel("Starting Date: ");
        Lstartingdate1.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lstartingdate1.setBounds(100,750,160,20);
        //Creating textfield for Starting date
        TFstartingdate1 = new JTextField("DD / MM / YYYY");
        TFstartingdate1.setBounds(200,748,100,30);

        //Creating label for Completion Date
        Lcompletiondate1 = new JLabel("Completion Date: ");
        Lcompletiondate1.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcompletiondate1.setBounds(385,750,150,20);
        //Creating textfield for Completion date
        TFcompletiondate1=new JTextField("DD / MM / YYYY");
        TFcompletiondate1.setBounds(510,748,100,30);

        //Creating label for exam date
        Lexamdate = new JLabel("Exam Date :");
        Lexamdate.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lexamdate.setBounds(700,750,120,20);
        //Creating textfield for exam date
        TFexamdate = new JTextField("DD / MM / YYYY");
        TFexamdate.setBounds(790,748,100,30);

        //Creating label for Course Leader
        Lcourseleader1 = new JLabel("Course Leader: ");
        Lcourseleader1.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Lcourseleader1.setBounds(385,710,160,20);
        //Creating textfield for Course Leader
        TFcourseleader1 = new JTextField();
        TFcourseleader1.setBounds(510,705,100,30);

        //Creating label for Instructor Name
        Linstructorname = new JLabel("Instructor Name: ");
        Linstructorname.setFont(new Font("Time New Roman", Font.BOLD, 14));
        Linstructorname.setBounds(670,710,120,20);
        //Creating textfield for instructor name
        TFinstructorname = new JTextField();
        TFinstructorname.setBounds(790,705,100,30);

        //Creating label for Course in register part
        LcourseidNreg = new JLabel("Course ID: ");
        LcourseidNreg.setFont(new Font("Time New Roman", Font.BOLD, 14));
        LcourseidNreg.setBounds(100,710,120,20);
        //Creating textfield for instructor name
        TFcourseidNreg = new JTextField();
        TFcourseidNreg.setBounds(200,705,100,30);

        //Creating button fpr registering the course
        Bregister1 = new JButton("Register");
        Bregister1.setBounds(400,800,200,30);
        Bregister1.setFont(new Font("Time New Roman",Font.BOLD,15));
        Bregister1.addActionListener(this);
        Bregister1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        //Creating button for removing the course
        Bremove = new JButton("Remove");
        Bremove.setBounds(400,850,200,30);
        Bremove.setFont(new Font("Time New Roman",Font.BOLD,15));
        Bremove.addActionListener(this);
        Bremove.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        //Creating button for Displaing the detail of the course
        Bdisplay1 = new JButton("Display");
        Bdisplay1.setBounds(200,900,200,40);
        Bdisplay1.setFont(new Font("Time New Roman",Font.BOLD,15));
        Bdisplay1.addActionListener(this);
        Bdisplay1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        //Creating button for adding new set of data by clearing old
        Bnew1 = new JButton("New");
        Bnew1.setBounds(600,900,200,40);
        Bnew1.setFont(new Font("Time New Roman",Font.BOLD,15));
        Bnew1.addActionListener(this);
        Bnew1.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        //Adding in frame
        frame.add(LacademicCourse);
        frame.add(LnonAcademicCourse);
        frame.add(Lcourseid);
        frame.add(Lcoursename);
        frame.add(Llevel);
        frame.add(Lcourseleader);
        frame.add(Llecturername);
        frame.add(Lcredit);
        frame.add(LnumberOfAssessments);
        frame.add(Lduration);
        frame.add(Lstartingdate);
        frame.add(Lcompletiondate);
        frame.add(Lcourseid1);
        frame.add(Lcoursename1);
        frame.add(Lduration1);
        frame.add(Lcourseleader1);
        frame.add(Linstructorname);
        frame.add(Lprerequisite);
        frame.add(Lstartingdate1);
        frame.add(Lcompletiondate1);
        frame.add(Lexamdate);
        frame.add(LcourseidNreg);
        frame.add(TFcourseidNreg);
        frame.add(Lcourseidreg);
        frame.add(TFcourseidreg);
        frame.add(TFcourseid);
        frame.add(TFcoursename);
        frame.add(TFcourseleader);
        frame.add(TFlecturername);
        frame.add(TFcredit);
        frame.add(TFnumberOfAssessments);
        frame.add(TFduration);
        frame.add(TFduration1);
        frame.add(TFstartingdate);
        frame.add(TFcompletiondate);
        frame.add(TFcourseid1);
        frame.add(TFcoursename1);
        frame.add(TFcourseleader1);
        frame.add(TFinstructorname);
        frame.add(TFprerequisite);
        frame.add(TFstartingdate1);
        frame.add(TFcompletiondate1);
        frame.add(TFexamdate);
        frame.add(CBlevel);
        frame.add(BaddCourse);
        frame.add(BaddCourse1);
        frame.add(Bregister);
        frame.add(Bregister1);
        frame.add(Bdisplay);
        frame.add(Bdisplay1);
        frame.add(Bnew);
        frame.add(Bnew1);
        frame.add(Bremove);

        //Details of the frame
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(250,20,1000,1000);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Creating method Action Performed to give functionality to the buttons
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == BaddCourse) // Giving functionality to the button Add Course in Academic Course
        {
            //Initializing Variables
            String courseid = TFcourseid.getText();
            String coursename = TFcoursename.getText();
            String credit = TFcredit.getText();
            String level = (CBlevel.getSelectedItem()).toString();
            String numberOfAssessments = TFnumberOfAssessments.getText();
            String duration = TFduration.getText();

            //Using TRY CATCH block to test for ERRORS.
            try{
                if(courseid.isEmpty() || coursename.isEmpty() || credit.isEmpty() || numberOfAssessments.isEmpty() || level.isEmpty() || duration.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Fields cannot be left empty.","ERROR!!",JOptionPane.ERROR_MESSAGE); //Using JOptioPane to keep the fields full while clicking button
                }
                else{
                    //Using parse for getting the asked variable in INT 
                    courseid = TFcourseid.getText();
                    coursename = TFcoursename.getText();
                    credit = TFcredit.getText();
                    level = (CBlevel.getSelectedItem()).toString();
                    int duration1 = Integer.parseInt(TFduration.getText());
                    int numberOfAssessments1 = Integer.parseInt(TFnumberOfAssessments.getText());

                    if(duration1 <= 0 || numberOfAssessments1 <= 0){
                        JOptionPane.showMessageDialog(frame,"Duration & Assessments cannot be in negative value","ERROR!!",JOptionPane.ERROR_MESSAGE); //Using JOptioPane to keep the value in positive number
                    }else{
                        boolean isDuplicateCID = false; // Creating a variable isDuplicateCID and setting it to false

                        //Using for statement and adding variable of arraylist of Course Class
                        for(Course var:all){
                            if(var.getcourseId().equals(courseid)){
                                isDuplicateCID = true;
                                break;
                            }
                        }
                        if(isDuplicateCID == false){
                            Aca = new AcademicCourse(courseid,coursename,level,duration1,credit,numberOfAssessments1); // Creating new object of type Academic Course.
                            all.add(Aca); // Adding Academic Course to the arraylist of Course Class
                            JOptionPane.showMessageDialog(frame, "Academic Course is been successfully added","MESSAGE",JOptionPane.INFORMATION_MESSAGE); // Creating a dialog box to display popup information after button is clicked
                        }
                        else{
                            JOptionPane.showMessageDialog(frame, "Course ID is repeated","ERROR!!",JOptionPane.ERROR_MESSAGE); //Using JOptioPane to display if the course id is repeated
                        }
                    }
                }
            }
            catch(NumberFormatException A){
                JOptionPane.showMessageDialog(frame, "Please ensure that all the data are inserted correctly","ERROR!!",JOptionPane.ERROR_MESSAGE); 
            }
            catch(NullPointerException exp){             
                JOptionPane.showMessageDialog(frame,"Please fill all the fields.","ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
        }

        if(e.getSource() == BaddCourse1) // Giving functionality to the button Add Course in Non - Academic Course
        {
            //Initializing Variables
            String courseid1 = TFcourseid1.getText();
            String coursename1 = TFcoursename1.getText();
            String prerequisite = TFprerequisite.getText();
            String duration1 = TFduration1.getText();

            //Using TRY CATCH block to test for ERRORS.
            try{
                if(courseid1.isEmpty() || coursename1.isEmpty() || prerequisite.isEmpty() || duration1.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Fields cannot be left empty.","ERROR!!",JOptionPane.ERROR_MESSAGE); //Using JOptioPane to keep the fields full while clicking button
                }
                else{
                    //Using parse for getting the asked variable in INT 
                    courseid1 = TFcourseid1.getText();
                    coursename1 = TFcoursename1.getText();
                    prerequisite = TFprerequisite.getText();
                    int duration11 = Integer.parseInt(TFduration1.getText());

                    if(duration11 <= 0){
                        JOptionPane.showMessageDialog(frame, "Duration cannot be in negative value","ERROR!!",JOptionPane.ERROR_MESSAGE); //Using JOptioPane to keep the value in positive number
                    }
                    else{
                        boolean isDuplicateCID1 = false;   // Creating a variable isDuplicateCID1 and setting it to false

                        //Using for statement and adding variable of arraylist of Course Class
                        for(Course var:all){
                            if(var.getcourseId().equals(courseid1)){
                                isDuplicateCID1 = true;
                                break;
                            }
                        }
                        if(isDuplicateCID1 == false){
                            nonAca = new nonAcademicCourse(courseid1,coursename1,duration11,prerequisite); // Creating new object of type Non-Academic Course.
                            all.add(nonAca);// Adding Academic Course to the arraylist of Course Class
                            JOptionPane.showMessageDialog(frame, "Non-Academic Course is been successfully added","MESSAGE",JOptionPane.INFORMATION_MESSAGE); // Creating a dialog box to display popup information after button is clicked
                        }
                        else{
                            JOptionPane.showMessageDialog(frame, "Course ID is repeated","ERROR!!",JOptionPane.ERROR_MESSAGE);//Using JOptioPane to display if the course id is repeated
                        }
                    }
                }
            }
            catch(NumberFormatException A){
                JOptionPane.showMessageDialog(frame, "Please ensure that all the data are inserted correctly","ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
            catch(NullPointerException exp){             
                JOptionPane.showMessageDialog(frame,"Please fill all the fields","ERROR!!",JOptionPane.ERROR_MESSAGE); 
            }
        }

        if(e.getSource() == Bnew)// Giving functionality to the button New in Academic Course
        {
            // Setting all the textfield to value null / combobox to the index of one
            TFcourseid.setText(null);
            TFcoursename.setText(null);
            TFnumberOfAssessments.setText(null);
            TFduration.setText(null);
            TFcredit.setText(null);
            TFcourseleader.setText(null);
            TFlecturername.setText(null);
            TFstartingdate.setText("DD / MM / YYYY");
            TFcompletiondate.setText("DD / MM / YYYY");
            CBlevel.setSelectedIndex(0);
            TFcourseidreg.setText(null);
        }

        if(e.getSource() == Bnew1)// Giving functionality to the button New in Non-Academic Course
        {
            // Setting all the textfield to value null 
            TFcourseid1.setText(null);
            TFcoursename1.setText(null);
            TFduration1.setText(null);
            TFcourseleader1.setText(null);
            TFinstructorname.setText(null);
            TFprerequisite.setText(null);
            TFstartingdate1.setText("DD / MM / YYYY");
            TFcompletiondate1.setText("DD / MM / YYYY");
            TFexamdate.setText("DD / MM / YYYY");
            TFcourseidNreg.setText(null);
        }

        if(e.getSource() == Bregister) // Giving functionality to the button Register in Academic Course
        {
            try{
                //Initializing Variables
                String courseidreg = TFcourseidreg.getText();
                String courseleader = TFcourseleader.getText();
                String lecturername = TFlecturername.getText();
                String startingdate = TFstartingdate.getText();
                String completiondate = TFcompletiondate.getText();

                if(courseidreg.isEmpty() || courseleader.isEmpty() || lecturername.isEmpty() || startingdate.isEmpty() || completiondate.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Fields cannot be left empty.","ERROR!!",JOptionPane.ERROR_MESSAGE); //Using JOptioPane to keep the fields full while clicking button
                }
                else{
                    courseidreg = TFcourseidreg.getText();
                    boolean acaReg = false; // Creating a variable acaReg and setting it to false

                    //Using for statement and adding variable of arraylist of Course Class
                    for(Course var:all){
                        if(var.getcourseId().equals(courseidreg)){
                            acaReg = true;
                            if(var instanceof AcademicCourse){
                                Aca = (AcademicCourse) var;
                                if(Aca.getisRegistered() == true){
                                    JOptionPane.showMessageDialog(frame,"Course is already registered","ERROR",JOptionPane.ERROR_MESSAGE); // Creating a dialog box to say that the course has been registered already
                                }
                                else{
                                    Aca.registerCourse(courseleader,lecturername,startingdate,completiondate); // Using the method from Academic Course that registers course
                                    JOptionPane.showMessageDialog(frame,"Course Registered Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE); // Creating a dialog box to display popup information after button is clicked
                                    break;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Course not Found!","ERROR",JOptionPane.ERROR_MESSAGE); //Creating a dialog box to say that the course no found.
                            }
                        }
                    }
                    if(!acaReg) // Checking if the course id is correct is not for registering the course
                    {
                        JOptionPane.showMessageDialog(frame,"Invalid course","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException A){
                JOptionPane.showMessageDialog(frame,"Please input valid details","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }

        if(e.getSource() == Bregister1) // Giving functionality to the button Register in Non - Academic Course
        {
            try{
                //Initializing Variables
                String courseid1 = TFcourseidNreg.getText();
                String courseleader1 = TFcourseleader1.getText();
                String instructorname = TFinstructorname.getText();
                String startingdate1 = TFstartingdate1.getText();
                String completiondate1 = TFcompletiondate1.getText();
                String examdate = TFexamdate.getText();

                if(courseid1.isEmpty() || courseleader1.isEmpty() || instructorname.isEmpty() || startingdate1.isEmpty() || completiondate1.isEmpty() || examdate.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Fields cannot be left empty.","ERROR!!",JOptionPane.ERROR_MESSAGE); //Using JOptioPane to keep the fields full while clicking button
                }
                else{
                    courseid1 = TFcourseidNreg.getText();
                    boolean NacaReg = false; // Creating a variable NacaReg and setting it to false

                    //Using for statement and adding variable of arraylist of Course Class
                    for(Course var:all){
                        if(var.getcourseId().equals(courseid1)){
                            NacaReg = true;
                            if(var instanceof nonAcademicCourse){
                                nonAca = (nonAcademicCourse) var;
                                if(nonAca.getisRegistered() == true){
                                    JOptionPane.showMessageDialog(frame,"Course is already registered","ERROR",JOptionPane.ERROR_MESSAGE); // Creating a dialog box to say that the course has been registered already
                                }
                                else{
                                    nonAca.registerCourse(courseleader1, instructorname, startingdate1, completiondate1, examdate); // Using the method from Non-Academic Course that registers course
                                    JOptionPane.showMessageDialog(frame,"Course Registered Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE); // Creating a dialog box to display popup information after button is clicked
                                    break;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Course not Found!","ERROR",JOptionPane.ERROR_MESSAGE); //Creating a dialog box to say that the course no found.
                            }
                        }
                    }
                    if(!NacaReg)// Checking if the course id is correct is not for registering the course
                    {
                        JOptionPane.showMessageDialog(frame,"Invalid course","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException A){
                JOptionPane.showMessageDialog(frame,"Please input valid details","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == Bdisplay) // Giving functionality to the button Display in Academic Course
        {
            //Using for statement and adding variable of arraylist of Course Class
            for(Course var : all){
                if(var instanceof AcademicCourse){
                    //Displaying all the details of Academic Course
                    Aca = (AcademicCourse)var;
                    Aca.display();
                }
            }
        }

        if (e.getSource() == Bdisplay1) // Giving functionality to the button Display in Non-Academic Course
        {   
            //Using for statement and adding variable of arraylist of Course Class
            for(Course var : all){
                if(var instanceof nonAcademicCourse){
                    //Displaying all the details of Non-Academic Course
                    nonAca = (nonAcademicCourse)var;
                    nonAca.display();
                }
            }
        }

        if(e.getSource() == Bremove) // Giving functionality to the button Remove in Non-Academic Course
        {
            //Using TRY CATCH block to test for ERRORS.
            try{
                String courseid1 = TFcourseid1.getText();
                if(courseid1.isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Please insert valid Course ID. \n OR \n Please check if the Course ID is provided.","Error!!!", JOptionPane.ERROR_MESSAGE); //Using JOptioPane to keep the fields full while clicking button
                }
                else{
                    courseid1 = TFcourseid1.getText();
                    boolean isDuplicateNaCID = false; // Creating a variable isDuplicateNaCID and setting it to false
                    
                    //Using for statement and adding variable of arraylist of Course Class
                    for(Course var:all){
                        if(var.getcourseId().equals(courseid1)){
                            isDuplicateNaCID = true;
                            if(var instanceof nonAcademicCourse){
                                nonAca = (nonAcademicCourse) var;
                                if(nonAca.getisRemoved()==true){
                                    JOptionPane.showMessageDialog(frame,"Course has already been removed","Error", JOptionPane.ERROR_MESSAGE); // Using JOptioPane to display the course has already been removed
                                }
                                else{
                                    //Using the moethod from Non-Academic Course that removes Course
                                    nonAca.remove(); 
                                    JOptionPane.showMessageDialog(frame,"Course Removed Successfully","MESSAGE",JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Removed has been distrupted","ERROR",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                        }
                    }
                    if(!isDuplicateNaCID){
                        JOptionPane.showMessageDialog(frame,"Invalid Course ID","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(NumberFormatException E){
                JOptionPane.showMessageDialog(frame, "Please check course id.","ERROR!!", JOptionPane.ERROR_MESSAGE);
            }
            catch(NullPointerException exp){             
                JOptionPane.showMessageDialog(frame,"Please input courseid before removing the course","ERROR!!",JOptionPane.ERROR_MESSAGE); 
            }  
        }
    }
}