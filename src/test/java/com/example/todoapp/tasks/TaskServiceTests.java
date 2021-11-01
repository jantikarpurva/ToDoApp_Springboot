package com.example.todoapp.tasks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskServiceTests {

    static int id = 0;
    @Autowired
    TaskService service;

    @Test
    void addTaskWorks(){
        var taskName = "finish this project";
        var index = service.addTask(taskName);
        assertEquals(id,index);
        id++;
    }

    @Test
    void getTaskWorks(){
        var taskName = "finish this project";
        var index = service.addTask(taskName);
        var task = service.getTask(index);
        assertEquals(taskName, task.getName());
    }

    @Test
    void setTaskWorks(){
        var taskName = "finish this project";
        var index = service.addTask(taskName);
        var task = service.setTaskDone(index, true);
        assertEquals(true,task.isDone());
    }
}
