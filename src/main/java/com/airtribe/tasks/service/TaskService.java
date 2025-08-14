package com.airtribe.tasks.service;



import com.airtribe.tasks.dto.TaskRequest;
import com.airtribe.tasks.model.Task;

public interface TaskService {
    Task createTask(TaskRequest taskRequest);
}