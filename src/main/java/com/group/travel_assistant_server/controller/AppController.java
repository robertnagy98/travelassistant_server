package com.group.travel_assistant_server.controller;
import com.group.travel_assistant_server.entities.Highlight;
import com.group.travel_assistant_server.entities.User;
import com.group.travel_assistant_server.repositories.HighlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.group.travel_assistant_server.repositories.UserRepository;

import java.util.List;

@RestController
public class AppController
{
    UserRepository userRepository;
    HighlightRepository highlightRepository;

    @Autowired
    public AppController(UserRepository userRepository, HighlightRepository highlightRepository)
    {
        this.userRepository=userRepository;
        this.highlightRepository=highlightRepository;
        System.out.println("Creating user");
        User user = new User( "admin", "Admin", "Admin", "admin@gmail.com", "Admin Land", "15/07/1995", "Admin", "0", "0", "12/03/2021", "admin");
        System.out.println("Username is " + user.getUsername());
        userRepository.save(user);
        System.out.println("Saved user in repository");
        System.out.println("Creating highlight");
        Highlight highlight = new Highlight(1, "To the moon","Went to moon, was nice","admin");
        highlightRepository.save(highlight);
        System.out.println("Saved highlight in repository");
    }

    @RequestMapping("/hello")
    public String home(){
        return "Hello World!";
    }

    @GetMapping("/users")
    public List<User> GetAllUsers()
    {
        List<User> userList= userRepository.findAll();
        return userList;
    }

    @GetMapping("/users/{username}")
    public User GetUser(@PathVariable("username")String username)
    {
        return userRepository.findByUsername(username);
    }

    @PostMapping("/users/new")
    public int AddUser(@RequestBody User user)
    {
        try {
            userRepository.save(user);
            System.out.println("Added user to repository");
            return 0;
        }
        catch (Exception e)
        {
            System.out.println("Failed to add user to repository. Error is: " +e.getMessage());
            return 1;
        }
    }

    @GetMapping("/users/count")
    public int CountUsers()
    {
        return (int) userRepository.count();
    }

    @GetMapping("/highlights")
    public List<Highlight> GetAllHighlights()
    {
        List<Highlight> highlightList= highlightRepository.findAll();
        return highlightList;
    }

    @GetMapping("/highlights/{username}")
    public List<Highlight> GetAllHighlights(@PathVariable("username")String username)
    {
        return highlightRepository.findAllByUsername(username);
    }

    @PostMapping("/highlights/new")
    public int AddHighlight(@RequestBody Highlight highlight)
    {
        try {
            highlightRepository.save(highlight);
            System.out.println("Added highlight to repository");
            return 0;
        }
        catch (Exception e)
        {
            System.out.println("Failed to add highlight to repository. Error is: " +e.getMessage());
            return 1;
        }
    }

    @GetMapping("/highlights/count")
    public int CountHighlights()
    {
        return (int) highlightRepository.count();
    }
}
