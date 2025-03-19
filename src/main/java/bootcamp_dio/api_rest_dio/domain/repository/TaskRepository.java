package bootcamp_dio.api_rest_dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bootcamp_dio.api_rest_dio.domain.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
