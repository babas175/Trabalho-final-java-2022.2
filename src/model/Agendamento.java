/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lubin.lionel
 */
public class Agendamento {
    private String cpf;
    private String data_do_agendamento;
    private String status;

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the data_do_agen
     */
    public String getData_do_agen() {
        return data_do_agendamento;
    }

    /**
     * @param data_do_agen the data_do_agen to set
     */
    public void setData_do_agen(String data_do_agen) {
        this.data_do_agendamento = data_do_agen;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
