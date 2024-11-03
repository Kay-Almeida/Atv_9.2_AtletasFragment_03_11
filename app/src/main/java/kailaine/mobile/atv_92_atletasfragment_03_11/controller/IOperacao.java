package kailaine.mobile.atv_92_atletasfragment_03_11.controller;
/*
 *@author:<Kailaine Almeida de Souza RA: 1110482313026>
 */
import java.util.List;

public interface IOperacao <T>{

    public void cadastrar(T t);

    public List<T> listar();
}
