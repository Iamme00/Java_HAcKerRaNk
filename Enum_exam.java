public class Enum_exam {

    // Define the enumeration called Players
    public enum Players {
        PLAYER1("Player -1", 100),
        PLAYER2("Player -2", 150),
        PLAYER3("Player -3", 120);

        private final String plrnm;
        private final int runsscr;

        // Constructor for Players enum
        Players(String plrnm, int runsscr) {
            this.plrnm = plrnm;
            this.runsscr = runsscr;
        }

        // Method to return the number of runs scored by each player
        public int getrUns() {
            return runsscr;
        }
    }

    public static void main(String[] args) {
        // Iterate through the Players enum using values() method
        for (Players plr : Players.values()) {
            // Display the number of runs scored by each player
            System.out.println(plr.plrnm + " scored " + plr.getrUns() + " runs.");
        }
    }
}
