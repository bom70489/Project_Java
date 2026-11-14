package roles;

import Visual.Colours;

// full advantage against assassin and berserker x(1.5)
// disadvantage against rider x(0.75), no advantage against other classes x(1.0)
public class Mage extends Status {
    public Mage(){
        this.maxHealth = 250;
        this.health = 250;
        this.attack = 20;
        this.defence = 30;
        this.magic = 100;
        this.magic_resist = 30;
        this.speed = 20;
    }
    @Override 
    public String getRoleName() {
        return "Mage";
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
        this.maxHealth += 10;
        this.attack += 10;
        this.defence += 5;
        this.magic += 20;
        this.magic_resist += 5;
    }
    public double checkAdvantage(Status role){
        switch(role.getRoleName()){
            case "Assassin" : 
            case "Berserker" : 
                System.out.print("It's Full advantage! ");
                return FULL_ADVANTAGE;
            case "Rider" : 
                System.out.print("It's Disadvantage! ");
                return DISADVANTAGE;
            default : 
                System.out.print("No advantage. ");
                return NO_ADVANTAGE;
        }
    }
}
