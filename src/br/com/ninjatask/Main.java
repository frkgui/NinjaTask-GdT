package br.com.ninjatask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(">> Seja bem vindo ao NinjaTask");
        byte selecaoMenu = 1;


        System.out.println("""
                
                >> Opções disponíveis:
                
                >> (1) - Criar tarefa
                >> (2) - Ver tarefa
                >> (3) - Editar tarefa
                >> (4) - Excluir tarefa
                >> (0) - Sair
                """);
        System.out.print(">> Digite a opção desejada: ");
        byte opcaoSelecionada = Byte.parseByte(input.nextLine());

        do{


        switch (opcaoSelecionada) {
            case 0 -> System.exit(0);
            case 1 -> {
                int contadorDeTarefas = 1;

                System.out.println("""
                                                
                        >> Tipos de tarefa:
                                                
                        >> (1) - Tarefa Comum
                        >> (2) - Tarefa com data
                        """);
                System.out.print(">> Digite o tipo de tarefa: ");
                byte tipoSelecionado = Byte.parseByte(input.nextLine());
                if (tipoSelecionado == 1) {
                    TarefaComum tarefaComum = new TarefaComum();

                    System.out.print("\n>> Digite o nome da tarefa: ");
                    String nomeDaTarefa =input.nextLine();

                    System.out.println("""
                            
                            Prioridades:
                            
                            (1) - Baixa
                            (2) - Médio
                            (3) - Alta
                            """);
                    System.out.print("Escolha o nível de prioridade: ");
                    byte prioridadeDaTarefa = Byte.parseByte(input.nextLine());

                    System.out.println("\nDigite a descrição da tarefa: ");
                    String descricaoDaTarefa = input.nextLine();

                    tarefaComum.criarTarefa(nomeDaTarefa,descricaoDaTarefa,prioridadeDaTarefa);

                    tarefaComum.setStatusDaTarefa(StatusDaTarefa.PENDENTE);
                    tarefaComum.setIdDaTarefa(contadorDeTarefas);
                    contadorDeTarefas++;


                    System.out.println("\n"+tarefaComum.toString());
                } else if (tipoSelecionado == 2) {
                    TarefaComData tarefaComData = new TarefaComData();

                    System.out.print("Digite o nome da tarefa: ");
                    String nomeDaTarefa = input.nextLine();

                    tarefaComData.criarTarefa(nomeDaTarefa);

                }
                break;
            }
            default -> System.exit(0);

        }
            System.out.println("""
                
                >> Opções disponíveis:
                
                >> (1) - Criar tarefa
                >> (2) - Ver tarefa
                >> (3) - Editar tarefa
                >> (4) - Excluir tarefa
                >> (0) - Sair
                """);
            System.out.print(">> Digite a opção desejada: ");
            opcaoSelecionada = Byte.parseByte(input.nextLine());

        }while(selecaoMenu!=0);
    }
}
