import com.sun.source.util.TaskListener;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(OrderAnnotation.class)
class TaskServiceTest {


    @Test
    @Order(1)
    void addNewTask() {
        TaskService.addNewTask("Add Task", "This is a test to add a new task");
        int size = TaskService.TaskList.size();

        assertEquals("2",TaskService.TaskList.get(size - 1).getTaskId());
        assertEquals("Add Task", TaskService.TaskList.get(size - 1).getTaskName());
        assertEquals("This is a test to add a new task", TaskService.TaskList.get(size - 1).getTaskDescription());
    }

    @Test
    void updateTaskName() {
        int size = TaskService.TaskList.size();

        TaskService.updateTaskName("2", "Changed Name");
        assertEquals("2",TaskService.TaskList.get(size - 1).getTaskId());
        assertEquals("Changed Name", TaskService.TaskList.get(size - 1).getTaskName());
        assertEquals("Changed task info", TaskService.TaskList.get(size - 1).getTaskDescription());

    }

    @Test
    void updateTaskDescription() {
        int size = TaskService.TaskList.size();

        TaskService.updateTaskDescription("2", "Changed task info");
        assertEquals("2",TaskService.TaskList.get(size - 1).getTaskId());
        assertEquals("Add Task", TaskService.TaskList.get(size - 1).getTaskName());
        assertEquals("Changed task info", TaskService.TaskList.get(size - 1).getTaskDescription());
    }

    @Test
    void deleteTask() {
        int size = TaskService.TaskList.size();

        TaskService.deleteTask(TaskService.TaskList.get(size - 1).getTaskId());
        int sizeAfterDelete = TaskService.TaskList.size();
        assertEquals(0, sizeAfterDelete);

    }
}