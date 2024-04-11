package service;

import dao.IClienteDAO;
import main.Cliente;

public class ClienteServiceImpl implements IClienteService {

    private final IClienteDAO clienteDAO;

    public ClienteServiceImpl(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(String cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }
}