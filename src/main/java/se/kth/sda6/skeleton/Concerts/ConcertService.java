package se.kth.sda6.skeleton.Concerts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.Optional;

@Service
public class ConcertService {
    @Autowired
    private ConcertRepositioy repository;

    public List<Concert> getAll() {
        return repository.findAll();
    }

    public Optional<Concert> getByID(Long id) {
        return repository.findById(id);

    }

    public Concert create(@RequestBody Concert newConcert) {
        return repository.save(newConcert);
    }

    public Concert update(@RequestBody Concert updatedConcert) {
        return repository.save(updatedConcert);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
