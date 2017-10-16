package dao;

import java.util.List;

import model.makale_gs;
public interface makale_gsDAO {
	
	public makale_gs insert(makale_gs menus_gs);

	public makale_gs find(int id);

	public List<makale_gs> findAllkonu();

	public void remove(int id);

}
