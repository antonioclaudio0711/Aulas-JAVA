class Veiculo {
  int _numero_passageiros;
  double _capacidade_armazenamento;
  double _consumo_medio;

  int get passageiros {
    return _numero_passageiros;
  }

  set passageiros(int quantidade) {
    _numero_passageiros = quantidade;
  }

  double get armazenamento {
    return _capacidade_armazenamento;
  }

  set armazenamento(double capacidade) {
    _capacidade_armazenamento = capacidade;
  }

  double get consumo {
    return _consumo_medio;
  }

  set consumo(double gasto) {
    _consumo_medio = gasto;
  }

  Veiculo(
    this._numero_passageiros,
    this._capacidade_armazenamento,
    this._consumo_medio,
  );
}
