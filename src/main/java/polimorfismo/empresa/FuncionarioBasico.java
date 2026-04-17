package polimorfismo.empresa;

public class FuncionarioBasico extends Funcionario{
    private String escola;

    public FuncionarioBasico(String nome, int codigo, String escola) {
        super(nome, codigo);
        this.escola = escola;
    }

    @Override
    public double renda() {
        return super.renda() *  1.1;
    }

    public FuncionarioBasico (){
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
}
