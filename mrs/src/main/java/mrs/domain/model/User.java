package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.Enumerated;

@Entity
@Table(name="user")
public class User implements Serializable {
	@Id
	private String userId;

	private String password;

	private String firstName;

	private String lastName;

	@Enumerated(EnumType.STRING)
	private RoleName roleName;



}
