package polimorfismo.animais;

public class Cachorro extends Animal {
    private String som;

    public void correr(){
        System.out.println("Sou um cachorro e estou correndo");
    }

    public void emitirSom(){
        System.out.println(getNome() + ": " + som);
    }

    public Cachorro(String nome, int idade, String som) {
        super(nome, idade);
        this.som = "Au au auu";
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}
