package se.kth.sda6.skeleton.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.PostUpdate;
import java.util.List;

/*
    @TODO AutoWire PostService and create the methods needed to implement the API.
    Don't forget to add necessary annotations.
 */

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    // get all posts
    @GetMapping("/posts")
    public List<Post> getAll() {
        return postService.getAll();
    }

    // create a post
    @PostMapping("/posts")
    public Post create(@RequestBody Post newPost) {
        return postService.save(newPost);
    }

    // get a specific post by ID
    @PostMapping("/posts/{id}")
    public Post getById(@PathVariable Long id) {
        return postService.getByID(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    // update a post
    @PutMapping("/posts")
    public Post update(@RequestBody Post newPost) {
        return postService.update(newPost);
    }

    // delete a post
    @DeleteMapping("/posts/{id}")
    public void delete(@PathVariable Long id) {
        postService.deleteById(id);
    }
}
