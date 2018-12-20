package trabalhofinal.BKMHotel;

import java.util.ArrayList;
import java.util.Date;
public class Funcionario {
	private int ID_f;
	private String nome, cpf, telefone, email;
	private Date datanasc;
	private int senha;
	
	public int getID_f() {
		return ID_f;
	}
	public void setID_f(int iD_f) {
		ID_f = iD_f;
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
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	ArrayList<Hospede> hospedes = new ArrayList<Hospede>();
	
	public void CadrastroFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);	
	}
	
	public void adicionaHospede(Hospede e){

	    for(int i=0; i < hospedes.size(); i++){
	    	if(hospedes.contains(e)){
	            System.out.println("hospede já foi adicionado ao hotel anteriormente");
	        }
	    	else{
	            System.out.println("hospede não adicionado");
	        }
	    }
	    }
	public void adicionaFuncionario(Funcionario e) {
		 for(int i=0; i < funcionarios.size(); i++){
		    	if(funcionarios.contains(e)) {
		            System.out.println("funcionario já foi adicionado ao hotel anteriormente");
		        }
		    	else{
		            System.out.println("funcionario não adicionado");
		        }
		    }
		 }		
}

	


