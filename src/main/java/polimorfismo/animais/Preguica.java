package polimorfismo.animais;

public class Preguica extends Animal{
    private String som;

    public void escalar(){
        System.out.println("Sou uma preguiça e estou escalando uma árvore");
    }

    public void emitirSom(){
        System.out.println(getNome() + ": " + som);
    }

    public Preguica(String nome, int idade, String som) {
        super(nome, idade);
        this.som = "Eeeeeeiiiii";
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }
}
