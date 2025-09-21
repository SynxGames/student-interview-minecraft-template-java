package me.candidate.miniproject;

import me.candidate.miniproject.scaffold.command.CommandScaffold;
import me.candidate.miniproject.scaffold.command.example.ExampleCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class MiniProjectPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        // Scaffolding Initialisation

        // Initialise the Command Scaffold and all Incendo components
        CommandScaffold commandScaffold = new CommandScaffold(this);

        // Register the ExampleCommand provided within the scaffolding
        commandScaffold.registerAnnotatedCommand(new ExampleCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
