/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Action;

import model.Agendamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
/**
 *
 * @author lubin.lionel
 */
public class AgendaPaciente extends GenericMetodo {

    public void salvar(Agendamento agendamento) throws SQLException {
        String insert = "INSERT INTO agendamento(cpf, data_agendamento, status, observacao ) VALUES(?,?,?,?)";
        save(insert, agendamento.getCpf(), agendamento.getData_agendamento(), agendamento.getStatus(), 
        agendamento.getObservacao() );
    }
   
    public Agendamento buscar_por_cpf(String cpf) throws SQLException {
        String select = "SELECT  * FROM agendamento WHERE cpf = ?";
        Agendamento agendamento = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
        stmt.setString(1, cpf);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, rs.getString(1)  + "Agendamento Encontrado com sucesso!!!" );
        } else {
            JOptionPane.showMessageDialog(null, " Desculpa o Agendamento que vc esta procurando não foi encontrado!");
        }

        while (rs.next()) {
            agendamento = new Agendamento();
            agendamento.setCpf(rs.getString("cpf"));
            agendamento.setData_agendamento(rs.getString("data_agendamento"));
            agendamento.setStatus(rs.getString("status"));
            agendamento.setObservacao(rs.getString("observacao"));
            
        }
        rs.close();
        stmt.close();
        getConnection().close();

        return agendamento;
    }

    


}  
