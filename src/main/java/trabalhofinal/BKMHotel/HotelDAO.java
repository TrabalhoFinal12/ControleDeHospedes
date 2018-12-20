package trabalhofinal.BKMHotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HotelDAO {
	private Connection connection;
	public void inserir(Hotel hotel) {
        String sql = "insert into hotel(ID_hotel, nome, descricao, telefone) values (?,?,?,?)";
        try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, hotel.getID_hotel());
		stmt.setString(2,hotel.getNome());
		stmt.setString(3, hotel.getDescricao());
		stmt.setString(5, hotel.getTelefone());
		stmt.execute();
		stmt.close();
		System.out.println("Hotel cadastrado");
	} catch (SQLException e) {
		System.out.println("Erro ao cadastrar hotel");
		e.printStackTrace();
	}
}
	public void listar() {
		 String sql = "select * from hotel";
		 try {
			Statement s = connection.createStatement();
			ResultSet resultado = s.executeQuery(sql);
			while(resultado.next()) {
				  int ID_hotel = resultado.getInt("ID_hotel");
				  String nome = resultado.getString("nome");
				  String telefone = resultado.getString("telefone");
				  String descricao = resultado.getString("ID_hotel");
				  
				System.out.println("Hotel:" +"ID_hotel" +ID_hotel +"Nome" +nome +"Telefone:" +telefone);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	public void editar(Hotel hotel) {
		String sql = "update hostel set ID_hotel = ?, nome = ?, descricao = ?, telefone = ?  where ID_hotel = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, hotel.getID_hotel());
			stmt.setString(2, hotel.getNome());
			stmt.setString(3, hotel.getDescricao());
			stmt.setString(5,hotel.getTelefone());
			
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Hotel atualizado");
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar o hotel");
			e.printStackTrace();
	}
}
	public void apagar(Hotel hotel) {
		String sql = "delete from hotel where ID_hotel = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, hotel.getID_hotel());
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Registro deletado");
		} catch (SQLException e) {
			System.out.println("Erro deletar o hotel");
			e.printStackTrace();
		}
	

}

}
