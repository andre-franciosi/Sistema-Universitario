public class Sistema {

    public static void main(String[] args) throws ExcecaoEscolha
    {
        Universidade puc = new Universidade(8,10000.98,"PUC");
        Professor a = new Professor("Andre",28, 2009, 1600.87, 12, "Eng Eletrica",1 );

        a.DarAula();

        puc.sistema();

    }
    
}
