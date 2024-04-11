package dao;

import main.Cliente;

class ClienteDAO implements IClienteDAO {

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
}