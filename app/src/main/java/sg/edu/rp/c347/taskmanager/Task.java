package sg.edu.rp.c347.taskmanager;

import java.io.Serializable;

/**
 * Created by 15017434 on 30/5/2017.
 */

public class Task implements Serializable {
    private int id;
    private String taskName;
    private String description;

    public Task(int id, String taskName, String description){
        this.id = id;
        this.taskName = taskName;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public String getTaskName(){
        return taskName;
    }

    public String getDescription(){
        return description;
    }

}
