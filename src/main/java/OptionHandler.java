import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class OptionHandler {
    Scanner DW = new Scanner(System.in);
    ListManagement manager = new ListManagement();
    int choice =0;
    public void mainScreen(){
        do {
            manager.ShowEvents(manager.getEventList());
            Choices();
            switch (choice){
                case 1:
                    manager.AddEvents();
                    break;
                case 2:
                    manager.DeleteEvents();
                    break;
                case 3:
                    manager.EditEvents();
                default:
                    break;
            }
        }while (choice!=0);
    }




    public void Choices(){
        System.out.println("CHOICES");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Edit");
        System.out.println("0. Exit");
        System.out.println("----------------------");
        System.out.print("\n Enter your choice:");
        choice  = DW.nextInt();
    }
}
