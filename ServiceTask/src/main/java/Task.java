public class Task {

    private String taskId;
    private String taskName;
    private String taskDescription;

    public Task(String newTaskId, String newTaskName, String newTaskDescription) {

        if (newTaskId == null || newTaskId.length() > 10) {
            throw new IllegalArgumentException("Invalid entry for Task Id");
        }
        if (newTaskName == null || newTaskName.length() > 20) {
            throw new IllegalArgumentException("Invalid entry for Task Name");
        }
        if (newTaskDescription == null || newTaskDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid entry for Task Description");
        }

        this.taskId = newTaskId;
        this.taskName = newTaskName;
        this.taskDescription = newTaskDescription;
    }

    // Getter Methods
    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    //Setter Methods
    public void setTaskName(String updateTaskName) {
        if (updateTaskName == null || updateTaskName.length() > 20) {
            throw new IllegalArgumentException("Invalid entry for Task Name");
        }
        this.taskName = updateTaskName;
    }

    public void setTaskDescription(String updateTaskDescription) {
        if (updateTaskDescription == null || updateTaskDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid entry for Task Description");
        }
        this.taskDescription = updateTaskDescription;
    }
}
