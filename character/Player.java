package character;

import Visual.Colours;

public class Player extends Character{    
    private int level;
    public Player() {
        this.name_Player = "Unknown";
        this.level = 1;
    }
    public Player(String name){
        this.name_Player = name;
        this.level = 1;
    }
    public void levelUpPlayer(){
        level++;
    }

    public void showInfo() {
        System.out.print("----------- Level : " + level + " --------");
        System.out.println();
        System.out.println("Name : " + Colours.BLUE + this.name_Player + Colours.RESET);
        System.out.println("Role : " + Colours.BLUE + this.role_Player.getRoleName() + Colours.RESET); 
        System.out.println(Colours.YELLOW + "-------- Roles Status --------" + Colours.RESET);
        role_Player.showStutus("\u001B[34m");
    }
}