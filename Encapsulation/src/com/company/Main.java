package com.company;

public class Main {
    public static void main(String[] args) {
        EnhancePlayer player = new EnhancePlayer("Anh", 500, "Sword");
        System.out.println("Initial health is " + player.getHealth());

        /*Player player = new Player();
        player.name = "Anh";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaning health = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaning health = " + player.healthRemaining());
*/
    }
}


