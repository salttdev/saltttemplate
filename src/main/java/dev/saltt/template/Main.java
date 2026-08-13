package dev.saltt.template;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.logger.HytaleLogger;

import javax.annotation.Nonnull;
import java.util.logging.Level;

public class Main extends JavaPlugin {

    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public Main(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        LOGGER.at(Level.INFO).log("[Template] Setting up...");

        LOGGER.at(Level.INFO).log("[Template] Setup complete!");
    }

    @Override
    protected void start() {
        LOGGER.at(Level.INFO).log("[Template] Started!");
    }

    @Override
    protected void shutdown() {
        LOGGER.at(Level.INFO).log("[Template] Shutting down...");
    }
}