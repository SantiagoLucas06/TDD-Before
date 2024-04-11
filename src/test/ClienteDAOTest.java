package test;

import dao.IClienteDAO;
import main.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.dao.ClienteDaoMock;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;
    private Cliente cliente;
    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();
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
        clienteDao.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
}
