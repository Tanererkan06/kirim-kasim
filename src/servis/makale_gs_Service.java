	package servis;

import java.sql.Date;
import java.util.List;
import model.makale_gs;
import dao.makale_gsDAOimpl;
 
public interface makale_gs_Service {
	
	public makale_gs insert(makale_gs makale);

	public makale_gs find(int id);

	public List<makale_gs> findAllkonu();

	public void remove(int id);

}
