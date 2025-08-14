package com.airtribe.tasks.repository;



import com.airtribe.tasks.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository: Indicates that this interface is a Spring Data repository,
 * responsible for data access operations. Spring automatically creates an
 * implementation for this interface.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
