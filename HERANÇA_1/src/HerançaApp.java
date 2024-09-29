public class HerançaApp {
    public static void main(String[] args) {

        //Dados do funcionário
        Funcionario f1 = new Funcionario();
        f1.setNome("Ricardo");
        f1.setEndereco("Rua das flores");
        f1.setCpf("544.028.150-96");
        f1.setSalario(2500.99);

        //Dados do cliente pessoa física
        PessoaF pf = new PessoaF();
        pf.setNome("Cristiano Ronaldo Junior");
        pf.setEndereco("Rua dos carros");
        pf.setCpf("744.029.154-96");
        
        //Dados do cliente pessoa jurídica
        PessoaJ pj = new PessoaJ();
        pj.setNome("Neymar Souza de Oliveira dos Santos");
        pj.setEndereco("Rua Lionel Messi");
        pj.setCnpj("20.969.645/0001-44");

        //Saída de dados
        System.out.println(f1.descricaoF());
        System.out.println(pf.descricaoPF());
        System.out.println(pj.descricaoPJ());

        scn.close();
    }
}