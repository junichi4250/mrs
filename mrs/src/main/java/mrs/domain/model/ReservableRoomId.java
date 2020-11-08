package mrs.domain.model;

@Embeddable
public class ReservableRoomId implements Serializable{

	private Integer roomId;

	private LocalDate reservedDate;

	public ReservationRoomId(Integer roomId, LocalDate reservedDate) {
		this.roomId = roomId;
		this.reservedDate = reservedDate;
	}

	public ReservableRoomId() {
		Í
	}


}
