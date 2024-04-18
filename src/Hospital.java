import java.util.ArrayList;
import java.util.List;

public class Hospital 
{
    private static List<Pessoa> listaHospitalar = new ArrayList<>();

    //Os 3 métodos chamam o mesmo objeto, criei 3 para chama-los de forma menos abrangente no Sistema.java
    public static void registrarPaciente(Pessoa _paciente)
    {
        listaHospitalar.add(_paciente);
    }
    
    public static void registrarMedico(Pessoa _medico)
    {
        listaHospitalar.add(_medico);
    }

    public static void registrarEnfermeiro(Pessoa _enfermeiro)
    {
        listaHospitalar.add(_enfermeiro);
    }

    public static List<Pessoa> getPacientes() 
    {
        List<Pessoa> tempList = new ArrayList<>();

        for(Pessoa paciente: listaHospitalar) {
            if (paciente instanceof Paciente) {
                tempList.add(paciente);
            }
        }
        return tempList;
    }

    public static List<Pessoa> getMedicos() 
    {
        List<Pessoa> tempList = new ArrayList<>();

        for(Pessoa medico: listaHospitalar) {
            if (medico instanceof Medico) {
                tempList.add(medico);
            }
        }
        return tempList;    
    }   
    
    public static List<Pessoa> getEnfermeiros() 
    {
        List<Pessoa> tempList = new ArrayList<>();

        for(Pessoa enfermeiro: listaHospitalar) {
            if (enfermeiro instanceof Enfermeiro) {
                tempList.add(enfermeiro);
            }
        }    
        return tempList;
    }   

    public static boolean excluirPacientes(String _cpf) {

        for (Pessoa paciente : listaHospitalar){
            if (paciente instanceof Paciente) 
            {
                if(paciente.getCpf().equals(_cpf))
                {
                    listaHospitalar.remove(paciente);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean excluirMedicos(String _cpf) {

        for (Pessoa medico : listaHospitalar){
            if (medico instanceof Medico) 
            {
                if(medico.getCpf().equals(_cpf))
                {
                    listaHospitalar.remove(medico);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean excluirEnfermeiros(String _cpf) {

        for (Pessoa enfermeiro : listaHospitalar){
            if (enfermeiro instanceof Enfermeiro) 
            {
                if(enfermeiro.getCpf().equals(_cpf))
                {
                    listaHospitalar.remove(enfermeiro);
                    return true;
                }
            }
        }
        return false;
    }
}
