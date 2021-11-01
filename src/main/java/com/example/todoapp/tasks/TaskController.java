package com.example.todoapp.tasks;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/tasks") // this the base path
@RestController
public class TaskController {

    @Data
    static class AddTaskBody{
        String task;
    }


    @Autowired
    TaskService taskService;

    @GetMapping("/")
    List<TaskService.Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    TaskService.Task getAllTasksList(@PathVariable("id") int taskId){
        return taskService.getTask(taskId);
    }

    @PostMapping("/")
    TaskService.Task addNewTask(@RequestBody AddTaskBody body){
        int index = taskService.addTask(body.task);
        return taskService.getTask(index);
    }

    @PutMapping("/{id}/done")
    TaskService.Task setTaskDone(@PathVariable("id") int taskId){
        taskService.setTaskDone(taskId,true);
        return taskService.getTask(taskId);
    }
    @DeleteMapping("/{id}/done")
    void setTaskUndone(@PathVariable("id") int taskId){
        taskService.setTaskDone(taskId,false);
    }

}
