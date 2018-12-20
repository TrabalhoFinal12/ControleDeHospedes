package trabalhofinal.BKMHotel;
import java.util.ArrayList;

public class Quartos {
	private int ID_quartos;
	private String tipo, descricao;
	private int quantidadeDeQuartos;
	private double precoDiariaSimples, precoDiariaLuxuoso;
	
	
	public double getPrecoDiariaSimples() {
		return precoDiariaSimples;
	}

	public void setPrecoDiariaSimples(double precoDiariaSimples) {
		this.precoDiariaSimples = precoDiariaSimples;
	}

	public double getPrecoDiariaLuxuoso() {
		return precoDiariaLuxuoso;
	}

	public void setPrecoDiariaLuxuoso(double precoDiariaLuxuoso) {
		this.precoDiariaLuxuoso = precoDiariaLuxuoso;
	}

	public int getID_quartos() {
		return ID_quartos;
	}

	public void setID_quartos(int iD_quartos) {
		ID_quartos = iD_quartos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeDeQuartos() {
		return quantidadeDeQuartos;
	}

	public void setQuantidadeDeQuartos(int quantidadeDeQuartos) {
		this.quantidadeDeQuartos = quantidadeDeQuartos;
	}
	
	public String selecionarTipo() {
		return tipo;
	}

	int  quantidadeSimples = 0, quantidadeLuxuoso = 0, alugadoSimples = 0, alugadoLuxuoso = 0;
	ArrayList<String> quartoSimples = new ArrayList<String>();
	public int qtdQuartoSimples() {
		quantidadeSimples = quartoSimples.size();
			return quantidadeSimples;
	}
	ArrayList<String> quartoLuxuoso = new ArrayList<String>();
	
	public int qtdQuartoLuxuoso() {
		quantidadeLuxuoso = quartoLuxuoso.size();
			return quantidadeLuxuoso;
	}
	
	ArrayList<String> quartosAlugadosSimples = new ArrayList<String>();
	public int  qtdQuartoSimplesAlugados() {
		alugadoSimples = quartosAlugadosSimples.size();
			return alugadoSimples;
	}
	ArrayList<String> quartosAlugadosLuxuoso = new ArrayList<String>();
	public int  qtdQuartoLuxuosoAlugados() {
		alugadoLuxuoso = quartosAlugadosLuxuoso.size();
			return alugadoLuxuoso;
	}
	
	
	public int qtdQuartoSimplesDisponivel() {
		int disponivelSimples = (quantidadeSimples - alugadoSimples);
		return disponivelSimples;
	}
	public int qtdQuartoLuxuosoDisponivel() {
		int disponivelLuxuoso = (quantidadeLuxuoso - alugadoLuxuoso);
		return disponivelLuxuoso;
	}
	
	public double alterarValorSimples(double precoDiariaSimples) {
		double novoValor = 0;
		return precoDiariaSimples = novoValor + precoDiariaSimples;
	}
	public double alterarValorLuxuoso(double precoDiariaLuxuoso) {
		double novoValor = 0;
		return precoDiariaLuxuoso = novoValor + precoDiariaLuxuoso;
	}
	
	public void cadrastrarQuartoSimples(int quantidadeAdicionada) {
		quantidadeDeQuartos = quantidadeDeQuartos + quantidadeAdicionada;
	}
	public void cadrastrarQuartosLuxuoso(int quantidadeAdicionada) {
		quantidadeDeQuartos = quantidadeDeQuartos + quantidadeAdicionada;
	}
	
	
	
	
}

