
import static java.lang.System.exit;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Otavio Lago
 * @since criada em 02/10/2025\n Classe criada para demonstrar o principio do
 * ENCAPSULAMENTO
 */
public class ContaCorrente {

    private String cliente;
    private float saldo;
    private int senha;
    private boolean bloqueio;

    //Constrói um objeto em memória
    public ContaCorrente(String cliente, float saldo, int senha, boolean bloqueio) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.senha = senha;
        this.bloqueio = bloqueio;
    }

    //Método comum para exibir os dados da conta do cliente
    public void exibirDadosContaCliente() {
        if (!verificarSenha() && bloqueio == true) {
            JOptionPane.showMessageDialog(null, "A conta está bloqueada!!!");
        } else {
            JOptionPane.showMessageDialog(null, "Nome: " + getCliente() + "\nSaldo: " + getSaldo());
        }
    }

    //Método comum para exibir os dados da conta do cliente
    public void Menu() {
        int opc = 0;
        do {
            String input = JOptionPane.showInputDialog(
                    "| Opção 1: Exibir Dados da Conta\n"
                    + "| Opção 2: Realizar Saque\n"
                    + "| Opção 3: Exibir Saldo\n"
                    + "| Opção 4: Alterar Senha\n"
                    + "| Opção 5: Sair");

            if (input != null && !input.isEmpty()) {
                opc = Integer.parseInt(input);
            } else {
                opc = 5;
            }

            switch (opc) {
                case 1:
                    exibirDadosContaCliente();
                    break;
                case 2:
                    realizarSaque();
                    break;
                case 3:
                    exibirSaldo();
                    break;
                case 4:
                    //alterarSenha();
                    break;
                case 5:
                    System.out.print("\nSaindo!\n");
                    break;
                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }
        } while (opc != 5);
    }

    //Método para modificar o saldo da conta do cliente
    public void realizarSaque() {
        while (true) {
            if (!verificarSenha() && bloqueio == true) //não verificamos pois retorna um boolean
            {
                break;
            } else {
                float vlrSaque = Float.parseFloat(JOptionPane.showInputDialog("Valor a sacar: "));
                //Verificação se há saldo para o saque
                if (getSaldo() >= vlrSaque) {
                    setSaldo(getSaldo() - vlrSaque);
                    JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!!!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Não há saldo para realizar o saque");
                }
            }
        }
    }

    //Método para exibir o saldo
    public void exibirSaldo() {
        while (true) {
            if (!verificarSenha() && bloqueio == true) //não verificamos pois retorna um boolean
            {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Saldo em conta: " + getSaldo());
            }

        }
    }

    //Método para realizar depósito
    //Método para trocar senha
    //Método para verificar senha em diversas operações
    private boolean verificarSenha() {
        int tentativa = 3;
        if (isBloqueio() == true) {
            JOptionPane.showMessageDialog(null, "Conta bloqueada!!!");
        } else {
            do {
                int pwd = Integer.parseInt(JOptionPane.showInputDialog("Senha: "));
                if (pwd != getSenha()) {
                    tentativa--;
                    JOptionPane.showMessageDialog(null, "Senha inválida!!!\nTentativas restantes: " + tentativa);
                    bloqueio = true;
                } else {
                    return true;
                }
            } while (tentativa > 0);
        }
        return false;

    }

    //Métodos assessores
    //Guarda a informação no atributo
    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Retorna o conteúdo do atributo
    private float getSaldo() {
        return saldo;
    }

    private String getCliente() {
        return cliente;
    }

    private void setCliente(String cliente) {
        this.cliente = cliente;
    }

    private int getSenha() {
        return senha;
    }

    private void setSenha(int senha) {
        this.senha = senha;
    }

    private boolean isBloqueio() {
        return bloqueio;
    }

    private void setBloqueio(boolean bloqueio) {
        this.bloqueio = bloqueio;
    }

}//fim da classe
