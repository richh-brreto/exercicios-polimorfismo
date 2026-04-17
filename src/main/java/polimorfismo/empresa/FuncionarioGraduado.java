package polimorfismo.empresa;

public class FuncionarioGraduado extends FuncionarioMedio {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigo, String escola, String universidade) {
        super(nome, codigo, escola);
        this.universidade = universidade;
    }

    @Override
    public double renda() {
        return super.renda() * 2;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public FuncionarioGraduado(){
    }
}
