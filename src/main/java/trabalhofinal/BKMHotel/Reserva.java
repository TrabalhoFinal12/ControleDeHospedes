package trabalhofinal.BKMHotel;
import java.sql.Time;
import java.util.Date;

public class Reserva {
	private Date dataChegada, dataSaida;
	private Time horaChegada, horaSaida;
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Time getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(Time horaChegada) {
		this.horaChegada = horaChegada;
	}
	public Time getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(Time horaSaida) {
		this.horaSaida = horaSaida;
	}

}
