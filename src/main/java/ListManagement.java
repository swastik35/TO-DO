import java.util.LinkedList;
import java.util.Scanner;

public class ListManagement {
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";

    Scanner sc = new Scanner(System.in);
    LinkedList<String> EventList = new LinkedList<>();

    public LinkedList<String> getEventList() {
        return EventList;
    }

    public void setEventList(LinkedList<String> eventList) {
        EventList = eventList;
    }

    public void ShowEvents(LinkedList<String> EventList){
        System.out.println(RED+"---------------TO - DO ---------------");
        for (int i = 0; i < EventList.size();i++){
            System.out.println((i+1)+". "+EventList.get(i));
        }
        System.out.println("--------------------------------------"+RESET);
    }
    public void AddEvents(){
        System.out.print("\n\n\nAdd Event: ");
        EventList.add(sc.nextLine());
    }
    public void DeleteEvents(){
        System.out.print("Enter the sl number: ");
        EventList.remove((sc.nextInt())-1);
    }
    public void EditEvents(){
        int index=0;
        System.out.print("Enter the sl number form the Event List: ");
        index = sc.nextInt();    //TO-DO need to validate the range whether user input the number between 1- eventList.size()
        sc.nextLine(); // Consume the newline character
        System.out.print("Updated Event:");
        EventList.add(index-1,sc.nextLine());
    }
}
