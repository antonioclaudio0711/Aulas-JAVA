import 'pessoa.dart';

class Administrador {
  Administrador({
    required this.id_administrador,
    required this.cadastro_inicial,
    required this.contrato,
  });

  final String id_administrador;
  final Pessoa cadastro_inicial;
  final String contrato;
}
