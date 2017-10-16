package servis;

import java.sql.Date;
import java.util.List;
import model.makale_gs;
import dao.makale_gsDAOimpl;
 
public class makale_gs_ServiceImpl implements makale_gs_Service {

	
	private makale_gsDAOimpl menu_gsDAOimpl;
	
	 

	public makale_gs_ServiceImpl() {
		menu_gsDAOimpl = new makale_gsDAOimpl();
	}
	
	private makale_gsDAOimpl menu_gsDAOimpl() {
		return menu_gsDAOimpl;
	}
	

	@Override
	public makale_gs insert(makale_gs menus_gs) {
		 
		return menu_gsDAOimpl().insert(menus_gs);
	}

	@Override
	public makale_gs find(int id) {
		return menu_gsDAOimpl().find(id);
	}

	@Override
	public List<makale_gs> findAllkonu() {
		return menu_gsDAOimpl().findAllkonu();
	}

	@Override
	public void remove(int id) {
		menu_gsDAOimpl().remove(id);
		
	}
	
	
	
	
 
	 
	
 
	
	
}
