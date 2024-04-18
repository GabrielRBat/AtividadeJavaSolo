public class Pessoa 
{
    String nome;
    String cpf;

    public Pessoa(String _nome, String _cpf)
    {
        this.nome = _nome;
        this.cpf = _cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        String txt = "Nome: "+this.nome+'\n'+"CPF: "+this.cpf;
        return txt;
    }
}
