public class PessoaJ extends Cliente {
    //Definição do atributo privado específico
    private String cnpj;

    //Definição dos construtores
    PessoaJ(){}

    PessoaJ(String nome, String endereco, String email, String cnpj){
        super(nome, endereco, email);
        this.cnpj=cnpj;
    }

    //getter e setter do CNPJ
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    public String descricaoPJ(){
        return "Dados do cliente jurídico: \n"+ super.descricaoC() + "\nCNPJ: "+getCnpj() +"\n";
    }

    


    
    
}
