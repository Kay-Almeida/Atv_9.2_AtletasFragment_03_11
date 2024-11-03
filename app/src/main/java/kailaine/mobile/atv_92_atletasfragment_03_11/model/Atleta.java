package kailaine.mobile.atv_92_atletasfragment_03_11.model;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import androidx.annotation.NonNull;

public abstract class Atleta {
    private String nome;
    private String dataNascimento;
    private String bairro;

    public Atleta() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @NonNull
    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}

