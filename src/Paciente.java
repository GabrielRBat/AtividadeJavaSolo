public class Paciente extends Pessoa {
    
    String diagnostico;
    int numProntuario;

    public Paciente(String _nome, String _cpf, String _diagnostico, int _numProntuario)
    {
        super(_nome, _cpf);
        this.diagnostico = _diagnostico;
        this.numProntuario = _numProntuario;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getNumProntuario() {
        return numProntuario;
    }

    public void setNumProntuario(int numProntuario) {
        this.numProntuario = numProntuario;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\n"+"Diagnóstico: "+diagnostico+"\n"+"Número do prontuario: "+numProntuario;
    }
}
