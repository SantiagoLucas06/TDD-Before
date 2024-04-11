package test.dao;

import dao.IClienteDAO;
import main.Cliente;

public class ClienteDaoMock implements IClienteDAO {

    @Override
    public boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(String cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Cliente cliente) {

    }

    public Cliente buscar(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(String.valueOf(cpf));
        return cliente ;
    }
}
