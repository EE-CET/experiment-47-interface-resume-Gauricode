import java.util.Scanner;

interface Resume {
    // TODO: Declare method void biodata();
	void biodata();
}

class Teacher implements Resume {
    // Attributes
   String name,qualification;
   int experience;
   public void biodata(){
	System.out.println("Name: " + name);
	System.out.println("Qualification: " + qualification);
	System.out.println("Experience: " + experience+" years");
    }

    // TODO: Implement biodata() method to print details in the required format
}

public class InterfaceResume {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	Teacher t=new Teacher();
	t.name=sc.nextLine();
	t.qualification=sc.nextLine();
        t.experience=sc.nextInt();
	
        // TODO: Read input (Name, Qualification, Experience)
        // Assign to teacher object attributes
	
        t.biodata();
        // TODO: Call teacher.biodata()
    }
}
