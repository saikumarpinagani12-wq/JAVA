import java.util.ArrayList;

public class arraylisttask {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> completedTasks = new ArrayList<>();

        tasks.add("Complete Java Assignmen. t");
        tasks.add("Study ArrayList");
        tasks.add("Practice Coding");
        tasks.add("Submit Project");

        System.out.println("Initial Task List: " + tasks);

        String completedTask = tasks.remove(1); 
        completedTasks.add(completedTask);

        System.out.println("Current Pending Tasks: " + tasks); 
        System.out.println("Completed Tasks: " + completedTasks);
        System.out.println("Pending Tasks Count: " + tasks.size());
        System.out.println("Completed Tasks Count: " + completedTasks.size());
    }
}
