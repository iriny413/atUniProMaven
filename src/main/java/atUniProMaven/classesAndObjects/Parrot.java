package atUniProMaven.classesAndObjects;

public class Parrot {

    String phrase;

    //SPEAK
    public void speak() {

        System.out.println(phrase);
    }

    //TEACH
    public void teach(String text) {
        phrase = text;
    }
}

class ParrotSpeaks {
    public static void main(String[] args) {

        Parrot polly = new Parrot();
        polly.speak();

        String text = "Polly want a cracker";
        polly.teach(text);
        polly.speak();

        text = "You're ugly!";
        polly.teach(text);
        polly.speak();
    }
}
