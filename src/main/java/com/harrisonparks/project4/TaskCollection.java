package com.harrisonparks.project4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TaskCollection implements Iterable<Task> {

    private List<Task> tasks = new ArrayList<Task>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Iterator<Task> iterator() {
        return tasks.iterator();
    }

    public void sort()
    {
        Collections.sort(tasks);
    }

}
