package trabalhofinal.BKMHotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuartosDAO {
	private Connection connection;
	public void inserir(Quartos quartos) {
        String sql = "insert into quartos(ID_quartos, tipo, descricao, quantidadeDeQuartos, precoDiariaSimples, precoDiariaLuxuoso) values (?,?,?,?,?,?)";
        try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, quartos.getID_quartos());
		stmt.setString(2, quartos.getTipo());
		stmt.setString(3, quartos.getDescricao());
		stmt.setInt(4, quartos.getQuantidadeDeQuartos());
		stmt.setDouble(5, quartos.getPrecoDiariaSimples());
		stmt.setDouble(6, quartos.getPrecoDiariaLuxuoso());
		
		stmt.execute();
		stmt.close();
		System.out.println("Quarto cadastrado");
	} catch (SQLException e) {
		System.out.println("Erro ao cadastrar quarto");
		e.printStackTrace();
	}
}
	public void listar() {
		 String sql = "select * from quartos";
		 try {
			Statement s = connection.createStatement();
			ResultSet resultado = s.executeQuery(sql);
			while(resultado.next()) {
				  int ID_quartos = resultado.getInt("ID_quartos");
				  String tipo = resultado.getString("tipo");
				  String descricao = resultado.getString("descri��o");
				  int quantidadeDeQuartos = resultado.getInt("quantidadeDeQuartos");
				  double precoDiarias = resultado.getDouble("precoDiarias");
				  
				System.out.println("Quartos:" +"ID_quartos:" +ID_quartos +"Descri��o:" +descricao +"quantidadeDeQuartos" +quantidadeDeQuartos +"precoDiarias" +precoDiarias);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	public void editar(Quartos quartos) {
		String sql = "update quartos set ID_quartos = ?, descricao = ?, quantidadeDeQuartos = ?, precoDiariaSimples = ?,  precoDiariaLuxuoso = ?  where ID_hotel = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, quartos.getID_quartos());
			stmt.setString(2, quartos.getDescricao());
			stmt.setInt(3,quartos.getQuantidadeDeQuartos());
			stmt.setDouble(4, quartos.getPrecoDiariaSimples());
			stmt.setDouble(4, quartos.getPrecoDiariaLuxuoso());
			
		
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Quarto atualizado");
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar o quarto");
			e.printStackTrace();
	}
}
	public void apagar(Quartos quartos) {
		String sql = "delete from quartos where ID_quartos = ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, quartos.getID_quartos());
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Registro deletado");
		} catch (SQLException e) {
			System.out.println("Erro deletar o quarto");
			e.printStackTrace();
		}
	

}


}
