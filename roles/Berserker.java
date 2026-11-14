package roles;

import Visual.Colours;

// Half Advantage against all classes x(1.25)
public class Berserker extends Status{
        public Berserker(){
        this.maxHealth = 300;
        this.health = 300;
        this.attack = 80;
        this.defence = 25;
        this.magic = 30;
        this.magic_resist = 25;
        this.speed = 40;
    }
    @Override 
    public String getRoleName() {
        return "Berserker";
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
        this.attack += 15;
        this.defence += 5;
        this.magic_resist += 5;
    }
    public double checkAdvantage(Status role){
        System.out.print("It's Half advantage! ");
        return HALF_ADVANTAGE; // 1.5x against all classes
    }
}
