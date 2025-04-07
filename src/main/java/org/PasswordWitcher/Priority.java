package org.PasswordWitcher;

public enum Priority {
    MAIN_TASKS("Main tasks"),
    SECONDARY_TASKS("Secondary tesk"),
    OPTIONAL_TASKS("Optional task");

    private final String description;

    Priority(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }


}
