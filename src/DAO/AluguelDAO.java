package DAO;

import Modelo.Aluguel;
import java.sql.*;

public class AluguelDAO extends ExecuteSQL{

    public AluguelDAO(Connection con) {
        super(con);
    }
    public String Inserir_Aluguel(Aluguel a) {
    String sql = "insert into aluguel values(0,?,?,?,?,?)";
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        
        ps.setInt(1, a.getCoddvd());
        ps.setInt(2, a.getCodcliente());
        ps.setString(3, a.getData_aluguel());
        ps.setString(4, a.getHorario());
        ps.setString(5, a.getData_devolucao());
     
        
        
        if (ps.executeUpdate() > 0) {
            return "Inserido com Sucesso.";
        }
        else{
            return "Erro ao Inserir";
        }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
