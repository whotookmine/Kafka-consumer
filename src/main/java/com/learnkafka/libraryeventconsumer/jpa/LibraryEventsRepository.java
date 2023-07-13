package com.learnkafka.libraryeventconsumer.jpa;

import com.learnkafka.libraryeventconsumer.entity.LibraryEvent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryEventsRepository extends CrudRepository<LibraryEvent,Integer> {
}
