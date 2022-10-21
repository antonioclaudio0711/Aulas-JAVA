import 'classes/administrador.dart';
import 'classes/pessoa.dart';
import 'classes/reporte.dart';
import 'classes/usuario.dart';

main(List<String> args) {
  Administrador administrador01 = Administrador(
    id_administrador: '01',
    cadastro_inicial: Pessoa(
      CPF: '071.238.561-47',
      nome: 'Antônio Claudio Ferreira Filho',
      data_nascimento: '07/11/2002',
      sexo: 'Masculino',
    ),
    contrato: 'Adm_01',
  );

  Usuario usuario01 = Usuario(
    id_usuario: '01',
    cadastro_inicial: Pessoa(
      CPF: '868.844.681-49',
      nome: 'Juliana Martins de Bessa Ferreira',
      data_nascimento: '19/03/1980',
      sexo: 'Feminino',
    ),
  );

  Reporte reporte01 = Reporte(
    id_reporte: '01',
    foto: 'endereco_foto_do_reporte',
    gravidade: 'Alta',
    localizacao: {'local': 'Porta do estádio'},
  );

  print(administrador01.cadastro_inicial.nome);
  print(usuario01.cadastro_inicial.nome);
  print(reporte01.localizacao);
}
