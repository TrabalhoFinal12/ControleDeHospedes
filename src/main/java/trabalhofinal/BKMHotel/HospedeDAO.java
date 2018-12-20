package trabalhofinal.BKMHotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.sql.PreparedStatement;
public class HospedeDAO {
	private Connection connection;
	public void inserir(Hospede hospede) {
        String sql = "insert into hospede(ID_h, nome, cpf, datanasc, telefone, email) values (?,?,?,?,?,?)";
        try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, hospede.getID_h());
		stmt.setString(2, hospede.getNome());
		stmt.setString(3, hospede.getCpf());
		stmt.setDate(4, (Date) hospede.getDatanasc());
		stmt.setString(5, hospede.getTelefone());
		stmt.setString(6, hospede.getEmail());
		
		stmt.execute();
		stmt.close();
		System.out.println("Hópesde cadastrado");
	} catch (SQLException e) {
		System.out.println("Erro ao cadastrar h�spede");
		e.printStackTrace();
	}
}
	public void listar() {
		 String sql = "select * from funcionario";
		 try {
			Statement s = connection.createStatement();
			ResultSet resultado = s.executeQuery(sql);
			while(resultado.next()) {
				  int ID_h = resultado.getInt("ID_h");
				  String nome = resultado.getString("nome");
				  String cpf = resultado.getString("cpf");
				  String telefone = resultado.getString("telefone");
				  String email = resultado.getString("email");
				  Date datanasc = resultado.getDate("datanasc");
				  
				System.out.println("H�spede:" +"ID_h" +ID_h +"Nome:" +nome +"CPF:" +cpf +"Data de nascimento:" +datanasc +"Telefone:" +telefone +"email" +email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	public void editar(Hospede hospede) {
		String sql = "update hospede set ID_h = ?, nome = ?, cpf = ?, datanasc = ?, telefone = ?, email = ? where ID_h=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, hospede.getID_h());
			stmt.setString(2, hospede.getNome());
			stmt.setString(3, hospede.getCpf());
			stmt.setDate(4, (Date) hospede.getDatanasc());
			stmt.setString(5, hospede.getTelefone());
			stmt.setString(6, hospede.getEmail());
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Hóspede atualizado");
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar o h�spede");
			e.printStackTrace();
	}
}
	public void apagar(Hospede hospede) {
		String sql = "delete from hospede where ID_h=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, hospede.getID_h());
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Registro deletado");
		} catch (SQLException e) {
			System.out.println("Erro deletar o hospede");
			e.printStackTrace();
		}
	}




	
	

}
