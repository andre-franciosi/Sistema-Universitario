abstract public class Funcionario{

    protected String nome;
    private int idade;
    private int ano_entrada;
    private double salario;
    protected int cod;

    public Funcionario(String nome, int idade, int ano_entrada, double salario, int cod)
    {
        this.nome = nome;
        this.idade = idade;
        this.ano_entrada = ano_entrada;
        this.salario = salario;
        this.cod = cod;

    }

    public void recebeSalario()
    {
        System.out.println(nome + "recebeu " + salario + " de salario");
    }

    public void tomarCafezinho()
    {
        System.out.println(nome + " esta tomando um cafezinho");
    }

}