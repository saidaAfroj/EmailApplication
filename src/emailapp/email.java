package emailapp;

import java.util.Scanner;

public class email {

    // don't want people to have access on all these information so apply encapsulation . make it private.private String firstname;
   private  String firstname;
    private String lastname;
   private String password;
   private   String department;
   private  String email;
   private int mailCapacity;
   private int defaultPasswordLength = 10;
   private String alternateEmail;
   private  String companySuffix = "abcompany.com";

   //outline and to do :
   // need a constructor to receive the firstname and lastname
    public email(String firstname , String lastname)
    {

        this.firstname = firstname; // this.firstname indicate class variable. and on right side one means local variable
        this.lastname = lastname;

        System.out.println("Email created for " +this.firstname +" " + this.lastname);


        // create a method to ask for the department .
        this.department= setdepartment();
        System.out.println("Department is :" +this.department);

        //call a method to return a random password
        this.password= setPassword(defaultPasswordLength);
        System.out.println("your password is " +this.password);

        //combine element to generate email
        email = firstname.toLowerCase() + "." +lastname.toLowerCase() +"@" + department+ "."+companySuffix;
        System.out.println("Your email is :" +email);


         }

    // ask for the department
    private String setdepartment(){

        System.out.println("New worker :"+ firstname +" "+lastname +"\nDepartment codes : \n1.for sales\n2.for development.\n3.for Accounting \n0 for None.\nEnter Department code:");
        Scanner in = new Scanner(System.in);
        int departchoice = in.nextInt();

        if(departchoice== 1) {  return "sales";}
        else if ( departchoice== 2){return "Development";}
        else if ( departchoice == 3 ){return "Accounting";}
        else return "none";
    }
    //need to generate a random password string
    private  String setPassword(int length){

        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";//dictionary of password .only among these list charecters are allowed.

        char[] password = new char[length];// creating a charecter array to save passwrod.
        for(int i =0;i<length;i++)
        {
            int rand = (int)(Math.random() * passwordSet.length());//generating random numbers from 0-1 and multiply with
            //the range of passwordset string . like :0.5*8 = something then convert to int
            password[i]= passwordSet.charAt(rand);
        }

return  new String (password);

    }



    // need to set the mailbox capacity
    public void setmailcapacity (int mailcap){
        this.mailCapacity = mailcap;
    }
    // need to set the alternate mail
    public void setalternatemail(String alteremail){
        this.alternateEmail= alteremail;
    }
    // also can be able to change password
    public void changePassword(String pass){
        this.password= pass;
    }

    //now its time to  get all the information or retrive all the info whatever we have set till now
    public int getMailCapacity(){return  mailCapacity;}
    public  String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return  password;}
    public String showInfo()
    {
        return "Name is :" +firstname+" " + lastname + "\nEmail Id :" +email +"\nMailbox capacity is " + mailCapacity;
    }
}
