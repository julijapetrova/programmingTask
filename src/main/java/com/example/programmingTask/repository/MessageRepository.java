package com.example.programmingTask.repository;

import com.example.programmingTask.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message,Long> {
}
