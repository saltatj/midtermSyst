package ca.sheridancollege.beans;

import java.io.Serializable;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Store implements Serializable{
	
	
	private static final long serialVersionUID = -81894988962951713L;
	private String storeName;
}
