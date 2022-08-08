import java.util.ArrayList;
import java.util.Scanner;;

public class Universidade{

    private int salas;
    private ArrayList <Aluno> alunos;
    private ArrayList <Professor> professores;
    private double renda;
    String nome;


    public Universidade(int salas, double renda, String nome)
    {
        this.salas = salas;
        this.renda = renda;
        this.nome = nome;
        alunos = new ArrayList<Aluno>();
        professores = new ArrayList<Professor>();

    }

    Scanner teclado = new Scanner(System.in);

    public void contratar_professor(Professor p)
    {
        professores.add(p);
    }

    public void matricular(Aluno a)
    {
        alunos.add(a);
    }

    public void sistema() throws ExcecaoEscolha
    {
        System.out.println("------------Sistema "+ nome + "----------------\n" +
                           "1 - Lista de Professores \n" +
                           "2 - Lista de alunos \n" +
                           "3 - Matricular aluno \n" +
                           "4 - Cadastrar professor \n" +
                           "5 - Sair \n");

        int escolha;
        escolha = teclado.nextInt();

        if(escolha == 1)
        {
            for (int i = 0; i < professores.size();i++) 
            { 		      
                System.out.println(professores.get(i)); 		
            }   
            System.out.println("O numero de professores cadastrados é de " + professores.size());
            System.out.println(" ");

            sistema();
        }

        if(escolha == 2)
        {
            for (int i = 0; i < alunos.size();i++) 
            { 		      
                System.out.println(alunos.get(i)); 		
            }   
            System.out.println("O numero de alunos cadastrados é de " + alunos.size());
            System.out.println(" ");

            sistema();
        }

        if(escolha == 3)
        {
            String nomea;
            int idadea;
            int coda;
            Double mensalidadea;
            int aulasa;
            String cursoa;
            int peridoa;

            System.out.println("Digite o nome: ");
            nomea = teclado.next();
            System.out.println("Digite a idade: ");
            idadea = teclado.nextInt();
            System.out.println("Digite o periodo: ");
            peridoa = teclado.nextInt();
            System.out.println("Digite a mensalidade: ");
            mensalidadea = teclado.nextDouble();
            System.out.println("Digite o numero de aulas: ");
            aulasa = teclado.nextInt();
            System.out.println("Digite o curso: ");
            cursoa = teclado.next();
            System.out.println("Digite o codigo de cadastro: ");
            coda = teclado.nextInt();

            Aluno_poli x = new Aluno_poli(coda,nomea,idadea,mensalidadea,aulasa,peridoa,cursoa);
            matricular(x);

            System.out.println("Aluno cadastrado");
            System.out.println(" ");

            sistema();
        }

        if(escolha == 4)
        {   
            String nomep;
            int idadep;
            int anop;
            Double salariop;
            int aulasp;
            String formacaop;
            int codp;

            System.out.println("Digite o nome: ");
            nomep = teclado.next();
            System.out.println("Digite a idade: ");
            idadep = teclado.nextInt();
            System.out.println("Digite o ano de entrada: ");
            anop = teclado.nextInt();
            System.out.println("Digite o salario: ");
            salariop = teclado.nextDouble();
            System.out.println("Digite o numero de aulas: ");
            aulasp = teclado.nextInt();
            System.out.println("Digite a formacao: ");
            formacaop = teclado.next();
            System.out.println("Digite o codigo de cadastro: ");
            codp = teclado.nextInt();

            Professor x = new Professor(nomep,idadep,anop,salariop,aulasp,formacaop,codp);
            contratar_professor(x);

            System.out.println("Professor cadastrado!");
            System.out.println(" ");

            sistema();
        }

        if(escolha == 5)
        {
            System.exit(0);
        }

        if(escolha > 5)
        {
            throw new ExcecaoEscolha(){};
        }
    }


}