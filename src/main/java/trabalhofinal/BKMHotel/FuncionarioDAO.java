package trabalhofinal.BKMHotel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioDAO {
	private Connection connection;
	public void inserir(Funcionario funcionario) {
        String sql = "insert into funcionario(ID_f, nome, cpf, datanasc, telefone, email, senha) values (?,?,?,?,?, ?)";
        try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, funcionario.getID_f());
		stmt.setString(2,funcionario.getNome());
		stmt.setString(3, funcionario.getCpf());
		stmt.setDate(4, (Date) funcionario.getDatanasc());
		stmt.setString(5, funcionario.getTelefone());
		stmt.setString(6,funcionario.getEmail());
		stmt.setInt(7, funcionario.getSenha());
		
		stmt.execute();
		stmt.close();
		System.out.println("Funcionário cadastrado");
	} catch (SQLException e) {
		System.out.println("Erro ao cadastrar funcionário");
		e.printStackTrace();
	}
}
	public void listar() {
		 String sql = "select * from funcionario";
		 try {
			Statement s = connection.createStatement();
			ResultSet resultado = s.executeQuery(sql);
			while(resultado.next()) {
				  int ID_f = resultado.getInt("ID_f");
				  String nome = resultado.getString("nome");
				  String cpf = resultado.getString("cpf");
				  String telefone = resultado.getString("telefone");
				  String email = resultado.getString("email");
				  Date datanasc = resultado.getDate("datanasc");
				  int senha = resultado.getInt("senha");
				  
				System.out.println("Funcion�rio:" +"ID_f" +ID_f +"Nome" +nome +"CPF:" +cpf +"Data de nascimento:" +datanasc +"Telefone:" +telefone +"email" +email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
	public void editar(Funcionario funcionario) {
		String sql = "update funcionario set ID_f = ?, nome = ?, cpf = ?, datanasc = ?, telefone = ?, email = ?, senha = ? where ID_h=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, funcionario.getID_f());
			stmt.setString(2, funcionario.getNome());
			stmt.setString(3, funcionario.getCpf());
			stmt.setDate(4, (Date)funcionario.getDatanasc());
			stmt.setString(5,funcionario.getTelefone());
			stmt.setString(6, funcionario.getEmail());
			stmt.setInt(7, funcionario.getSenha());
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Funcion�rio atualizado");
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar o funcion�rio");
			e.printStackTrace();
	}
}
	public void apagar(Funcionario funcionario) {
		String sql = "delete from funcionario where ID_f=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, funcionario.getID_f());
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Registro deletado");
		} catch (SQLException e) {
			System.out.println("Erro deletar o funcion�rio");
			e.printStackTrace();
		}
	

}
}
