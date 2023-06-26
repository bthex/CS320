import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(OrderAnnotation.class)
class TaskTest {

    @Test
    @Order(1)
    void testTask() {
        Task testTask = new Task("123", "Add Task",
                "This is a test to add a new task");
        assertEquals("123",testTask.getTaskId());
        assertEquals("Add Task", testTask.getTaskName());
        assertEquals("This is a test to add a new task", testTask.getTaskDescription());
    }

    @Test
    void taskIdNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Task(null, "Add Task", "This is a test to add a new task."),
                "Expected taskId to outside requirements");
    }

    @Test
    void taskIdLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                        new Task("12345678910", "Add Task",
                                "This is a test to add a new task."),
                "Expected taskId to outside requirements");
    }

    @Test
    void setTaskName() {
        Task testTask = new Task("123", "Add Task",
                "This is a test to add a new task");
        testTask.setTaskName("Changed Name");
        assertEquals("123",testTask.getTaskId());
        assertEquals("Changed Name", testTask.getTaskName());
        assertEquals("This is a test to add a new task", testTask.getTaskDescription());
    }

    @Test
    void taskNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                        new Task("123", null,
                                "This is a test to add a new task."),
                "Expected taskName to outside requirements");
    }

    @Test
    void taskNameLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                        new Task("123", "Add Task1234567890123",
                                "This is a test to add a new task."),
                "Expected taskName to outside requirements");
    }

    @Test
    void setTaskDescription() {
        Task testTask = new Task("123", "Add Task",
                "This is a test to add a new task");

        testTask.setTaskDescription("new task description");
        assertEquals("123",testTask.getTaskId());
        assertEquals("Add Task", testTask.getTaskName());
        assertEquals("new task description", testTask.getTaskDescription());
    }

    @Test
    void taskDescriptionNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                        new Task("123", "Add Task",
                                null),
                "Expected taskName to outside requirements");
    }

    @Test
    void taskDescriptionLength() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                        new Task("123", "Add Task1234567890123",
                                "This is a test to add a new task. 12345678912345678"),
                "Expected taskName to outside requirements");
    }
}