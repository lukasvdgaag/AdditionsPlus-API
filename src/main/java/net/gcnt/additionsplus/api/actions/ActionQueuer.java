package net.gcnt.additionsplus.api.actions;

import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.List;

public interface ActionQueuer {

    @Deprecated
    void addToQueue(Player p, List<String> actions, List<World> worlds, List<String> worldNames, List<ActionSender> onlinePlayers);

    void addToQueue(ActionSender sender, List<String> actions, List<World> worlds, List<String> worldNames, List<ActionSender> onlinePlayers);

    void performQueued();

    List<Player> getTargets(String action, ActionSender sender, List<ActionSender> onlinePlayers);

    void openPossibleSkywarsMenu(Player p, String id);

}
