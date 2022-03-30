package emailapp;

public class EmailApp {

    //main method here to create all the object of all the classes to access the classes and manipulate .
    public static void main (String[] args){

        email em1 = new email("Saida", "Afroj");
        em1.setmailcapacity(10);
       String mm = em1.showInfo();
       System.out.println(mm);


    }
}
