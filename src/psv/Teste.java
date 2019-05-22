package psv;

import java.sql.*;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

        cb.setPlaca("JKK1901");
        cb.setCor("Cinza");
        cb.setDescricao("Carro 1");
        System.out.println(cd.inserir(cb));

        cb.setPlaca("JHH5643");
        cb.setCor("Preto");
        cb.setDescricao("Carro 2");
        System.out.println(cd.inserir(cb));

        cb.setPlaca("GGT7750");
        cb.setCor("Verde");
        cb.setDescricao("Carro 3");
        System.out.println(cd.inserir(cb));
        
        cb.setPlaca("GGT7750");
        cb.setCor("Branco");
        cb.setDescricao("Carro 3");
        System.out.println(cd.alterar(cb));

        List<CarroBean> lista = cd.listarTodos();
        if (lista != null) {
            for (CarroBean carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descrição:" + carro.getDescricao());
            }
        }
    }
}
