package kailaine.mobile.atv_92_atletasfragment_03_11;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import kailaine.mobile.atv_92_atletasfragment_03_11.controller.IOperacao;
import kailaine.mobile.atv_92_atletasfragment_03_11.controller.OperacaoJuvenil;
import kailaine.mobile.atv_92_atletasfragment_03_11.controller.OperacaoSenior;
import kailaine.mobile.atv_92_atletasfragment_03_11.model.AtletaJuvenil;
import kailaine.mobile.atv_92_atletasfragment_03_11.model.AtletaSenior;

public class AtletaSeniorFragment extends Fragment {

    private View view;
    private EditText etNomeAS, etDataAS, etBairroAS;
    private TextView tvProbAS, tvResultadoAS;
    private CheckBox cbSimAS;
    private Button btnCadastrarAS;

    public AtletaSeniorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_senior, container, false);
        etNomeAS = view.findViewById(R.id.etNomeAS);
        etDataAS = view.findViewById(R.id.etDataAS);
        etBairroAS = view.findViewById(R.id.etBairroAS);
        tvProbAS = view.findViewById(R.id.tvProbAS);
        tvResultadoAS = view.findViewById(R.id.tvResultadoAS);
        cbSimAS = view.findViewById(R.id.cbSimAS);

        btnCadastrarAS  = view.findViewById(R.id.btnCadastrarAS);
        tvResultadoAS.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        btnCadastrarAS.setOnClickListener(op -> cadastro());
        return view;
    }
    private void cadastro() {
        AtletaSenior as = new AtletaSenior();
        as.setNome(etNomeAS.getText().toString());
        as.setDataNascimento(etDataAS.getText().toString());
        as.setBairro(etBairroAS.getText().toString());
        if(cbSimAS.isChecked()){
            as.isProblemasCardiacos(true);
        }else{
            as.isProblemasCardiacos(false);
        }

        IOperacao op = new OperacaoSenior();
        op.cadastrar(as);
        List<AtletaSenior> lista = op.listar();

        StringBuffer buffer = new StringBuffer();
        for(AtletaSenior at : lista){
            buffer.append(at.toString()+"\n");
        }
        tvResultadoAS.setText(buffer.toString());
    }
}