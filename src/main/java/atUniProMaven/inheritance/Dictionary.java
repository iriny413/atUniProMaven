package atUniProMaven.inheritance;

public class Dictionary {

    public enum MessageType {
        POST("Post"),
        REPOST("Repost"),
        COMMENT("Comment"),
        DIAGNOSIS_TEXT("Diagnosetext");

        private String name;

        MessageType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

}
