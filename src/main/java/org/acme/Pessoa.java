package org.acme;

import java.util.Date;

public class Pessoa {
    private long cod;
    private String sexo;
    private String nomePessoa;
    private String endereco;
    private String enderecoCep;
    private String emailPrincipal;
    private Date dtNascimento;
    private String estadoCivil;
    private String foneRes;
    private String foneCom;
    private String numPaisFoneCel;
    private String foneCel;
    private String numPaisFoneCel2;
    private String foneCel2;
    private String observacao;
    private Date dtDesativacao;
    private String motivoDesativacao;
    private String profissao;
    private String docCpf;
    private String docRg;
    private String emailTrabalho;
    private String foneTrabalho;
    
    public Pessoa(long cod, String sexo, String nomePessoa, String endereco, String enderecoCep, String emailPrincipal,
            Date dtNascimento, String estadoCivil, String foneRes, String foneCom, String numPaisFoneCel,
            String foneCel, String numPaisFoneCel2, String foneCel2, String observacao, Date dtDesativacao,
            String motivoDesativacao, String profissao, String docCpf, String docRg, String emailTrabalho,
            String foneTrabalho) {
        this.cod = cod;
        this.sexo = sexo;
        this.nomePessoa = nomePessoa;
        this.endereco = endereco;
        this.enderecoCep = enderecoCep;
        this.emailPrincipal = emailPrincipal;
        this.dtNascimento = dtNascimento;
        this.estadoCivil = estadoCivil;
        this.foneRes = foneRes;
        this.foneCom = foneCom;
        this.numPaisFoneCel = numPaisFoneCel;
        this.foneCel = foneCel;
        this.numPaisFoneCel2 = numPaisFoneCel2;
        this.foneCel2 = foneCel2;
        this.observacao = observacao;
        this.dtDesativacao = dtDesativacao;
        this.motivoDesativacao = motivoDesativacao;
        this.profissao = profissao;
        this.docCpf = docCpf;
        this.docRg = docRg;
        this.emailTrabalho = emailTrabalho;
        this.foneTrabalho = foneTrabalho;
    }

    public long getCod() {
        return cod;
    }
    public void setCod(long cod) {
        this.cod = cod;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEnderecoCep() {
        return enderecoCep;
    }
    public void setEnderecoCep(String enderecoCep) {
        this.enderecoCep = enderecoCep;
    }
    public String getEmailPrincipal() {
        return emailPrincipal;
    }
    public void setEmailPrincipal(String emailPrincipal) {
        this.emailPrincipal = emailPrincipal;
    }
    public Date getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getFoneRes() {
        return foneRes;
    }
    public void setFoneRes(String foneRes) {
        this.foneRes = foneRes;
    }
    public String getFoneCom() {
        return foneCom;
    }
    public void setFoneCom(String foneCom) {
        this.foneCom = foneCom;
    }
    public String getNumPaisFoneCel() {
        return numPaisFoneCel;
    }
    public void setNumPaisFoneCel(String numPaisFoneCel) {
        this.numPaisFoneCel = numPaisFoneCel;
    }
    public String getFoneCel() {
        return foneCel;
    }
    public void setFoneCel(String foneCel) {
        this.foneCel = foneCel;
    }
    public String getNumPaisFoneCel2() {
        return numPaisFoneCel2;
    }
    public void setNumPaisFoneCel2(String numPaisFoneCel2) {
        this.numPaisFoneCel2 = numPaisFoneCel2;
    }
    public String getFoneCel2() {
        return foneCel2;
    }
    public void setFoneCel2(String foneCel2) {
        this.foneCel2 = foneCel2;
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    public Date getDtDesativacao() {
        return dtDesativacao;
    }
    public void setDtDesativacao(Date dtDesativacao) {
        this.dtDesativacao = dtDesativacao;
    }
    public String getMotivoDesativacao() {
        return motivoDesativacao;
    }
    public void setMotivoDesativacao(String motivoDesativacao) {
        this.motivoDesativacao = motivoDesativacao;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getDocCpf() {
        return docCpf;
    }
    public void setDocCpf(String docCpf) {
        this.docCpf = docCpf;
    }
    public String getDocRg() {
        return docRg;
    }
    public void setDocRg(String docRg) {
        this.docRg = docRg;
    }
    public String getEmailTrabalho() {
        return emailTrabalho;
    }
    public void setEmailTrabalho(String emailTrabalho) {
        this.emailTrabalho = emailTrabalho;
    }
    public String getFoneTrabalho() {
        return foneTrabalho;
    }
    public void setFoneTrabalho(String foneTrabalho) {
        this.foneTrabalho = foneTrabalho;
    }
    @Override
    public String toString() {
        return "Pessoa [cod=" + cod + ", sexo=" + sexo + ", nomePessoa=" + nomePessoa + ", endereco=" + endereco
                + ", enderecoCep=" + enderecoCep + ", emailPrincipal=" + emailPrincipal + ", dtNascimento="
                + dtNascimento + ", estadoCivil=" + estadoCivil + ", foneRes=" + foneRes + ", foneCom=" + foneCom
                + ", numPaisFoneCel=" + numPaisFoneCel + ", foneCel=" + foneCel + ", numPaisFoneCel2=" + numPaisFoneCel2
                + ", foneCel2=" + foneCel2 + ", observacao=" + observacao + ", dtDesativacao=" + dtDesativacao
                + ", motivoDesativacao=" + motivoDesativacao + ", profissao=" + profissao + ", docCpf=" + docCpf
                + ", docRg=" + docRg + ", emailTrabalho=" + emailTrabalho + ", foneTrabalho=" + foneTrabalho + "]";
    }


}