public class Worm {

    //attribute
    String userName;
    int score;
    double length;


    //behavior
    void eatsnack(){
        System.out.println("Nom... nom... nom...");
    }

    void eatOthers(Worm worm){
        score += 500;
    }

}
