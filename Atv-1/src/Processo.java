package src;

class Processo1 {
    private String nome;
    private int tempoExecucao;
    private int tempoChegada;

    public Processo1(String nome, int tempoExecucao, int tempoChegada) {

        this.nome = nome;
        this.tempoExecucao = tempoExecucao;
        this.tempoChegada = tempoChegada;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public void setTempoExecucao(int tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }
}

class Processo2 {
    private String nome;
    private int tempoExecucao;
    private int tempoChegada;
    private int prioridade;

    public Processo2(String nome, int tempoExecucao, int tempoChegada, int prioridade) {

        this.nome = nome;
        this.tempoExecucao = tempoExecucao;
        this.tempoChegada = tempoChegada;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getTempoExecucao() {
        return tempoExecucao;
    }

    public int getTempoChegada() {
        return tempoChegada;
    }

    public int getPrioridade() {
        return prioridade;
    }
}

