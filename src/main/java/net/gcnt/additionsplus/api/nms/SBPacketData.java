package net.gcnt.additionsplus.api.nms;

public enum SBPacketData {
    v1_8("g", "c", "d", "a", "h", "i", "b", "NA", "NA", "e", "NA"),
    v1_9("h", "c", "d", "a", "i", "j", "b", "NA", "f", "e", "NA"),
    v1_13("h", "c", "d", "a", "i", "j", "b", "g", "f", "e", "NA"),
    v1_17("j", "b", "c", "i", "h", "g", "a", "f", "e", "d", "k");

    private final String members;
    private final String prefix;
    private final String suffix;
    private final String teamName;
    private final String paramInt;
    private final String packOption;
    private final String displayName;
    private final String color;
    private final String push;
    private final String visibility;
    // 1.17+
    private final String params;

    SBPacketData(String members, String prefix, String suffix, String teamName, String paramInt, String packOption, String displayName, String color, String push, String visibility, String params) {
        this.members = members;
        this.prefix = prefix;
        this.suffix = suffix;
        this.teamName = teamName;
        this.paramInt = paramInt;
        this.packOption = packOption;
        this.displayName = displayName;
        this.color = color;
        this.push = push;
        this.visibility = visibility;
        this.params = params;
    }

    public String getMembers() {
        return members;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getParamInt() {
        return paramInt;
    }

    public String getPackOption() {
        return packOption;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getColor() {
        return color;
    }

    public String getPush() {
        return push;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getParams() {
        return params;
    }
}
