package edu.brooklyn.cisc3130.taskboard.data;

import edu.brooklyn.cisc3130.taskboard.model.Task;
import edu.brooklyn.cisc3130.taskboard.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TaskRepository taskRepository;

    public DataInitializer(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) {
        if (taskRepository.count() == 0) {
            createTask("Complete Homework 7", "Finish exception handling assignment", false, Task.Priority.HIGH);
            createTask("Study for Midterm", "Review chapters 1 through 5", false, Task.Priority.HIGH);
            createTask("Buy groceries", "Milk, eggs, bread", true, Task.Priority.LOW);
            createTask("Read Textbook Chapter 6", "Read and take notes", false, Task.Priority.MEDIUM);
            createTask("Submit Homework 6", "Upload to GitHub", true, Task.Priority.HIGH);
        }
    }

    private void createTask(String title, String description, Boolean completed, Task.Priority priority) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
        task.setCompleted(completed);
        task.setPriority(priority);
        taskRepository.save(task);
    }
}