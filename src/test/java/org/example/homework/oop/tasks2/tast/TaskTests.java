package org.example.homework.oop.tasks2.tast;

import org.example.homework.oop.tasks2.task.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTests {

    @Test
    public void creationTest() {
        Task task = new Task();
        String taskDescription = "Task Description";
        int taskPriority = 5;

        Assertions.assertEquals(taskDescription, task.getDescription());
        Assertions.assertEquals(taskPriority, task.getPriority());
    }
}
