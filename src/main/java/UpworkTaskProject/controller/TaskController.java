package UpworkTaskProject.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @PostMapping
    public int task(@RequestBody List<Integer> array){
        return array.stream().reduce(Integer::sum).orElse(0);
    }
}
