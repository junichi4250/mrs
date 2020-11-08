package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.GenerationType;

@Entity
public class MeetingRoom implements Serializable{
	@Id
	@Generated(strategy = GenerationType.IDENTITY)
	private Integer roomId;

	private String roomName;


}
