package preponderous.ponder.toolbox.tools;

import org.bukkit.Bukkit;
import preponderous.ponder.Ponder;
import preponderous.ponder.misc.AbstractExpandedStorageService;

/**
 * @author Daniel Stephenson
 */
public class Scheduler {

    private Ponder ponder;

    public Scheduler(Ponder ponder) {
        this.ponder = ponder;
    }

    /**
     * Method to schedule an hourly autosave. This requires an expanded storage service.
     *
     */
    public void scheduleAutosave(AbstractExpandedStorageService storageService) {
        int delay = 60 * 60; // 1 hour
        int secondsUntilRepeat = 60 * 60; // 1 hour
        Bukkit.getScheduler().scheduleSyncRepeatingTask(ponder.getPlugin(), new Runnable() {
            @Override
            public void run() {
                storageService.save();
            }
        }, delay * 20, secondsUntilRepeat * 20);
    }

}
