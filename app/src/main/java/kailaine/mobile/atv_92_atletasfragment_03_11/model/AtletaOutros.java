package kailaine.mobile.atv_92_atletasfragment_03_11.model;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import androidx.annotation.NonNull;

public class AtletaOutros extends Atleta {
    private String academia;
    private double recordeSegundos;

    public AtletaOutros(){
        super();
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public double getRecordeSegundos() {
        return recordeSegundos;
    }

    public void setRecordeSegundos(double recordeSegundos) {
        this.recordeSegundos = recordeSegundos;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaOutros{" +
                "nome='" + getNome() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", bairro='" + getBairro()+ '\'' +
                "academia='" + academia + '\'' +
                ", recordeSegundos=" + recordeSegundos +
                '}';
    }
}
