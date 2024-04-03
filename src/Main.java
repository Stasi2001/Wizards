public class Main {    public static void main(String[] args) {
    Wizard wizard1 = new Wizard("Jane", 100);        Wizard wizard2 = new Wizard("Max", 80);
    wizard1.makeSpell("Авада кедавра", 20);
    wizard2.makeSpell("Акцио", 30);        wizard1.rest(2);
    wizard2.rest(10);
}}
class Wizard {
    String name;
    int energy;
    public Wizard(String name, int energy){            this.name = name;
        this.energy = energy;    }
    public void makeSpell(String spellName, int spellPower) {        if (energy >= spellPower) {
        energy -= spellPower;
        System.out.println(name + " успешно сотворил заклинание " + spellName + " (осталось " + energy + " ед. магии)");        }
    else{            System.out.print(name + "Пшиииик");
    }    }
    public void rest(int hour){
        this.energy += hour;        System.out.println("После "+hour+" часов отдыха у "+name +" " + energy + " ед. магии");
    }
}