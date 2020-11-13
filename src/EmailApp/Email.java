package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private int getdefaultpasswordlenght =8;
    private String department;
    private String alternateemail;
    private int mailboxcapacity;
    private String company = "netsolution.com";

    // Constructor to receive first name and last name
    public Email(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;

        //Call a method for department
        this.department=setDepartment();

        //Combine elements too generate
        this.email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+this.department.toLowerCase()+"."+this.company;
        //System.out.println("Your Email : "+email);
        //Call for Random Generator
        this.password= RandomPassword(getdefaultpasswordlenght);
        //System.out.println("Your Password : "+password);

    }

    // Ask for department
    private String setDepartment(){
        Scanner sc = new Scanner(System.in);
        System.out.print("DEPARTMENT CODE : \n 1) Accounts \n 2) Sales \n 3) Marketing \n 4) None \n Enter the Department Number: ");
        int dptNo= sc.nextInt();
        if(dptNo==1){ return "Accounts";}
        else if (dptNo==2) {return "Sales";}
        else if (dptNo==3){ return "Marketing";}
        else { return "";}
    }
    // Genetrate a random password
    private String RandomPassword(int length){
        String passwordSet = "qwertyuiopasdfghjklzxcvbnm@*";
        char password[] = new char[length];
        for(int i=0;i<length;i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }

        return new String(password);
    }

    // Set the mailbox Capacity
    public void setMailboxcapacity(int capacity) {
        this.mailboxcapacity = capacity;
    }
    // Set the alternate email
    public void setAlternateemail(String altEmail){
        this.alternateemail = altEmail;

    }
    // Change the password
    public void changePassword(String Password){
        this.password = Password;
    }
    public int getMailboxcapacity(){return mailboxcapacity;}
    public String getAlternateemail(){return alternateemail;}
    public String getPassword(){return password;}

    //Print all Information
    public String showInfo(){
        return "Display Name : "+this.firstname+" "+this.lastname+"\n"+
                "Company Email : "+this.email+"\n"+
                "Your Password : "+this.password+"\n"+
                "Mailbox Capacity : " + this.mailboxcapacity+"\n";
    }
}
