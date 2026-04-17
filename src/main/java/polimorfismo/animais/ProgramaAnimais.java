package polimorfismo.animais;

public class ProgramaAnimais {
    static void main() {
        Cachorro cachorro = new Cachorro("covarde", 10, "");
        Cavalo cavalo = new Cavalo("pablo", 7, "");
        Preguica preguica = new Preguica("fernando", 3, "");
        Veterinario veterinario = new Veterinario();
        Zoologico zoologico = new Zoologico();

        cachorro.correr();
        cavalo.correr();
        preguica.escalar();
        System.out.println();

        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
        System.out.println();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
        System.out.println();

        zoologico.jaulas[0] = new Cachorro("Felipe", 12, "");
        zoologico.jaulas[1] = new Cavalo("Silva", 10, "");
        zoologico.jaulas[2] = new Preguica("Jorge", 5, "");
        zoologico.jaulas[3] = new Cachorro("Bolacha", 8, "");
        zoologico.jaulas[4] = new Cavalo("Pé de Pano", 2, "");
        zoologico.jaulas[5] = new Preguica("Lucas", 3, "");
        zoologico.jaulas[6] = new Cachorro("Pedro", 11, "");
        zoologico.jaulas[7] = new Cavalo("Mostarda", 14, "");
        zoologico.jaulas[8] = new Preguica("Panetone", 20, "");
        zoologico.jaulas[9] = new Preguica("Baleia", 22, "");

        zoologico.percorrerJaulas();
    }
}
