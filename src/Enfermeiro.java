public class Enfermeiro extends Pessoa 
{
    String coren;

    public Enfermeiro(String _nome, String _cpf, String _coren)
    {
        super(_nome, _cpf);
        this.coren = _coren;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String _coren) {
        this.coren = _coren;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
        "Coren: "+coren;
    }
}
