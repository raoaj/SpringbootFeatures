package com.example.springboot_4_features;


import com.example.springboot_4_features.HttpInterface.model.Todo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url="https://jsonplaceholder.typicode.com/todos" , accept = "application/json")
public interface TodoService {

  @GetExchange
    List<Todo> getAllTodos();
  @GetExchange
    Todo getTodoById(@PathVariable Long id);


}