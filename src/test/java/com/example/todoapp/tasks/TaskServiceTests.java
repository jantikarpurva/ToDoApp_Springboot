package com.example.todoapp.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskServiceTests {

    private TaskService getTaskService(){
        return new TaskService();
    }

    @Test
    void addTaskWorks(){
        var service = getTaskService();
        var taskName = "finish this project";
        var index = service.addTask(taskName);
        assertEquals(0,index);
    }

    @Test
    void getTaskWorks(){
        var service = getTaskService();
        var taskName = "finish this project";
        var index = service.addTask(taskName);
        var task = service.getTask(0);
        assertEquals(taskName, task.getName());
    }

    @Test
    void setTaskWorks(){
        var service = getTaskService();
        var taskName = "finish this project";
        var index = service.addTask(taskName);
        var task = service.setTaskDone(index, true);
        assertEquals(true,task.isDone());
    }
}
