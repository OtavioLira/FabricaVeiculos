package fabricaVeiculos;

import javax.swing.JOptionPane;

public class Game {
	static String modelo, cor, tipo;

	public static void iniciar() {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,"qual tipo de veiculo você deseja? \n1)Carro\n2)Moto\n3)Caminhao"));
		
		switch(escolha) {
			case 1:
				CriarCarro();
				break;
			case 2:
				CriarMoto();
				break;
			case 3:
				CriarCaminhao();
				break;
			default:
				 Object[] options = {"OK"};
			     JOptionPane.showOptionDialog(null,"Digite um veiculo correto por favor! ", "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		}
		
	}
	public static void CriarCarro() {
		JOptionPane.showMessageDialog(null, "Os modelo disponiveis são:\nJoy Black\nMeriva\nFiat Argo\nParatti");
		modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veiculo");
		cor = JOptionPane.showInputDialog(null, "Digite a cor do veiculo");
		tipo = JOptionPane.showInputDialog(null, "Digite o tipo do veiculo\nSedan\nHatchback\nOff road");
		Carro carro = new Carro(modelo, cor, tipo);
		InfoVeiculos(carro);
		Game(carro);
	}
	public static void CriarMoto() {
		JOptionPane.showMessageDialog(null, "Os modelo disponiveis são:\nTwister\nTitan 160\nHonda CG 160\nYamaha YBR 150");
		modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veiculo");
		cor = JOptionPane.showInputDialog(null, "Digite a cor do veiculo");
		tipo = JOptionPane.showInputDialog(null, "Digite o tipo do veiculo \nScooter\nTurismo\nTrail");
		Moto moto = new Moto(modelo, cor, tipo);
		InfoVeiculos(moto);
		Game(moto);
	}
	public static void CriarCaminhao() {
		JOptionPane.showMessageDialog(null, "Os modelo disponiveis são:\nNew actros\nFH 540 6x4T\nR 450 A4x2NA");
		modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veiculo");
		cor = JOptionPane.showInputDialog(null, "Digite a cor do veiculo");
		tipo = JOptionPane.showInputDialog(null, "Digite o tipo do veiculo \nGrande Baixa\nCaçamba\nBáu");
		Caminhao caminhao = new Caminhao(modelo, cor, tipo);
		InfoVeiculos(caminhao);
		Game(caminhao);
		
	}
	public static void InfoVeiculos(Veiculo v) {
		String info = "-----Informações do Carro-----" 
				+ "\nMarca: " + v.getMarca()
				+ "\nModelo: " + v.getMarca()
				+ "\nTipo: " + v.getTipo()
				+ "\nTipo de transmissão: " + v.getTransmissao()
				+ "\nCor: " + v.getCor()
				+ "\nFabricante: " + v.getFabrica()
				+ "\nQuantide de Rodas: " + v.getQtd_rodas();
		JOptionPane.showMessageDialog(null, info, "Informações do carro", 1);
	}
	public static void Game(Veiculo veiculo) {
		while (true) {
			String opcoes = "O que deseja fazer?"
					+ "\n1)Acelerar"
					+ "\n2)Freiar"
					+ "\n3)Ligar"
					+ "\n4)Desligar"
					+ "\n5)Abastecer"
					+ "\nDigite Qualquer Numero para finalizar o programa";
			int op = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes));
			switch(op) {
			case 1:	
				JOptionPane.showMessageDialog(null, "Km por hora: " + veiculo.acelerar(10));
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Km por hora:" + veiculo.freiar(10));
				break;
			case 3:
				veiculo.ligar();
				JOptionPane.showMessageDialog(null, "Estado do carro: Ligado");
				break;
			case 4:
				veiculo.desligar();
				JOptionPane.showMessageDialog(null, "Estado do carro: Desligado");
				break;
			default:
				System.exit(0);
				break;
			}
		}
	}
}
