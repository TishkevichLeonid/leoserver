package com.leo.server.service;

import com.leo.server.entity.Remind;
import com.leo.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImple implements ReminderService {

    @Autowired
    private RemindRepository repository;

    public List<Remind> getAll() {
        return repository.findAll();
    }

    public Remind getById(long id) {
        return repository.findOne(id);
    }

    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(long id) {
        repository.delete(id);
    }
}
