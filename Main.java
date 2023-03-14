public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Arc", 55.0, 200.0 );
        Player player2 = new Player("Zeus", 130.0, 800.0);
        Player player3 = new Player("Pugna", 200.0, 600.0);
        Player player4 = new Player("Gyro", 300.0, 300.0);
        Player player5 = new Player("Mikhail");
        Player player6 = new Tank("Pudge");
        Player player7 = new Mage("Appparat");
        Player player8 = new Warloc("ShadowShaman");

        Item Mom = new Item("Mom", 10);
        Item.giveItem(player6, Mom);

        player1.attack(player2);
        player4.attack(player5);
        player8.attack(player6);
        System.out.println(player1.getId());
        System.out.println(player2.getId());
        System.out.println(player3.getId());
        System.out.println(player4.getId());
        System.out.println(player5.getId());
        System.out.println(player6.getId());
        System.out.println(player7.getId());
    }
    
}