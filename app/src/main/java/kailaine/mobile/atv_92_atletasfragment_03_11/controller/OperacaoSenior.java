package kailaine.mobile.atv_92_atletasfragment_03_11.controller;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import java.util.ArrayList;
import java.util.List;

import kailaine.mobile.atv_92_atletasfragment_03_11.model.AtletaSenior;

public class OperacaoSenior implements IOperacao<AtletaSenior>{

    private List<AtletaSenior> lista;

    public OperacaoSenior(){
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(AtletaSenior atletaSenior) {
        lista.add(atletaSenior);
    }

    @Override
    public List<AtletaSenior> listar() {
        return this.lista;
    }
}
