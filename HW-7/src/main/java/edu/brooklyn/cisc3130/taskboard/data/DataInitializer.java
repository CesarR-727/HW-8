package edu.brooklyn.cisc3130.taskboard.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import edu.brooklyn.cisc3130.taskboard.model.Task;
import edu.brooklyn.cisc3130.taskboard.repository.TaskRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    private final TaskRepository taskRepository;

    public DataInitializer(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) {
        if (taskRepository.count() == 0) {
            taskRepository.save(new Task(
                null, "Complete Homework 6",
                "Finish Spring Data JPA assignment",
                false, Task.Priority.HIGH, null, null));

            taskRepository.save(new Task(
                null, "Study for Midterm",
                "Review chapters 1 through 5",
                false, Task.Priority.HIGH, null, null));

            taskRepository.save(new Task(
                null, "Buy groceries",
                "Milk, eggs, bread",
                true, Task.Priority.LOW, null, null));

            taskRepository.save(new Task(
                null, "Read Textbook Chapter 6",
                "Read and take notes",
                false, Task.Priority.MEDIUM, null, null));

            taskRepository.save(new Task(
                null, "Submit Homework 5",
                "Upload to GitHub and submit link",
                true, Task.Priority.HIGH, null, null));
        }
    }
}