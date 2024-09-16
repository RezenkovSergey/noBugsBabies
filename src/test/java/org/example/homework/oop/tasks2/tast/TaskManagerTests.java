package org.example.homework.oop.tasks2.tast;

import org.example.homework.oop.tasks2.task.Task;
import org.example.homework.oop.tasks2.task.TaskManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TaskManagerTests {
    private final Task firstTask = new Task();
    private final Task secondTask = new Task();

    @BeforeEach
    public void setUp(){
        String firstTaskDescription = "First task description";
        int firstTaskPriority = 1;
        String secondTaskDescription = "Second task description";
        int secondTaskPriority = 2;

        firstTask.setDescription(firstTaskDescription);
        firstTask.setPriority(firstTaskPriority);
        secondTask.setDescription(secondTaskDescription);
        secondTask.setPriority(secondTaskPriority);
    }

    @Test
    public void addingTaskTest() {
        TaskManager taskManager = new TaskManager();
        taskManager.addNewTask(firstTask);
        ArrayList<Task> tasks = taskManager.getTasks();

        Assertions.assertEquals(1, tasks.size());
        Assertions.assertTrue(tasks.contains(firstTask));
    }

    @Test
    public void removingTaskTest(){
        TaskManager taskManager = new TaskManager();
        taskManager.addNewTask(secondTask);
        taskManager.removeTask(secondTask);
        ArrayList<Task> tasks = taskManager.getTasks();

        Assertions.assertEquals(0, tasks.size());
    }

    @Test
    public void sortingTaskTest() {
        TaskManager taskManager = new TaskManager();
        taskManager.addNewTask(secondTask);
        taskManager.addNewTask(firstTask);

        ArrayList<Task> tasks = taskManager.getSortedTasks();

        Assertions.assertEquals(firstTask, tasks.get(0));
        Assertions.assertEquals(secondTask, tasks.get(1));
    }
}
