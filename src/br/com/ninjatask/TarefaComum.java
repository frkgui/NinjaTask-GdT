package br.com.ninjatask;

import java.util.Scanner;

public class TarefaComum extends Tarefa{

    @Override
    public void criarTarefa(String nomeDaTarefa) {
        this.setNomeDaTarefa(nomeDaTarefa);
    }

    int contadorTarefas = 1;

    public void criarTarefa(String nomeDaTarefa, String descricaoDaTarefa, byte prioridadeDaTarefa){
        this.setNomeDaTarefa(nomeDaTarefa);
        this.setDescricaoDaTarefa(descricaoDaTarefa);

        setIdDaTarefa(contadorTarefas++);
        setStatusDaTarefa(StatusDaTarefa.PENDENTE);
        setPrioridadeDaTarefa(prioridadeDaTarefa);
    }

    @Override
    public String verTarefa() {
        return this.toString();
    }

    @Override
    public void editarTarefa(int idDaTarefa) {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Modo de edição:
                
                (1) - Editar nome;
                (2) - Editar prioridade;
                (3) - Editar status;
                (4) - Editar descrição;
                (0) - Sair;
                
                """);
        System.out.print("O que você deseja editar?: ");
        byte opcaoSelecionada = Byte.parseByte(input.nextLine());

        switch (opcaoSelecionada){

            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.print("Digite o novo nome: ");
                this.setNomeDaTarefa(input.nextLine());

                System.out.println("\nTarefa atualizada com sucesso!");
                break;
            case 2:
                System.out.println("""
                        
                        Prioridade:
                        
                        (1) - Baixa
                        (2) - Média
                        (3) - Alta
                        
                        """);
                System.out.print("Escolha a prioridade:");
                this.setPrioridadeDaTarefa(Byte.parseByte(input.nextLine()));
            case 3:
                System.out.println("""
                        
                        Status:
                        (1) - PENDENTE (Padrão);
                        (2) - EM_ANDAMENTO;
                        (3) - CONCLUÍDO;
                        """);
                        System.out.print("Defina o Status:");
                        byte statusSelecionado = Byte.parseByte(input.nextLine());

                        switch (statusSelecionado){
                            case 1:
                                this.setStatusDaTarefa(StatusDaTarefa.PENDENTE);
                                break;
                            case 2:
                                this.setStatusDaTarefa(StatusDaTarefa.EM_ANDAMENTO);
                                break;
                            case 3:
                                this.setStatusDaTarefa(StatusDaTarefa.CONCLUIDO);
                                break;
                            default:
                                System.exit(0);
                                break;
                        }
            case 4:
                System.out.print("Digite a descrição: ");
                this.setDescricaoDaTarefa(input.nextLine());

            default:
                System.exit(0);
        }

    }

    @Override
    public void deletarTarefa(int idDaTarefa) {

    }


}
