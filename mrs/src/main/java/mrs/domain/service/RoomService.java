package mrs.domain.service;

@Service
@Transactional
public class RoomService {
	@Autowired
	ReservableRoomRepository reservableRoomRepository;

	public List<ReservableRoom> findReservableRooms(LocadDate date) {
		return reservableRoomRepository.findByreservableRoomId_reserved
				DateOrderByReservableRoomId_roomIdAsc(date);
	}
}
