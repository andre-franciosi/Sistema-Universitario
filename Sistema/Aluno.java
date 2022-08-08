abstract public class Aluno {

    protected String nome;
    private int idade;
    private double mensalidade;
    private int aulas_semana;
    private int periodo;
    protected int cod;
    
    public Aluno(int cod,String nome, int idade, double mensalidade, int aulas_semana, int periodo)
    {

        this.nome = nome;
        this.idade = idade;
        this.mensalidade = mensalidade;
        this.aulas_semana = aulas_semana;
        this.periodo = periodo;
        this.cod = cod;

    }

    public void terAula(Professor p)
    {
        System.out.println(nome + "está na aula de " + p.nome);
    }

    public void tiraDuvida(Professor p)
    {
        System.out.println(nome + " está tirando uma dúvida com " + p.nome);
    }
}
