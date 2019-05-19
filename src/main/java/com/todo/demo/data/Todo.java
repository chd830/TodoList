package com.todo.demo.data;


public class Todo {
    private int todoNo;

    private String title;
    private String content;
    private String deadline;
    private int priority;
    private boolean isComplete;

    public int getTodoNo() {
        return todoNo;
    }

    public void setTodoNo(int todoNo) {
        this.todoNo = todoNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
