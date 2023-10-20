import java.util.*;

public class Todolist{
    List<String> list;
    Scanner scanner;
    public Todolist(){
        list=new ArrayList<String>();
        scanner= new Scanner(System.in);
    }
    public void add(){
        String b ;
        System.out.println("Enter a Task");
        scanner.nextLine();
        b = scanner.nextLine();
        list.add(b);

    }
    public void remove(){
        String b ;
        System.out.println("which task to be removed");
        scanner.nextLine();
        b = scanner.nextLine();
        list.remove(b);
    }
    public void display(){
        System.out.println("task list\n");
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+"."+list.get(i));
        }
        scanner.nextLine();
        scanner.nextLine();
    }
    
    //main function
    
    public static void main(String args[]){
        Todolist task = new Todolist();
    int a=0 ;
    String b ;
        while(a!=4){

        
        System.out.println(" Menu ");
        System.out.println("1.Add Task");
        System.out.println("2.Remove Task");
        System.out.println("3.List of Tasks");
        System.out.println("4.Quit");
        System.out.println("Enter your choice");
        
    a = task.scanner.nextInt();
        
        switch (a){
            case 1: 
                    task.add();
                    break;

            case 2: 
                    task.remove();
                    break;

            case 3: 
                    task.display();
                    break;

            case 4: System.out.println("bye");
                    break;

            default: System.out.println("your entered choice is invalid");


        }
        }

    
    }
    
}

