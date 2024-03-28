/*
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.todo.model;

import javax.persistence.*;

@Entity
@Table(name = "todolist")
public class Todo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "todo")
    private String todo;

    @Column(name = "priority")
    private String priority;

    @Column(name = "status")
    private String status;

    public Todo(){}

    public Todo(int id, String todo, String priority, String status) {
        this.id = id;
        this.todo = todo;
        this.priority = priority;
        this.status = status;
    }

    // Get and Set Method of id
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    // Get and Set Method of Todo
    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return this.todo;
    }

    // Get and Set Method of priority
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return this.priority;
    }

    // Get and Set Method of status
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}