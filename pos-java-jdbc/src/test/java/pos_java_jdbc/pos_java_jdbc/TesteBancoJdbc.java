package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.BeanUserfone;
import model.Telefone;
import model.Userposjava;

public class TesteBancoJdbc{

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setNome("Paulo");
		userposjava.setEmail("paulo@gmail.com");
		
		userPosDAO.salvar(userposjava);
		
	}
	
	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("----------------------------------------");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initBuscar() {
		
		UserPosDAO dao = new UserPosDAO();
		
		try {
			Userposjava userposjava = dao.buscar(5L);
			
			System.out.println(userposjava);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void initAtualizar() {
		
		try {
			UserPosDAO dao = new UserPosDAO();
			
			Userposjava objetoBanco = dao.buscar(5L);
			
			objetoBanco.setNome("Nome Mudado com metodo atualizar");
			
			dao.atualizar(objetoBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void initDeletar() {
		try {
			
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(4L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testeInseretTelefone() {
		
		Telefone telefone = new Telefone();
		telefone.setNumero("(87) 4445-4545 ");
		telefone.setTipo("Casa");
		telefone.setUsuario(12L);
		
		UserPosDAO dao = new UserPosDAO();
		dao.salvarTelefone(telefone);
	}
	
	@Test
	public void testeCarregaFonesUser() {
		
		UserPosDAO dao = new UserPosDAO();
		
		List<BeanUserfone> beanUserfones = dao.listaUserFone(12L);
		
		for (BeanUserfone beanUserfone : beanUserfones) {
			System.out.println(beanUserfone);
			System.out.println("------------------------------------------\n");
		}
		
	}
	
	@Test
	public void testeDeleteuserFone() {
		
		UserPosDAO dao = new UserPosDAO();
		dao.deleteFonesPorUser(11L);
	}
	
	
	
}
