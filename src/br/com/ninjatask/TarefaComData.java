package br.com.ninjatask;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class TarefaComData extends Tarefa{

    private LocalDate dataLimite;

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    @Override
    public void criarTarefa(String nomeDaTarefa) {
        Scanner input = new Scanner(System.in);

        setNomeDaTarefa(nomeDaTarefa);

        System.out.print("Qual a descrição da tarefa?: ");
        setDescricaoDaTarefa(input.nextLine());

        System.out.print("Qual o ano limite da tarefa?: ");
        int ano = Integer.parseInt(input.nextLine());

        System.out.print("Qual o mês limite da tarefa?: ");
        int mes = Integer.parseInt(input.nextLine());

        System.out.print("Qual o dia limite da tarefa?: ");
        int dia = Integer.parseInt(input.nextLine());
        setDataLimite(LocalDate.of(ano,mes,dia));

        System.out.print("""
                
                Prioridade:
                        
                (1) - Baixa
                (2) - Média
                (3) - Alta
                
                """);
        System.out.print("Digite a prioridade:");
        this.setPrioridadeDaTarefa(Byte.parseByte(input.nextLine()));

        setStatusDaTarefa(StatusDaTarefa.PENDENTE);
        setIdDaTarefa(getContadorDeTarefas());
        setContadorDeTarefas(getContadorDeTarefas()+1);

        System.out.println("TAREFA CRIADA -> ID: " + getIdDaTarefa() + ", DATA LIMITE: " + dataLimite);
    }

    @Override
    public String verTarefa() {
        return null;
    }

    @Override
    public void editarTarefa(int idDaTarefa) {

    }

    @Override
    public void deletarTarefa(int idDaTarefa) {

    }
}
