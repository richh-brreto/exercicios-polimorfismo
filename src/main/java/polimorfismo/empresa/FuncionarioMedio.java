package polimorfismo.empresa;

public class FuncionarioMedio extends FuncionarioBasico {
    @Override
    public double renda() {
        return super.renda() * 1.5;
    }

    public FuncionarioMedio(String nome, int codigo, String escola) {
        super(nome, codigo, escola);
    }

    public FuncionarioMedio(){
    }
}
