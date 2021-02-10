package atUniProMaven.inheritance;

public enum MessageType {

    POST("Post"),
    REPOST("Repost"),
    COMMENT("Comment");

    private String name;

    MessageType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
