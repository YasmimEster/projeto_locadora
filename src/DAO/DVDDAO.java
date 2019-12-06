/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.DVD;
import java.sql.*;
public class DVDDAO extends ExecuteSQL{

    public DVDDAO(Connection con) {
        super(con);
    }
    public String Inserir_DVD(DVD a) {
    String sql = "insert into cliente values(0,?,?)";
    try{
        PreparedStatement ps = getCon().prepareStatement(sql);
        
        ps.setInt(1, a.getCod_filme());
        ps.setString(2, a.getSituacao());
        ps.setDouble(3, a.getPreco());
        ps.setString(4, a.getData_compra());
        
        
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
