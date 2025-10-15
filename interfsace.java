// Interface Playable with play() method
interface Playable {
    void play();
}

// Cricket class implements Playable
class Cricket implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Cricket - a bat-and-ball game.");
    }
}

// Football class implements Playable
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football - a popular team sport.");
    }
}

public class GameDemo {
    public static void main(String[] args) {
        Playable game1 = new Cricket();
        Playable game2 = new Football();

        game1.play();  // Output for Cricket
        game2.play();  // Output for Football
    }
}
