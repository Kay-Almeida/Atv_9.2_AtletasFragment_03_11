package kailaine.mobile.atv_92_atletasfragment_03_11.model;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import androidx.annotation.NonNull;

public class AtletaSenior extends Atleta{
    private boolean problemaCardiaco;

    public AtletaSenior(){
        super();
    }

    public boolean isProblemasCardiacos(boolean b) {
        return problemaCardiaco;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaSenior{" +
                "nome='" + getNome() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", bairro='" + getBairro()+ '\'' +
                "problemaCardiaco=" + problemaCardiaco +
                '}';
    }
}
