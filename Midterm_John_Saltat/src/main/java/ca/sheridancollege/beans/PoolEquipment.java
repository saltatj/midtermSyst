package ca.sheridancollege.beans;

import java.io.Serializable;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PoolEquipment implements Serializable{
	
	
	private static final long serialVersionUID = -5184679873617264421L;
	private String name;
	private double price;
	private int quantity;	
	private String storeName;
}
