public class Cliente extends Pessoa {
    String email;

    Cliente(){}

    Cliente(String nome, String endereco, String email){
        super(nome, endereco);
        this.email=email;
    }

    //método que gera um email a partir do nome e sobrenome do usuário
    private String fazerEmail(){

        //Remove os espaços em branco e converte em letras minusculas
        setNome(getNome().trim().toLowerCase());
        String[]partesNome = getNome().split(" "); //Delimita e separa o nome a partir de espaços
        String primeiroNome = partesNome[0]; //Definição do nome
        String ultimoNome = partesNome[partesNome.length - 1]; //Definição do último sobrenome
        String email = primeiroNome + "." + ultimoNome + "@email.com"; //Definição do modelo do email com nome e sobrenome

        return email;//retorna o email
    }

    //Get do email
    public String getEmail() {
        return fazerEmail();
    }

    //Método string que retorna as informações da superclasse adicionando as informações dos atributos específicos
    public String descricaoC(){
        return super.descricao() + "E-mail: "+getEmail();
    }
    
}
