package kailaine.mobile.atv_92_atletasfragment_03_11.controller;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import java.util.ArrayList;
import java.util.List;

import kailaine.mobile.atv_92_atletasfragment_03_11.model.AtletaOutros;

public class OperacaoOutros implements IOperacao<AtletaOutros>{

    private List<AtletaOutros> lista;

    public OperacaoOutros(){
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(AtletaOutros atletaOutros) {
        lista.add(atletaOutros);
    }

    @Override
    public List<AtletaOutros> listar() {
        return this.lista;
    }
}
