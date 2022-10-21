import 'classe_caminhao.dart';

void main() {
  Caminhao veiculo01 = Caminhao(
    true,
    0,
    44000,
    252 / 120,
  );

  print(
      'Um caminhão possui a capacidade de transportar cargas: ${veiculo01.canTransporte}');
  print(
      'Um caminhão transporta ${veiculo01.passageiros} passageiros, no entanto, possui uma capacidade de armazenamento de ${veiculo01.armazenamento}kg!');
  print(
      'O caminhão descrito possui um consumo médio de ${veiculo01.consumo}km/L!');
}
