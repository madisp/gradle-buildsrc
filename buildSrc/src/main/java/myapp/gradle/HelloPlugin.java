package myapp.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().create("hello", HelloTask.class);
    }
}
