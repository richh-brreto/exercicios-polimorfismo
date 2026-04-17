package polimorfismo.empresa;

public class Main {
    static void main() {

        Funcionario[] funcionarios = new Funcionario[10];

        for (int i = 0; i < 10; i++) {
            if (i < 4) funcionarios[i] = new FuncionarioBasico("Funcionario_" + (i + 1), 100 + i, "Objetivo");
            else if (i < 8) funcionarios[i] = new FuncionarioMedio("Funcionario_" + (i + 1), 200 + i, "Adventista");
            else funcionarios[i] = new FuncionarioGraduado("Funcionario_" + (i + 1), 300 + i, "Etapa", "SPTech");
        }

        for (int i = 0; i < funcionarios.length; i++) {
            if (i < 1) {
                funcionarios[i].setComissao(new Comissao.ComissaoGerente());
            } else if (i < 3) {
                funcionarios[i].setComissao(new Comissao.ComissaoSupervisor());
            } else {
                funcionarios[i].setComissao(new Comissao.ComissaoVendedor());
            }
        }

        double custoTotal = 0;

        for (Funcionario f : funcionarios) {
            System.out.println(f);
            custoTotal += f.renda();
        }

        System.out.println("---------------------------------");
        System.out.printf("Custo Total da Folha: R$ %.2f%n", custoTotal);
    }
}

