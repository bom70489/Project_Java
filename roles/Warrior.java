package roles;

import Visual.Colours;

// full advantage against lancer and berserker x(1.5)
// disadvantage against arccher x(0.75), no advantage against other classes x(1.0)
public class Warrior extends Status { 
    public Warrior(){
        this.maxHealth = 320;
        this.health = 320;
        this.attack = 60;
        this.defence = 35;
        this.magic = 20;
        this.magic_resist = 35;
        this.speed = 30;
    }
    @Override 
    public String getRoleName() {
        return "Warrior";
    }
    
    @Override 
    public void showStutus(String colours) {
        System.out.println("Hp : " + colours + health + " / " + maxHealth + Colours.RESET);
        System.out.println("Attack : " + colours + attack + Colours.RESET);
        System.out.println("Defence : " + colours + defence + Colours.RESET);
        System.out.println("Magic : " + colours + magic + Colours.RESET);
        System.out.println("Magic_resistance : " + colours + magic_resist + Colours.RESET);
        System.out.println("Speed : " + colours + speed + Colours.RESET);
    }
    public void levelUp(){
        this.maxHealth += 25;
        this.attack += 5;
        this.defence += 7.5;
        this.magic += 5;
        this.magic_resist += 7.5;
    }
    public double checkAdvantage(Status role){
        switch(role.getRoleName()){
            case "Lancer" : 
            case "Berserker" : 
                System.out.print("It's Full advantage! ");
                return FULL_ADVANTAGE;
            case "Archer" : 
                System.out.print("It's Disadvantage! ");
                return DISADVANTAGE;
            default : 
                System.out.print("No advantage. ");
                return NO_ADVANTAGE;
        }
    }
}