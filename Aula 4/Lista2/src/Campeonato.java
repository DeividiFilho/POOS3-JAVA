public class Campeonato {
    private int ano;
    private String nomePatrocinador;
    private String divisao;
    private double valorPremiacao;
    private List<Time> times;
    private List<Rodada> rodadas;

    public Campeonato(int ano, String nomePatrocinador, String divisao, double valorPremiacao, List<Time> times, List<Rodada> rodadas) {
        this.ano = ano;
        this.nomePatrocinador = nomePatrocinador;
        this.divisao = divisao;
        this.valorPremiacao = valorPremiacao;
        this.times = times;
        this.rodadas = rodadas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNomePatrocinador() {
        return nomePatrocinador;
    }

    public void setNomePatrocinador(String nomePatrocinador) {
        this.nomePatrocinador = nomePatrocinador;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

    public double getValorPremiacao() {
        return valorPremiacao;
    }

    public void setValorPremiacao(double valorPremiacao) {
        this.valorPremiacao = valorPremiacao;
    }

    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public List<Rodada> getRodadas() {
        return rodadas;
    }

    public void setRodadas(List<Rodada> rodadas) {
        this.rodadas = rodadas;
    }

    public List<Time> getClassificacao() {
        List<Time> classificacao = new ArrayList<>();
        for (Time time : this.times) {
            classificacao.add(time);
        }
        classificacao.sort(new Comparator<Time>() {
            @Override
            public int compare(Time o1, Time o2) {
                return o2.getPontos() - o1.getPontos();
            }
        });
        return classificacao;
}
