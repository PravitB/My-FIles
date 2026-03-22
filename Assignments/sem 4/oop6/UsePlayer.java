// 7. Create an interface called Player. Create classes Child, Musician, and Actor that implement Player.

interface Player {
    void play();
}

class Child implements Player {
    public void play() {
        System.out.println("Child: Playing with toys and having fun!");
    }
}

class Musician implements Player {
    public void play() {
        System.out.println("Musician: Playing musical instruments and creating harmonious melodies");
    }
}

class Actor implements Player {
    public void play() {
        System.out.println("Actor: Playing roles and acting in performances");
    }
}

public class UsePlayer {
    public static void main(String[] args) {
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();

        child.play();
        musician.play();
        actor.play();
    }
}
