package polimorfismo.empresa;

public abstract class Comissao {
    public abstract double getAdicional();
    public abstract String getDescricao();

    public static class ComissaoGerente extends Comissao {
        @Override
        public double getAdicional() {
            return 1500.00;
        }

        public String getDescricao() { return "Gerente"; }
    }

    public static class ComissaoSupervisor extends Comissao {
        @Override
        public double getAdicional() {
            return 600.00;
        }

        public String getDescricao() { return "Supervisor"; }
    }

    public static class ComissaoVendedor extends Comissao {
        @Override
        public double getAdicional() {
            return 250.00;
        }

        public String getDescricao() { return "Vendedor"; }
    }
}


