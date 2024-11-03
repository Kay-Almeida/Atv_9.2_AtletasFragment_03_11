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
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import kailaine.mobile.atv_92_atletasfragment_03_11.controller.IOperacao;
import kailaine.mobile.atv_92_atletasfragment_03_11.controller.OperacaoJuvenil;
import kailaine.mobile.atv_92_atletasfragment_03_11.model.AtletaJuvenil;

public class AtletaJuvenilFragment extends Fragment {

    private View view;
    private EditText etNomeAJ, etDataAJ, etBairroAJ, etAnosAJ;
    private TextView tvResultadoAJ;
    private Button btnCadastrarAJ;

    public AtletaJuvenilFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_juvenil, container, false);
        etNomeAJ =view.findViewById(R.id.etNomeAJ);
        etDataAJ = view.findViewById(R.id.etDataAJ);
        etBairroAJ = view.findViewById(R.id.etBairroAJ);
        etAnosAJ= view.findViewById(R.id.etAnosAJ);
        btnCadastrarAJ = view.findViewById(R.id.btnCadastrarAJ);
        tvResultadoAJ = view.findViewById(R.id.tvResultadoAJ);
        tvResultadoAJ.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCadastrarAJ.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        AtletaJuvenil aj = new AtletaJuvenil();
        aj.setNome(etNomeAJ.getText().toString());
        aj.setDataNascimento(etDataAJ.getText().toString());
        aj.setBairro(etBairroAJ.getText().toString());
        aj.setAnos(Integer.parseInt(etAnosAJ.getText().toString()));

        IOperacao op = new OperacaoJuvenil();
        op.cadastrar(aj);
        List<AtletaJuvenil> lista = op.listar();

        StringBuffer buffer = new StringBuffer();
        for(AtletaJuvenil at : lista){
            buffer.append(at.toString()+"\n");
        }
        tvResultadoAJ.setText(buffer.toString());
    }
}