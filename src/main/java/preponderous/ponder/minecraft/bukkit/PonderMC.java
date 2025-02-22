/*
  Copyright (c) 2022 Preponderous Software
  MIT License
 */
package preponderous.ponder.minecraft.bukkit;

import org.bukkit.plugin.java.JavaPlugin;
import preponderous.ponder.Ponder;
import preponderous.ponder.minecraft.bukkit.services.CommandService;
import preponderous.ponder.minecraft.bukkit.services.LocaleService;

/**
 * @author Daniel McCoy Stephenson
 */
public class PonderMC extends Ponder {
    private final JavaPlugin plugin;
    private final CommandService commandService;
    private final LocaleService localeService;

    /**
     * Constructor to initialize the API with a minecraft plugin.
     *
     * @param plugin JavaPlugin to initialize the API with.
     */
    public PonderMC(JavaPlugin plugin) {
        this.plugin = plugin;
        commandService = new CommandService(this);
        localeService = new LocaleService(this);
    }

    /**
     * Method to get the plugin that the API has been instantiated with.
     *
     * @return {@link JavaPlugin}
     */
    public JavaPlugin getPlugin() {
        return plugin;
    }

    /**
     * Method to get the Command Service
     *
     * @return {@link CommandService}
     */
    public CommandService getCommandService() {
        return commandService;
    }

    /**
     * Method to get the Locale Service
     *
     * @return {@link LocaleService}
     */
    public LocaleService getLocaleService() {
        return localeService;
    }
}