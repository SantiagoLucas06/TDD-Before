package test;

import dao.IClienteDAO;
import main.Cliente;
import org.junit.Assert;
import org.junit.Before;
import service.ClienteServiceImpl;
import service.IClienteService;
import org.junit.Test;
import test.dao.ClienteDaoMock;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteServiceImpl(dao);
    }
    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setNome("Maria");
        cliente.setCpf("123456789");
        cliente.setTelefone("123456789");
        cliente.setEndereco("Rua Sapucaí");
        cliente.setCidade("Rio de Janeiro");
        cliente.setEstado("Rio de Janeiro");
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    public void salvarCliente() {
        clienteService.salvar(cliente);
    }
}