public class Item {
    public String name;
    public int damage;
    public Item(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public static void giveItem(Player player, Item item){
        
        player.damage = player.damage + item.damage;
        System.out.printf("Урон увеличен на %d\n", item.damage);
    } 

    
}
