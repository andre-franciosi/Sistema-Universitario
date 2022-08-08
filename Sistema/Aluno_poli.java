public class Aluno_poli extends Aluno{

    String curso;


    public Aluno_poli(int cod, String nome, int idade, double mensalidade, int aulas_semana, int periodo, String curso)
    {
        super(cod, nome, idade, mensalidade, aulas_semana, periodo);
        this.curso = curso;
    }

    public void programar()
    {
        System.out.println(nome + " está programando!");
        return;
    }

    public void calcular(String calc)
    {
        System.out.println(nome + "esta calculando a equacao " + calc);
    }

    public void terAula(Professor p)
    {
        System.out.println(nome + "está na aula de " + p.nome + ", do seu curso de " + curso);
    }
}