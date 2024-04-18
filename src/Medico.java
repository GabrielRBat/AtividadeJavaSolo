import java.util.List;

public class Medico extends Pessoa{
    String crm;
    String especialidade;

    public Medico(String _nome, String _cpf, String _crm, String _especialidade)
    {
        super(_nome, _cpf);
        this.crm = _crm;
        this.especialidade = _especialidade;
    }

    public static void diagnosticar(String _cpf, String _diagnostico)
    {
        List<Pessoa> pacientes = Hospital.getPacientes();
        for (Pessoa paciente : pacientes)
        {
            if (paciente instanceof Paciente) 
            {
                if(paciente.getCpf().equals(_cpf))
                {
                    Paciente pacienteEspecifico = (Paciente) paciente; 
                    pacienteEspecifico.setDiagnostico(_diagnostico);
                    
                    System.out.println(pacienteEspecifico.toString());
                }
                else
                {
                    System.out.println("Paciente não encontrado");
                }
            }
        }
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String _crm) {
        this.crm = _crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String _especialidade) {
        this.especialidade = _especialidade;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
        "CRM: "+crm+"\n"+"Especialidade: "+especialidade;
    }
    
    
}
