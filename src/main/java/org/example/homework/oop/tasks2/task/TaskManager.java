package org.example.homework.oop.tasks2.task;

import java.util.ArrayList;
import java.util.Comparator;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addNewTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public ArrayList<Task> getSortedTasks() {
        ArrayList<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparingInt(Task::getPriority));
        return sortedTasks;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
