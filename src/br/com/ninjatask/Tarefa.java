package br.com.ninjatask;

public abstract class Tarefa implements PrioridadeDaTarefa{

    private String nomeDaTarefa, descricaoDaTarefa;
    private int idDaTarefa;
    private byte prioridadeDaTarefa;
    private StatusDaTarefa statusDaTarefa;

    //

    public abstract void criarTarefa(String nomeDaTarefa);
    public abstract String verTarefa();
    public abstract void editarTarefa(int idDaTarefa);
    public abstract void deletarTarefa(int idDaTarefa);

    public String getNomeDaTarefa() {
        return nomeDaTarefa;
    }

    public void setNomeDaTarefa(String nomeDaTarefa) {
        this.nomeDaTarefa = nomeDaTarefa;
    }

    public String getDescricaoDaTarefa() {
        return descricaoDaTarefa;
    }

    public void setDescricaoDaTarefa(String descricaoDaTarefa) {
        this.descricaoDaTarefa = descricaoDaTarefa;
    }

    public int getIdDaTarefa() {
        return idDaTarefa;
    }

    public void setIdDaTarefa(int idDaTarefa) {
        this.idDaTarefa = idDaTarefa;
    }

    public byte getPrioridadeDaTarefa() {
        return prioridadeDaTarefa;
    }

    public void setPrioridadeDaTarefa(byte prioridadeDaTarefa) {
        this.prioridadeDaTarefa = prioridadeDaTarefa;
    }

    public StatusDaTarefa getStatusDaTarefa() {
        return statusDaTarefa;
    }

    public void setStatusDaTarefa(StatusDaTarefa statusDaTarefa) {
        this.statusDaTarefa = statusDaTarefa;
    }

    @Override
    public String toString() {

       String prioridadeString;

       if(prioridadeDaTarefa==baixa){
           prioridadeString = "baixa";
       }else if(prioridadeDaTarefa==media){
           prioridadeString = "média";
       } else if (prioridadeDaTarefa==alta) {
           prioridadeString = "alta";
       }else {
           prioridadeString = null;
       }


        return "Nome da tarefa: " + nomeDaTarefa + ", id: " + idDaTarefa +
                "\nDescrição: " + descricaoDaTarefa +
                "\nPrioridade da tarefa: " + prioridadeString +
                "\nStatus: " + statusDaTarefa;
    }
}
