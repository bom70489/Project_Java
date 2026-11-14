package character;

import Visual.Colours;

public class Enemy extends Character{

    public Enemy(){
        this.name_Player = "Toto"; //defalut name Toto
    }
    public Enemy(String roleName , String diff){
        this.name_Player = roleName + diff; //enemy name change according to diffeculty 
    }
    
    public void showInfo() {
        System.out.println("Name : " + Colours.RED + this.name_Player + Colours.RESET);
        System.out.println("Role : " + Colours.RED + this.role_Player.getRoleName() + Colours.RESET); 
        System.out.println(Colours.YELLOW + "-------- Roles Status --------" + Colours.RESET);
        role_Player.showStutus("\u001B[31m");
    }
}