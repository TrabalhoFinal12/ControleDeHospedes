package trabalhofinal.BKMHotel;
import java.util.Date;
import java.util.Scanner;
public class Hospede {
	private int ID_h;
	private String nome;
	private String cpf;
	private Date datanasc;
	private String telefone;
	private String email;
	
	public int getID_h() {
		return ID_h;
	}

	public void setID_h(int iD_h) {
		ID_h = iD_h;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	Hospede(String nome, String cpf, Date datanasc, String telefone, String email){
		this.nome = nome;
		this.cpf = cpf;
		this.datanasc = datanasc;
		this.telefone = telefone;
		this.email = email;
	}
	
	}




