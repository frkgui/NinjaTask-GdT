package br.com.ninjatask;

import java.util.Scanner;

public class TarefaComum extends Tarefa{

    @Override
    public void criarTarefa(String nomeDaTarefa) {
        this.setNomeDaTarefa(nomeDaTarefa);
    }

    int contadorTarefas = 0;

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
        System.out.print("""
                O que você deseja editar?
                """);
    }

    @Override
    public void deletarTarefa(int idDaTarefa) {

    }


}
