public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nCADASTRO DO HOSPITAL - MENU");
        System.out.println("1) Cadastrar Paciente");
        System.out.println("2) Cadastrar Médico");
        System.out.println("3) Cadastrar Enfermeiro");
        System.out.println("4) Listar todos os pacientes");
        System.out.println("5) Listar todos os médicos");
        System.out.println("6) Listar todos os enfermeiros");
        System.out.println("7) Remover paciente");
        System.out.println("8) Remover médico");
        System.out.println("9) Remover enfermeiro");
        System.out.println("10) Diagnosticar um paciente");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção:");

    }

    private static void verificarOpcao(int op) {

        String nome;
        String cpf;

        switch (op) {
            case 1:

                System.out.println("\nCadastro de paciente:");
                
                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("CPF: ");
                cpf = Console.lerString();

                System.out.print("Número de prontuário: ");
                int numPrountuario = Console.lerInt();

                System.out.println("Diagnostico: ");
                String diagnostico = Console.lerString();

                Paciente paciente = new Paciente(nome, cpf, diagnostico, numPrountuario);

                // Adicionar paciente na lista hospitalar:
                Hospital.registrarPaciente(paciente);

                System.out.println("\nPaciente cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nCadastro de médico: ");
                
                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("CPF: ");
                cpf = Console.lerString();

                System.out.print("CRM: ");
                String crm = Console.lerString();

                System.out.println("Especialidade: ");
                String especialidade = Console.lerString();

                // instância do médico:
                Medico medico = new Medico(nome, cpf, crm, especialidade);

                // Adicionar médico na lista hospitalar
                Hospital.registrarMedico(medico);

                // Sucesso:
                System.out.println("\nMédico registrado com sucesso!");

                break;

            case 3:

                System.out.println("\nCadastro de enfermeiro: ");
                    
                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("CPF: ");
                cpf = Console.lerString();

                System.out.print("Coren: ");
                String coren = Console.lerString();

                // instância do enfermeiro:
                Enfermeiro enfermeiro = new Enfermeiro(nome, cpf, coren);

                // Adicionar enfermeiro na lista hospitalar
                Hospital.registrarEnfermeiro(enfermeiro);

                // Sucesso:
                System.out.println("\nEnfermeiro registrado com sucesso!");

                break;


            case 4:

                System.out.println("\nPacientes cadastrados:");

                for (Pessoa pessoa : Hospital.getPacientes()) 
                {
                    if(pessoa instanceof Paciente)
                    {
                        System.out.println(pessoa);
                    }
                }
                break;

            case 5:

                System.out.println("\nMédicos cadastrados:");

                for (Pessoa pessoa : Hospital.getMedicos()) 
                {
                    if(pessoa instanceof Medico) 
                    {
                        System.out.println(pessoa);
                    }
                }
                break;
            case 6:

                System.out.println("\nEnfermeiros cadastrados:");

                for (Pessoa pessoa : Hospital.getEnfermeiros()) 
                {
                    if(pessoa instanceof Enfermeiro) 
                    {
                        System.out.println(pessoa);
                    }
                }
                break;

            case 7:

                System.out.println("\nRemover pacientes");
                System.out.print("Informe o cpf do paciente: ");
                cpf = Console.lerString();

                //Retorna true se remover paciente com sucesso
                if (Hospital.excluirPacientes(cpf))
                {
                    System.out.println("\nPaciente foi removido com sucesso!");
                }
                
                else 
                {
                    System.out.println("\nPaciente com CPF: " + cpf + " não localizado no cadastro");
                }

                break;

            case 8:

                System.out.println("\nRemover médicos");
                System.out.print("Informe o cpf do médico: ");
                cpf = Console.lerString();

                //Retorna true se remover paciente com sucesso
                if (Hospital.excluirMedicos(cpf))
                {
                    System.out.println("\nMédico foi removido com sucesso!");
                }
                
                else 
                {
                    System.out.println("\nMédico com CPF: " + cpf + " não localizado no cadastro");
                }

                break;

            case 9:

                System.out.println("\nRemover enfermeiros");
                System.out.print("Informe o cpf do enfermeiro: ");
                cpf = Console.lerString();

                //Retorna true se remover paciente com sucesso
                if (Hospital.excluirEnfermeiros(cpf))
                {
                    System.out.println("\nEnfermeiro foi removido com sucesso!");
                }
                
                else 
                {
                    System.out.println("\nEnfermeiro com CPF: " + cpf + " não localizado no cadastro");
                }

                break;
                
            case 10:
                System.out.println("Digite o cpf do paciente que deseja diagnosticar: ");
                String _cpf = Console.lerString();
                
                System.out.println("Digite o diagnóstico que deseja dar para o paciente: ");
                String _diagnostico = Console.lerString();

                Medico.diagnosticar(_cpf, _diagnostico);

                break;

            case 0:

                System.out.println("\nO Sistema foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

        System.out.println();

    }

    public static void executar() {

        int op;

        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
