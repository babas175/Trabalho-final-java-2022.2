/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Action.PacienteClinica;
import model.Paciente;

import javax.swing.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class PacienteController {
     public void salvar(String cpf, String nome, String sobrenome, String endereco, String data_de_nasc) 
		throws SQLException, ParseException 
	{
        Paciente paciente = new Paciente();
        paciente.setCpf(cpf);
        paciente.setNome(nome);
        paciente.setSobrenome(sobrenome);
        paciente.setEndereco(endereco);
        paciente.setData_de_nasc(data_de_nasc);

        new PacienteClinica().salvar(paciente);
    }

    public void alterar(String cpf, String nome, String sobrenome, String endereco, String data_de_nasc) 
		throws ParseException, SQLException 
	{
        
	Paciente paciente = new Paciente();
        paciente.setCpf(cpf);
        paciente.setNome(nome);
        paciente.setSobrenome(sobrenome);
        paciente.setEndereco(endereco);
        paciente.setData_de_nasc(data_de_nasc);

       new PacienteClinica().alterar(paciente);
    }

    public List listar() {
        PacienteClinica pacienteClinica = new PacienteClinica();
        try {
            return pacienteClinica.findPaciente();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
				"Nao foi possivel localizado os dados" + 
				e.getLocalizedMessage()
			);
        }
        return null;
    }

    public void excluir(String cpf) throws SQLException {
        new PacienteClinica().excluir(cpf);
    }

    public Paciente buscaPorcpf(String cpf) throws SQLException {
        PacienteClinica paciente = new PacienteClinica();
        return paciente.buscar_por_cpf(cpf);
    }
}
