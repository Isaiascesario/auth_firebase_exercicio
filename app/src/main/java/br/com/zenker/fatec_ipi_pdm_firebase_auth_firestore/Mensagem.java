package br.com.zenker.fatec_ipi_pdm_firebase_auth_firestore;

import java.util.Date;

class Mensagem implements Comparable <Mensagem> {

    private String texto;
    private Date data;
    private String email;

    public Mensagem() {

    }

    public Mensagem(String texto, Date data, String email) {
        this.texto = texto;
        this.data = data;
        this.email = email;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData() {
        return data;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Mensagem mensagem) {
        return this.data.compareTo(mensagem.data);
    }
}
