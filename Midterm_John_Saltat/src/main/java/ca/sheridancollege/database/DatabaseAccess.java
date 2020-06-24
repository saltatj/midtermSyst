package ca.sheridancollege.database;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import ca.sheridancollege.beans.PoolEquipment;


@Repository
public class DatabaseAccess {
	
	@Autowired
	NamedParameterJdbcTemplate jdbc;
	
	public void addStore() {
		String query = "INSERT into add_store (store_name) "
				+ "VALUES ('Walmart);";
		
		jdbc.update(query,new HashMap());

}

	public void addEquipment() {
		String query = "INSERT into add_equipment (equipment_name ,price, quantity) "
				+ "VALUES ('swimsuit', 10.99, 25);";
		
		jdbc.update(query,new HashMap());
		
	}
	public void addEquipment(PoolEquipment poolequipment) {
		MapSqlParameterSource parameters = new MapSqlParameterSource();
		String query="INSERT into add_equipment VALUES"+
		"(:name,:price, :quantity)";
		parameters.addValue("name", poolequipment.getName());
		parameters.addValue("price", poolequipment.getPrice());
		parameters.addValue("quantity", poolequipment.getQuantity());
		jdbc.update(query, parameters);			
	}
	public ArrayList<PoolEquipment> getPoolEquipment(){
		String q = "Select from add_equipment";
		ArrayList<PoolEquipment> poolEquipment = new ArrayList<PoolEquipment>();
		List<Map<String, Object>> rows = jdbc.queryForList(q, new HashMap<String,Object>());
		
		for (Map<String, Object> row :rows){
			PoolEquipment pe = new PoolEquipment();
			pe.setName((String)(row.get("name")));
			pe.setPrice((Double)(row.get("price")));
			pe.setQuantity((Integer)(row.get("quantity")));
			poolEquipment.add(pe);
		}
			return poolEquipment;			
}

		
	}

