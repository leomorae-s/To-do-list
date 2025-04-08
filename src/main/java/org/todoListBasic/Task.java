package org.todoListBasic;

import java.util.List;

public class Task {

    private final int id;
    private String name;
    private String description;
    private Priority priority;
    private boolean completed = false;


    public Task(String name, String description, Priority priority, int id){
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.id =id;
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

    public void complete(Task task){

        task.completed = true;

    }

    public int getId(){
        return this.id;
    }




    @Override
    public String toString(){

        return String.format("\n\nTarefa: %s\nDescrição: %s\nPrioridade: %s\nId: %d", this.name, this.description, this.priority, this.id);

    }

}
