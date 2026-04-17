package polimorfismo.animais;

public class Cavalo extends Animal {
    private String som;

    public void correr(){
        System.out.println("Sou um cavalo e estou correndo");
    }

    public void emitirSom(){
        System.out.println(getNome() + ": " + som);
    }

    public Cavalo(String nome, int idade, String som) {
        super(nome, idade);
        this.som = "Iiirrrrí";
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}
