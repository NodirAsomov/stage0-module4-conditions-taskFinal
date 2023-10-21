package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                // Handles the condition if number entered
                // is not among the valid 12 months
                System.out.println("Wrong month number");
                break;
        }
    }

    public static void main(String[] args) {
        SeasonDeterminer seasonDeterminer =new SeasonDeterminer();
        seasonDeterminer.tellTheSeason(14);
    }
    }

