package com.example.todoapp.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskService {

    @AllArgsConstructor
    @Getter
    @Setter
    static class Task{
        String name;
        boolean done;
    }

    private ArrayList<Task> tasks = new ArrayList<>();

    int addTask(String taskName){
        tasks.add(new Task(taskName,false));
        return tasks.size()-1;
    }

    Task getTask(int index){
        return tasks.get(index);
        // handle case of wrong index
    }

    Task setTaskDone(int index, boolean done){
        tasks.get(index).setDone(done);
        return tasks.get(index);
    }
}
