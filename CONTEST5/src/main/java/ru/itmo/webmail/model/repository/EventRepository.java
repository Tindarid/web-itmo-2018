package ru.itmo.webmail.model.repository;

import ru.itmo.webmail.model.domain.Event;

import java.util.List;

public interface EventRepository {
    void save(Event event);
}
