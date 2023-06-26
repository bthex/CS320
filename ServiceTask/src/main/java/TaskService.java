import java.util.ArrayList;

public class TaskService {

    public static String uniqueTaskId;

    // Data Structure to store Tasks
    static ArrayList<Task> TaskList = new ArrayList<Task>(0);

    // TaskId Generator
    public static String generateTaskId() {

        String tempTaskId;
        if (TaskList.isEmpty()) {
            uniqueTaskId = "1";
        }
        else {
            // Find last used taskId
            int taskListSize = TaskList.size();
            uniqueTaskId = TaskList.get(taskListSize - 1).getTaskId();
        }
        // Convert last taskId to int and add 1
        int tempInt = Integer.valueOf(uniqueTaskId);
        tempInt += 1;
        tempTaskId = Integer.toString(tempInt);

        return tempTaskId;
    }

    // Create and add Task to TaskList
    public static void addNewTask(String tName, String tDescription) {
        String newTaskId = generateTaskId();
        Task Task0 = new Task(newTaskId, tName, tDescription);
        //Add
        TaskList.add(Task0);
    }

    // Setter Methods for updating task information
    public static void updateTaskName(String taskId, String newTaskName){

        for (int i = 0; i < TaskList.size(); i++) {
            if (taskId.compareTo(TaskList.get(i).getTaskId()) == 0) {
                TaskList.get(i).setTaskName(newTaskName);

            }
        }
    }

    public static void updateTaskDescription(String taskId, String newTaskDescription) {
        for (int i = 0; i < TaskList.size(); i++) {
            if (taskId.compareTo(TaskList.get(i).getTaskId()) == 0) {
                TaskList.get(i).setTaskDescription(newTaskDescription);
            }
        }
    }

    public static void deleteTask(String taskId) {
        for (int i = 0; i < TaskList.size(); i++) {
            if (taskId.compareTo(TaskList.get(i).getTaskId()) == 0) {
                TaskList.remove(i);
            }
        }
    }
}
