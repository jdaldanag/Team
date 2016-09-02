package team;

public class Main {

    public static void main(String[] args) {
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
              
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));

        barcelona.printPlayers();
        System.out.println(barcelona.getSize());
        System.out.println("Total goals: " + barcelona.goals());
    }
    
}
