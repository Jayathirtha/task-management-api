package com.airtribe.tasks.controller;

import com.airtribe.tasks.dto.TaskRequest;
import com.airtribe.tasks.model.Task;
import com.airtribe.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController: A convenience annotation that combines @Controller and @ResponseBody,
 * indicating that this class handles web requests and the return value should be
 * bound to the web response body.
 * @RequestMapping: Maps HTTP requests to handler methods of MVC and REST controllers.
 */
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    // Dependency Injection via constructor
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    /**
     * @PostMapping: A shortcut for @RequestMapping(method = RequestMethod.POST).
     * @RequestBody: Binds the body of the incoming HTTP request to this method's parameter.
     */
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody TaskRequest taskRequest) {
        Task createdTask = taskService.createTask(taskRequest);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }
}