package mrs.domain.repository;

import java.time.LocalDate;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;

public interface ReservableRoomRepository extends jpaRepository<ReservableRoom, ReservableRoomId>{
	List<ReservableRoom> findByReservableRoomid_reservedDateOrderByReservableRoomId_roomidAsc(
			LocalDate reservedDate);
}
