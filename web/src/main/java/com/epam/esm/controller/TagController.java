package com.epam.esm.controller;

import com.epam.esm.entity.Tag;
import com.epam.esm.service.TagService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tags")
public class TagController {


    private TagService tagService;


    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping()
    public List<Tag> allTags(Tag tag)
    {
        // All Certificates from DAO
        return tagService.getAll();
    }
    @GetMapping("/{id}") //to our /certificate we will add "id"
    public Tag tagById(@PathVariable("id") int id, Tag tag){

        // We will get one Certificate by id from DAO
        return tagService.getById(id);
    }

    @PostMapping
    public ResponseEntity createTag(@RequestBody Tag tag){
        tagService.insert(tag);
        return ResponseEntity.status(HttpStatus.CREATED).body("Success !");
    }


    @DeleteMapping ("/{id}")
    public ResponseEntity<Object> deleteTag(@PathVariable int id){
        tagService.removeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }




}
