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
import kailaine.mobile.atv_92_atletasfragment_03_11.controller.OperacaoSenior;
import kailaine.mobile.atv_92_atletasfragment_03_11.model.AtletaOutros;
import kailaine.mobile.atv_92_atletasfragment_03_11.model.AtletaSenior;

public class AtletaOutrosFragment extends Fragment {

    private View view;
    private EditText etNomeAO, etDataAO, etBairroAO, etAcademiaAO, etRecordAO;
    private TextView tvResultadoAO;
    private Button btnCadastrarAO;

    public AtletaOutrosFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blank, container, false);
        etNomeAO = view.findViewById(R.id.etNomeAO);
        etDataAO = view.findViewById(R.id.etDataAO);
        etBairroAO = view.findViewById(R.id.etBairroAO);
        etAcademiaAO = view.findViewById(R.id.etAcademiaAO);
        etRecordAO = view.findViewById(R.id.etRecordAO);
        tvResultadoAO = view.findViewById(R.id.tvResultadoAO);
        btnCadastrarAO = view.findViewById(R.id.btnCadastrarAO);
        tvResultadoAO.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnCadastrarAO.setOnClickListener(op -> cadastro());
        return view;
    }
    private void cadastro() {
        AtletaOutros ao = new AtletaOutros();
        ao.setNome(etNomeAO.getText().toString());
        ao.setDataNascimento(etDataAO.getText().toString());
        ao.setBairro(etBairroAO.getText().toString());
        ao.setAcademia(etAcademiaAO.getText().toString());
        ao.setRecordeSegundos(Double.parseDouble(etRecordAO.getText().toString()));

        IOperacao op = new OperacaoSenior();
        op.cadastrar(ao);
        List<AtletaOutros> lista = op.listar();

        StringBuffer buffer = new StringBuffer();
        for(AtletaOutros at : lista){
            buffer.append(at.toString()+"\n");
        }
        tvResultadoAO.setText(buffer.toString());
    }

}