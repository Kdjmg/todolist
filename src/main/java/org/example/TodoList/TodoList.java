package org.example.TodoList;

import java.util.ArrayList;
import java.util.List;



public class TodoList {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        tasks.remove(index);
    }

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public int getSize() {
        return tasks.size();
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "tasks=" + tasks +
                '}';
    }
}