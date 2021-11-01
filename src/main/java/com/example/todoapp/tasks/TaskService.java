package com.example.todoapp.tasks;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    @AllArgsConstructor
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PRIVATE)
    static class Task{
        String name;
        boolean done;
    }

    private List<Task> tasks = new ArrayList<>();

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

    List<Task> getAllTasks(){
        return tasks;
    }
}
