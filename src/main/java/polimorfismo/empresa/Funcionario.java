package polimorfismo.empresa;

public class Funcionario {
    private String nome;
    private int codigo;
    private Comissao comissao;

    public double renda(){
        double adicional = (comissao != null) ? comissao.getAdicional() : 0;
        double renda = 1000;

        return renda + adicional;
    }

    public Funcionario(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        String cargo = (comissao != null) ? comissao.getClass().getSimpleName() : "Sem cargo";
        cargo = cargo.replace("Comissao", "");

        return "Nome: " + this.nome +
                " | Código: " + this.codigo +
                " | Cargo: " + cargo +
                " | Salário Total: R$ " + String.format("%.2f", this.renda());
    }
}
