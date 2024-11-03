package kailaine.mobile.atv_92_atletasfragment_03_11.controller;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import java.util.ArrayList;
import java.util.List;

import kailaine.mobile.atv_92_atletasfragment_03_11.model.AtletaJuvenil;

public class OperacaoJuvenil implements IOperacao<AtletaJuvenil>{

    private List<AtletaJuvenil> lista;

    public OperacaoJuvenil(){
        this.lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(AtletaJuvenil atletaJuvenil) {
        lista.add(atletaJuvenil);
    }

    @Override
    public List<AtletaJuvenil> listar() {
        return this.lista;
    }
}
