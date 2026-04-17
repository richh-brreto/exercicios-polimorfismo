package polimorfismo.animais;

public class Veterinario {
    public void examinar(Animal animal){
        System.out.println("Examinando o " + animal.getNome());

        animal.emitirSom();
    }
}
