package cafe.dao.face;

import java.util.List;

import cafe.dto.Cafe_menu_category;

public interface Menu_Management_Dao {
	public void category_insert(Cafe_menu_category cafe_menu_category);
	
	public List category_selectAll();
}
