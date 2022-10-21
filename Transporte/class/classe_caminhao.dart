import 'classe_veiculos.dart';

class Caminhao extends Veiculo {
  bool canTransporte;

  Caminhao(
    this.canTransporte,
    super.numero_passageiros,
    super.capacidade_armazenamento,
    super.consumo_medio,
  );
}
