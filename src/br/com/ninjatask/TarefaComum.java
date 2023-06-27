package br.com.ninjatask;

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
    public String verTarefa(int idDaTarefa) {
        return null;
    }

    @Override
    public void editarTarefa(int idDaTarefa) {

    }

    @Override
    public void deletarTarefa(int idDaTarefa) {

    }


}
