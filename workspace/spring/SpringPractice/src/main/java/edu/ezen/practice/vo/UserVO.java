package edu.ezen.practice.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class UserVO extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userid;
	private String name;
	private String password;
	private String authority;
	private String email;
	private String address;
	private String phone;
	
	public UserVO(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities,
			String authority, String name) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		
		// security외 필요한 유저 정보를 추가한다.
		this.userid =username;
		this.password = password;
		this.authority = authority;
		this.name=name;
	}
	
	
	
}
