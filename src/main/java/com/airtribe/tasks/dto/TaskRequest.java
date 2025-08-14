package com.airtribe.tasks.dto;

import com.airtribe.tasks.enums.TaskPriority;
import com.airtribe.tasks.enums.TaskStatus;
import java.time.LocalDate;

/**
 * Single Responsibility Principle (SRP): This class has one responsibility:
 * to represent the data structure of the incoming POST request payload.
 * It's a simple POJO without any business logic.
 */
public class TaskRequest {

    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private LocalDate dueDate;

    // Getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public TaskStatus getStatus() {
        return status;
    }
    public void setStatus(TaskStatus status) {
        this.status = status;
    }
    public TaskPriority getPriority() {
        return priority;
    }
    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}