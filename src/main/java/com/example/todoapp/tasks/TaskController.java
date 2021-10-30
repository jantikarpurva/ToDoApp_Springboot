package com.example.todoapp.tasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tasks") // this the base path
@RestController
public class TaskController {

    @GetMapping("/")
    String getAllTasks(){
        return "all tasks we get";
    }

    @GetMapping("/list")
    String getAllTasksList(){
        return "all task list is here lol";
    }
}
