public class Player {
    public static long idCounter = 1L;
    public long id;
    public String name;
    public double damage;
    public double hp;
    public Player(String name, double damage, Double hp){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        id = idCounter++;
    }
    public Player(String name){
        this(name, 100.0, 10.0);
    }
    
    public void attack(Player player){
        player.hp = player.hp - damage;
        if (player.hp>0) {
            System.out.println(player.hp);
        }
        else{
            System.out.println("Игрок мертв");
        } 
    }
    public long getId(){
        return id;
    }

}
