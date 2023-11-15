//create enum class
enum Sur {
    // enum items
    Birthday, Marrage, Engagement, Party;
}

public class App {

    public static void main(String[] args) {
        Sur sur = Sur.Birthday;
        System.out.println(sur + "\n");

        // printing all value
        Sur[] sur2 = Sur.values(); // it is a array
        for (Sur sur3 : sur2) {
            System.out.println(sur3);
        }

        // for a new line
        System.out.println();

        // using if else

        if (sur == Sur.Marrage) {
            System.out.println("Happy marrage life");
        } else if (sur == Sur.Party) {
            System.out.println("Enjoy The Party");
        } else if (sur == Sur.Birthday) {
            System.out.println("Happy Birthday");
        } else {
            System.out.println("very well wishes for you");
        }

        // for a new line
        System.out.println();

        // switch case
        switch (sur) {
            case Marrage:
                System.out.println("Happy marrage life");
                break;
            case Party:
                System.out.println("Enjoy The Party");
                break;
            case Engagement:
                System.out.println("very well wishes for you");
            default:
                System.out.println("Happy Birthday");
                break;
        }
        System.out.println();
        
        // printing the super class
        System.out.println(sur.getClass().getSuperclass());
        System.out.println();



        // frout here

        Frout f = Frout.Apple;
        System.out.println(f + " " + f.getPrice());

        System.out.println();


        for (Frout fr : Frout.values()) {
            System.out.println(fr + " "+ fr.getPrice());
        }

    }
}

enum Frout {
    Apple(29), Orange(19), Grapes(44),Banana;

    private int price;

    // adding values for these enum methods
    private Frout(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // also can add price using default constructor
    Frout(){
        price= 12;
    }
}
