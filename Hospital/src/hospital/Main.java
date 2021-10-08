package hospital;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua um", "001", "Obama", "teste", "RS", "010101010");
        Endereco end2 = new Endereco("Rua dois", "002", "Hillary", "teste2", "RS", "010101010");

        Paciente pac1 = new Paciente("João Pedro", "000000000", "11-900000000", end1);
        Paciente pac2 = new Paciente("Pedro João", "000000000", "51-912121212", end2);

        lista_paciente.pacientes.add(pac1);
        lista_paciente.pacientes.add(pac2);

        System.out.println(lista_paciente.listar());

        Medico med1 = new Medico("333333333", "Marcus", "12-9876543210");
        Medico med2 = new Medico("111222111", "Bicca", "41-987654321");

        lista_medico.medicos.add(med1);
        lista_medico.medicos.add(med2);

        System.out.println(lista_medico.listar());

        Internacao internacao1 = new Internacao(pac1, med1);
        Internacao internacao2 = new Internacao(pac2, med2);

        lista_internacao.internacoes.add(internacao1);
        lista_internacao.internacoes.add(internacao2);

        LocalDate dataAlta1 = internacao1.getDataInternacao();

        internacao1.setDataAlta(dataAlta1);
        System.out.println(lista_internacao.listar());

        System.out.printf(
                        "O Sr. %s Atualmente Está na %s nº %s, no bairro %s - %s/%s, enquanto estava internado desde %s no hospital. Foi liberado para alta na data de: %s pelo médico: %s, supervisionado pelo médico %s.\n",
                        pac1.getNomeCompleto(), end1.getRua(), end1.getNumero(), end1.getBairro(),end1.getCidade(), end1.getEstado(), internacao2.getDataInternacao(), internacao1.getDataInternacao(), med1.getNomeCompleto(), med2.getNomeCompleto());

        System.out.printf(
                        "O Sr. %s de telefone de contato %s, foi internado em: %s.\n. E o médico que acompanhará esse processo será o %s",
                        pac2.getNomeCompleto(), pac2.getTelefone(), internacao2.getDataInternacao(), med1.getNomeCompleto());

}
}