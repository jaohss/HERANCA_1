public class Funcionario extends Pessoa{
    //Definição dos atributos privados
    private String cpf;
    private double salario;

    //Construtores
    public Funcionario(){
    }
    public Funcionario(String nome, String cpf, String endereco, double salario){
        super(nome, endereco);//Inicializando os atributos comuns da superclasse
        this.cpf=cpf;
        this.salario=salario;

    }

    //getters e setters dos atributos específicos 
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    public String descricaoF(){
        return "Dados do funcionário: \n"+super.descricao() + "Salário: R$"+getSalario()+"\n" +
        "CPF: "+getCpf()+"\n";
    }

    
    
}
