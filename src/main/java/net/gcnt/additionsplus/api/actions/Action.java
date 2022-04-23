package net.gcnt.additionsplus.api.actions;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public enum Action {

    EVERYONE(new ArrayList<>(), ActionType.COMBINED, false),
    COMMAND(Lists.newArrayList("PLAYER"), ActionType.NORMAL, false),
    MESSAGE(Lists.newArrayList("MSG"), ActionType.NORMAL, false),
    CONSOLE(new ArrayList<>(), ActionType.NORMAL, false),
    CENTER(new ArrayList<>(), ActionType.COMBINED, false),
    TITLE(new ArrayList<>(), ActionType.INNER, true),
    LANGUAGE(new ArrayList<>(), ActionType.INNER, true),
    ACTIONBAR(Lists.newArrayList("ACTION"), ActionType.NORMAL, true),
    JSON(Lists.newArrayList("JSONMESSAGE", "JSONMSG"), ActionType.NORMAL, true),
    CONNECT(new ArrayList<>(), ActionType.NORMAL, true),
    MONEY(new ArrayList<>(), ActionType.NORMAL, true),
    SOUND(new ArrayList<>(), ActionType.NORMAL, true),
    CUSTOMITEM(Lists.newArrayList("CITEM"), ActionType.NORMAL, true),
    INFO(Lists.newArrayList("LOG"), ActionType.NORMAL, false),
    SAFELANDING(new ArrayList<>(), ActionType.STANDALONE, true),
    CUSTOMBOOK(Lists.newArrayList("CBOOK", "BOOK"), ActionType.NORMAL, true),
    KICK(new ArrayList<>(), ActionType.NORMAL, true),
    TELEPORT(Lists.newArrayList("TP"), ActionType.NORMAL, true),
    FLY(new ArrayList<>(), ActionType.NORMAL, true),
    ALLOWFLY(new ArrayList<>(), ActionType.NORMAL, true),
    FOOD(new ArrayList<>(), ActionType.NORMAL, true),
    HEALTH(new ArrayList<>(), ActionType.NORMAL, true),
    MENU(Lists.newArrayList("CUSTOMMENU", "CMENU"), ActionType.NORMAL, true),
    CLOSE(new ArrayList<>(), ActionType.STANDALONE, true),
    DELAY(Lists.newArrayList("WAIT"), ActionType.INNER, false),
    PERMISSION(new ArrayList<>(), ActionType.INNER, true),
    VGROUP(Lists.newArrayList("VAULTGROUP"), ActionType.INNER, true),
    CHANCE(new ArrayList<>(), ActionType.INNER, false),
    RNG(Lists.newArrayList("RANDOMNUMBERGENERATOR", "RANDOMNUMBER"), ActionType.INNER, false),
    MATH(Lists.newArrayList("CALCULATE", "CALC"), ActionType.OUTER, false),
    TARGET(Lists.newArrayList("TARGETS"), ActionType.INNER, false),
    KILL(new ArrayList<>(), ActionType.STANDALONE, true),
    CLEAR(new ArrayList<>(), ActionType.STANDALONE, true),
    CLEARCHAT(new ArrayList<>(), ActionType.STANDALONE, true),
    WEATHER(new ArrayList<>(), ActionType.NORMAL, true),
    TIME(new ArrayList<>(), ActionType.NORMAL, true),
    PLAYERWEATHER(Lists.newArrayList("PWEATHER"), ActionType.NORMAL, true),
    PLAYERTIME(Lists.newArrayList("PTIME"), ActionType.NORMAL, true),
    GAMEMODE(Lists.newArrayList("GM"), ActionType.NORMAL, true),
    SPEED(new ArrayList<>(), ActionType.NORMAL, true),
    WALKSPEED(Lists.newArrayList("WSPEED"), ActionType.NORMAL, true),
    FLYSPEED(Lists.newArrayList("FSPEED"), ActionType.NORMAL, true),
    PRICE(new ArrayList<>(), ActionType.INNER, true),
    GIVE(new ArrayList<>(), ActionType.NORMAL, true),
    TAKE(new ArrayList<>(), ActionType.NORMAL, true),
    CHAT(new ArrayList<>(), ActionType.NORMAL, false),
    VANISH(new ArrayList<>(), ActionType.NORMAL, true),

    TARGETWORLD(new ArrayList<>(), ActionType.INNER, false),
    RESOUREPACK(Lists.newArrayList("TEXTUREPACK"), ActionType.NORMAL, true),

    NOPERMISSION(new ArrayList<>(), ActionType.INNER, false),
    NOVGROUP(Lists.newArrayList("NOVAULTGROUP"), ActionType.INNER, true),
    ISCONSOLE(new ArrayList<>(), ActionType.COMBINED, false),
    ISPLAYER(new ArrayList<>(), ActionType.COMBINED, false),
    WORLD(new ArrayList<>(), ActionType.INNER, true),
    RETURN(new ArrayList<>(), ActionType.COMBINED, false),
    IF(new ArrayList<>(), ActionType.INNER, false),
    PLACEHOLDERS(new ArrayList<>(), ActionType.INNER, true),
    DISCORD(new ArrayList<>(), ActionType.NORMAL, false),
    REGEX(new ArrayList<>(), ActionType.INNER, false),
    SCRIPT(new ArrayList<>(), ActionType.OUTER, false),
    HTTPREQUEST(new ArrayList<>(), ActionType.INNER, false),
    OPERATOR(Lists.newArrayList("OP"), ActionType.NORMAL, true),
    RENAMEITEM(Lists.newArrayList("RENAME"), ActionType.NORMAL, true),
    HOLDSITEM(new ArrayList<>(), ActionType.INNER, true),

    HASEXPERIENCE(Lists.newArrayList("HASEXP", "HASXP"), ActionType.INNER, true),
    EXPERIENCE(Lists.newArrayList("EXP", "XP"), ActionType.NORMAL, true),
    HASLEVELS(Lists.newArrayList("HASLEVEL", "HASLVL"), ActionType.INNER, true),
    LEVELS(Lists.newArrayList("LEVEL", "LVL"), ActionType.NORMAL, true);

    final ActionType type;
    List<String> aliases = new ArrayList<>();
    boolean requirePlayer = true;
    AdditionsAction additionsAction = null;

    Action(ActionType type) {
        this.type = type;
    }

    Action(List<String> aliases, ActionType type) {
        this.aliases = aliases;
        this.type = type;
    }

    Action(List<String> aliases, ActionType type, boolean playersOnly) {
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
}
