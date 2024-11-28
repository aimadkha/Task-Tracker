import model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        choice(tasks, args);

        for (Task task : tasks) {
            System.out.println("tasks are : "+task.getDescription());
        }



    }

    private static void choice(List<Task> tasks,String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
//        while (args.length > 0 && !args[0].equals("quit")) {
        switch (args[0]){
            case "add":
                addTasks(tasks,args[1]);
                break;
            case "remove":
                removeTask(tasks,args[1]);
                break;
        }
//        }
    }


    private static void addTasks(List<Task> tasks, String task) {
        Task newTask = new Task();
        newTask.setCreatedAt(LocalDate.now());
        newTask.setDescription(task);
        tasks.add(newTask);
    }

    private static void removeTask(List<Task> tasks,String task) {}

    private void write(Task task) {

    }
}