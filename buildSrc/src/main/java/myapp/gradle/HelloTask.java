package myapp.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloTask extends DefaultTask {
    @TaskAction
    public void run() {
        System.out.println("Hello from task " + getPath() + "!");
    }
}
