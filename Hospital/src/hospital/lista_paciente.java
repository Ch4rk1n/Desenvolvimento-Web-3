package hospital;

import java.util.ArrayList;

public class lista_paciente {

    static ArrayList<Paciente> pacientes = new ArrayList<>();

    public void cadastrar(Paciente paciente) {
        if (paciente != null) {
            pacientes.add(paciente);
        }
    }

    public void removerPaciente(Paciente paciente) {
        pacientes.removeIf((item) -> item.getCpf().equals(paciente.getCpf()));
    }

    public static Paciente buscar(Paciente paciente) {
        for (Paciente item : pacientes) {
            if (item.getCpf().equals(paciente.getCpf())) {
                return item;
            }

        }
        return null;
    }

    public void editarPaciente(Paciente paciente) {
        int indice = pacientes.indexOf(lista_paciente.buscar(paciente));
        if (indice != -1) {
            pacientes.set(indice, paciente);
        }
    }

    public static String listar() {
        StringBuilder builder = new StringBuilder();
        for (Paciente paciente : lista_paciente.pacientes) {
            builder.append("Nome: " + paciente.getNomeCompleto() + " - cpf: " + paciente.getCpf() + "\n");
        }
        return builder.toString();
    }
}