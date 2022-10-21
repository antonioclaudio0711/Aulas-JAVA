import 'pessoa.dart';

class Usuario {
  Usuario({
    required this.id_usuario,
    required this.cadastro_inicial,
  });

  final String id_usuario;
  final Pessoa cadastro_inicial;
}
