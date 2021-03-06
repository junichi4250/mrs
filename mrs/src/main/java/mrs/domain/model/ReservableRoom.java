package mrs.domain.model;

import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class ReservableRoom {
	@EmbeddedId
	private ReservableRoomId reservableRoomId;

	@ManyToOne
	@JoinColumn(name="room_id", insertable=false, updatable=false)
	@MapsId("roomId")
	private MeetingRoom meetingRoom;

	public ReservableRoom(ReservableRoomId reservableRoomId) {
		this.reservableRoomId = reservableRoomId;
	}

	public ReservableRoom() {

	}

}
