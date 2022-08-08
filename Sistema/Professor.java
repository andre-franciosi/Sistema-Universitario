public class Professor extends Funcionario implements DarAulas{
    
    private int aulas_semana;
    private String formacao;

    public Professor(String nome, int idade, int ano_entrada, double salario, int aulas_semana, String formacao, int cod)
    {

        super(nome, idade, ano_entrada, salario,cod);
        this.aulas_semana = aulas_semana;
        this.formacao = formacao;

    }

    public void DarAula()
    {   
        System.out.println(nome + " dando aula!");
    }

    public void corrigirProva()
    {
        System.out.println(nome + " esta corrigindo provas");
    }

}
