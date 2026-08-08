abstract class Game {

    void play() {
        start();
        playGame();
        end();
    }

    abstract void start();

    abstract void playGame();

    abstract void end();
}

class Football extends Game {

    @Override
    void start() {
        System.out.println("Football Started");
    }

    @Override
    void playGame() {
        System.out.println("Playing Football");
    }

    @Override
    void end() {
        System.out.println("Football Ended");
    }
}

class Cricket extends Game {

    @Override
    void start() {
        System.out.println("Cricket Started");
    }

    @Override
    void playGame() {
        System.out.println("Playing Cricket");
    }

    @Override
    void end() {
        System.out.println("Cricket Ended");
    }
}

public class TemplateMethodDemo {

    public static void main(String[] args) {
        Football football = new Football();
        football.play();

        System.out.println();

        Cricket cricket = new Cricket();
        cricket.play();
    }
}