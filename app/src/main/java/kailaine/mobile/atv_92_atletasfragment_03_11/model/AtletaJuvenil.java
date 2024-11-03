package kailaine.mobile.atv_92_atletasfragment_03_11.model;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import androidx.annotation.NonNull;

public class AtletaJuvenil extends Atleta{
    private int anos;

    public AtletaJuvenil(){
        super();
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    @NonNull
    @Override
    public String toString() {
        return "AtletaJuvenil{" +
                "nome='" + getNome() + '\'' +
                ", dataNascimento='" + getDataNascimento() + '\'' +
                ", bairro='" + getBairro()+ '\'' +
                "anos=" + anos +
                '}';
    }
}
