package ru.clevertec.plugin;


import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TaskPlugin implements Plugin<Project> {

    public static final String GREETING = "Hello from plugin 'ru.clevertec.plugin-project'";

    @Override
    public void apply(Project project) {
        project.getTasks().register("greet", task -> {
            task.doLast(s -> System.out.println(GREETING));
        });
    }
}