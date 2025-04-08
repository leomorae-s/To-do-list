package org.todoListBasic;

public enum Priority {
    MAIN_TASKS("Alta"),
    SECONDARY_TASKS("Baixa"),
    OPTIONAL_TASKS("Opcional");

    private final String description;

    Priority(String description){
        this.description = description;
    }


    @Override
    public String toString(){
        return description;
    }


}
