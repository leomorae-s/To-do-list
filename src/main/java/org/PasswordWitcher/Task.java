package org.PasswordWitcher;

public class Task {

    private String name;
    private String description;
    Priority priority;
    private boolean completed = false;

    public Task(String name, String description, Priority priority, boolean completed){
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }


    public void changeName(String name){
        this.name = name;
        System.out.println("Nome trocado com sucesso!");
    }

    public void changeDescription(String description){
        this.description = description;
        System.out.println("Descrição trocada com sucesso!");
    }

    public void changePriority(Priority priority){
        this.priority = priority;
        System.out.println("Prioridade alterada com sucesso!");
    }

    public void complete(){

        this.completed = true;
        System.out.println("Atividade completada!");
    }

    public String showTask(){

        return this.name;
    }

}
