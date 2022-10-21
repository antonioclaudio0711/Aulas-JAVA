class Reporte {
  Reporte({
    required this.id_reporte,
    required this.foto,
    required this.gravidade,
    this.localizacao,
  });

  final String id_reporte;
  final String foto;
  final Map<String, dynamic>? localizacao;
  final String gravidade;
}
