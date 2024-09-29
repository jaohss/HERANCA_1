public class PessoaF extends Cliente {
    //Definição do atributo privado específico
    private String cpf;

    //Construtores
    PessoaF(){}

    PessoaF(String nome, String endereco, String email, String cpf){
        super(nome, endereco, email);
        this.cpf=cpf;
    }

    //getter e setter do CPF
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    public String descricaoPF(){
        return "Dados do cliente físico: \n"+ super.descricaoC() + "\nCPF: "+getCpf()+"\n";
    }
    
}
