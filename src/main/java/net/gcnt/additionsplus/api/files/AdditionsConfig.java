package net.gcnt.additionsplus.api.files;

import net.gcnt.additionsplus.api.objects.DiscordWebhook;

import java.util.List;

public interface AdditionsConfig {

    int getMaxActionsPerTick();

    boolean isIntervalActionsEnabled();

    boolean isIntervalActionsRandom();

    long getIntervalActionsInterval();

    boolean isAllowIntervalRepeatOnRandom();

    boolean isIgnorePermissionCheckForMenusWhenConsole();

    boolean isIgnoreCooldownCheckForMenusWhenConsole();

    boolean isDiscordHookEnabled();

    boolean isScoreboardPerWorldEnabled();

    boolean isScoreboardEnabled();

    boolean isRemoveScoreboardWhenDisabled();

    List<DiscordWebhook> getDiscordWebhooks();

    int getScoreboardUpdateInterval();

    boolean isDisplayMainScoreboardWhenNoPerWorldFound();

    boolean isCheckForBetaUpdates();

    boolean isSendCommandSuggestions();

    int getMaxCommandSuggestions();

    int getCenterMessagePixels();

    boolean isReplaceEveryonePlaceholdersAsReceiver();

    boolean isNameTagsEnabled();

    boolean isTablistsEnabled();

    boolean isPerWorldTablistsEnabled();

    long getTablistsUpdateInterval();

}
