package fabricaVeiculos;

public class Gasolina implements Combustivel{
	
	@Override
	public double abastecimento(double litros) {
		return litros * 10;
	}

}
