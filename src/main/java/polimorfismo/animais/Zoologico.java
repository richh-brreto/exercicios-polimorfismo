package polimorfismo.animais;

public class Zoologico  {
    Animal[] jaulas = new Animal[10];

    public void percorrerJaulas(){
        for (int i = 0; i < jaulas.length; i++) {
            System.out.println("Animal: " + jaulas[i].getNome() + ", Idade: " + jaulas[i].getIdade());

            if(jaulas[i] instanceof Cavalo) {
                ((Cavalo) jaulas[i]).correr();
                System.out.println();

            } else if (jaulas[i] instanceof Cachorro) {
                ((Cachorro) jaulas[i]).correr();
                System.out.println();
            }
        }
    }
}
