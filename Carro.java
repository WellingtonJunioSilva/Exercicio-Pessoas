public class Carro {
    String marca;
    int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Marca do carro: Fiat uno Mile\n" +
                "Ano do carro: 2008";
    }
}
