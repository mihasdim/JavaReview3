package review3;

public class SwitchDemo {
    public static void main(String[] args) {


        /*
        world cup:
        and provide winners
        */
        int worldCup=2022;

        switch (worldCup){

            case 2022:
                System.out.println("Winner is Argentina");
                break;

            case 2018:
                System.out.println("Winner is France");
                break;

            case 2014:
                System.out.println("Winner is Germany");
                break;

            default:
                System.out.println("Winner is unknown"); /*default can be anywhere (top or button of code)
                and it's optional like - else condition*/
        }

    }
}
