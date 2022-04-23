package net.gcnt.additionsplus.api.actions;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public enum Action {

    EVERYONE(new ArrayList<>(), ActionType.COMBINED, false, false),
    COMMAND(Lists.newArrayList("PLAYER"), ActionType.NORMAL, false, true),
    MESSAGE(Lists.newArrayList("MSG"), ActionType.NORMAL, false, true),
    CONSOLE(new ArrayList<>(), ActionType.NORMAL, false, true),
    CENTER(new ArrayList<>(), ActionType.COMBINED, false, false),
    TITLE(new ArrayList<>(), ActionType.INNER, true, true),
    LANGUAGE(new ArrayList<>(), ActionType.INNER, true, false),
    ACTIONBAR(Lists.newArrayList("ACTION"), ActionType.NORMAL, true, true),
    JSON(Lists.newArrayList("JSONMESSAGE", "JSONMSG"), ActionType.NORMAL, true, true),
    CONNECT(new ArrayList<>(), ActionType.NORMAL, true, true),
    MONEY(new ArrayList<>(), ActionType.NORMAL, true, true),
    SOUND(new ArrayList<>(), ActionType.NORMAL, true, true),
    CUSTOMITEM(Lists.newArrayList("CITEM"), ActionType.NORMAL, true, true),
    INFO(Lists.newArrayList("LOG"), ActionType.NORMAL, false, true),
    SAFELANDING(new ArrayList<>(), ActionType.STANDALONE, true, true),
    CUSTOMBOOK(Lists.newArrayList("CBOOK", "BOOK"), ActionType.NORMAL, true, true),
    KICK(new ArrayList<>(), ActionType.NORMAL, true, true),
    TELEPORT(Lists.newArrayList("TP"), ActionType.NORMAL, true, true),
    FLY(new ArrayList<>(), ActionType.NORMAL, true, true),
    ALLOWFLY(new ArrayList<>(), ActionType.NORMAL, true, true),
    FOOD(new ArrayList<>(), ActionType.NORMAL, true, true),
    HEALTH(new ArrayList<>(), ActionType.NORMAL, true, true),
    MENU(Lists.newArrayList("CUSTOMMENU", "CMENU"), ActionType.NORMAL, true, true),
    CLOSE(new ArrayList<>(), ActionType.STANDALONE, true, true),
    DELAY(Lists.newArrayList("WAIT"), ActionType.INNER, false, false),
    PERMISSION(new ArrayList<>(), ActionType.INNER, true, false),
    VGROUP(Lists.newArrayList("VAULTGROUP"), ActionType.INNER, true, false),
    CHANCE(new ArrayList<>(), ActionType.INNER, false, false),
    RNG(Lists.newArrayList("RANDOMNUMBERGENERATOR", "RANDOMNUMBER"), ActionType.INNER, false, false),
    MATH(Lists.newArrayList("CALCULATE", "CALC"), ActionType.OUTER, false, false),
    TARGET(Lists.newArrayList("TARGETS"), ActionType.INNER, false, false),
    KILL(new ArrayList<>(), ActionType.STANDALONE, true, true),
    CLEAR(new ArrayList<>(), ActionType.STANDALONE, true, true),
    CLEARCHAT(new ArrayList<>(), ActionType.STANDALONE, true, true),
    WEATHER(new ArrayList<>(), ActionType.NORMAL, true, true),
    TIME(new ArrayList<>(), ActionType.NORMAL, true, true),
    PLAYERWEATHER(Lists.newArrayList("PWEATHER"), ActionType.NORMAL, true, true),
    PLAYERTIME(Lists.newArrayList("PTIME"), ActionType.NORMAL, true, true),
    GAMEMODE(Lists.newArrayList("GM"), ActionType.NORMAL, true, true),
    SPEED(new ArrayList<>(), ActionType.NORMAL, true, true),
    WALKSPEED(Lists.newArrayList("WSPEED"), ActionType.NORMAL, true, true),
    FLYSPEED(Lists.newArrayList("FSPEED"), ActionType.NORMAL, true, true),
    PRICE(new ArrayList<>(), ActionType.INNER, true, false),
    GIVE(new ArrayList<>(), ActionType.NORMAL, true, true),
    TAKE(new ArrayList<>(), ActionType.NORMAL, true, true),
    CHAT(new ArrayList<>(), ActionType.NORMAL, false, true),
    VANISH(new ArrayList<>(), ActionType.NORMAL, true, true),

    TARGETWORLD(new ArrayList<>(), ActionType.INNER, false, false),
    RESOUREPACK(Lists.newArrayList("TEXTUREPACK"), ActionType.NORMAL, true, true),

    NOPERMISSION(new ArrayList<>(), ActionType.INNER, false, false),
    NOVGROUP(Lists.newArrayList("NOVAULTGROUP"), ActionType.INNER, true, false),
    ISCONSOLE(new ArrayList<>(), ActionType.COMBINED, false, false),
    ISPLAYER(new ArrayList<>(), ActionType.COMBINED, false, false),
    WORLD(new ArrayList<>(), ActionType.INNER, true, false),
    RETURN(new ArrayList<>(), ActionType.COMBINED, false, false),
    IF(new ArrayList<>(), ActionType.INNER, false, false),
    PLACEHOLDERS(new ArrayList<>(), ActionType.INNER, true, false),
    DISCORD(new ArrayList<>(), ActionType.NORMAL, false, true),
    REGEX(new ArrayList<>(), ActionType.INNER, false, false),
    SCRIPT(new ArrayList<>(), ActionType.OUTER, false, false),
    HTTPREQUEST(new ArrayList<>(), ActionType.INNER, false, true),
    OPERATOR(Lists.newArrayList("OP"), ActionType.NORMAL, true, true),
    RENAMEITEM(Lists.newArrayList("RENAME"), ActionType.NORMAL, true, true),
    HOLDSITEM(new ArrayList<>(), ActionType.INNER, true, false),

    HASEXPERIENCE(Lists.newArrayList("HASEXP", "HASXP"), ActionType.INNER, true, false),
    EXPERIENCE(Lists.newArrayList("EXP", "XP"), ActionType.NORMAL, true, true),
    HASLEVELS(Lists.newArrayList("HASLEVEL", "HASLVL"), ActionType.INNER, true, false),
    LEVELS(Lists.newArrayList("LEVEL", "LVL"), ActionType.NORMAL, true, true);

    final ActionType type;
    final List<String> aliases;
    final boolean requirePlayer;
    AdditionsAction additionsAction = null;
    final boolean isBaseAction;

    Action(List<String> aliases, ActionType type, boolean playersOnly, boolean isBaseAction) {
        this.isBaseAction = isBaseAction;
        this.aliases = aliases;
        this.aliases.add(this.name());
        this.type = type;
        this.requirePlayer = playersOnly;
    }

    public AdditionsAction getAction() {
        return additionsAction;
    }

    public void setAction(AdditionsAction additionsAction) {
        this.additionsAction = additionsAction;
    }

    public ActionType getType() {
        return type;
    }

    public boolean isRequirePlayer() {
        return requirePlayer;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public boolean isBaseAction() {
        return isBaseAction;
    }
}
