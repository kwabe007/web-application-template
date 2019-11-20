package se.kth.sda6.skeleton.Concerts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class ConcertController {
    @Autowired
    private ConcertService concertService;

    @GetMapping
    public List<Concert> getAll ()
    {
        return concertService.getAll();
    }

    @GetMapping("/{id}")
    public Concert getById(@PathVariable Long id) {
        return concertService.getByID(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    public Concert create(@RequestBody Concert newConcert)
    {
        return concertService.create(newConcert);
    }

    @PutMapping("")
    public Concert update(@RequestBody Concert updatedConcert)
    {
        return concertService.update(updatedConcert);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        concertService.deleteById(id);
    }
}
