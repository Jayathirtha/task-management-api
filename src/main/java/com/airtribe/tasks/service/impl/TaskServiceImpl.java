package com.airtribe.tasks.service.impl;

import com.airtribe.tasks.dto.TaskRequest;
import com.airtribe.tasks.model.Task;
import com.airtribe.tasks.repository.TaskRepository;
import com.airtribe.tasks.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

   //@Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(TaskRequest taskRequest) {
        // Business logic to map DTO to entity
        Task task = new Task(
            taskRequest.getTitle(),
            taskRequest.getDescription(),
            taskRequest.getStatus(),
            taskRequest.getPriority(),
            taskRequest.getDueDate()
        );

        // Save the task using the repository
        return taskRepository.save(task);
    }
}