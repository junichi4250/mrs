package mrs.domain.model;

import java.io.Serializable;
import java.time.LocalTime;

@Entity
public class Reservation implements Serializable{
	@Id
	@GeneratedValeu(strategy = GenerationType.IDENTITY)
	private Integer reservationId;

	private LocalTime startTime;

	private LocalTime endTime;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "reserved_date"),
		@JoinColumn(name = "room_id")
	})
	private ReservableRoom reservableRoom;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
