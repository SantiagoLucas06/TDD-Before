package dao;

import main.Cliente;

public interface IClienteDAO {
    boolean salvar(Cliente cliente);
    Cliente buscarPorCPF(String cpf);
    void excluir(Cliente cliente);
}
