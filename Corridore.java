import java.util.Random;

public class Corridore extends Thread{


    private String name;
    private int metri_percorsi;

    public Corridore(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        metri_percorsi = 0;
        while(metri_percorsi < 1000){
            metri_percorsi+= new Random().nextInt(100);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " e` arrivato al traguardo");
    }
}
