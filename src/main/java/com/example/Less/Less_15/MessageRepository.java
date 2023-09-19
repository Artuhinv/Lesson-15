package com.example.Less.Less_15;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MessageRepository extends CrudRepository<Message, Integer> {
}
