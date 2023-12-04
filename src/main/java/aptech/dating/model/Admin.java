package aptech.dating.model;
// Generated Oct 30, 2023, 4:19:04 PM by Hibernate Tools 4.3.6.Final

import static jakarta.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "admin")
public class Admin implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String role;
	private Set<Banned> banneds = new HashSet<Banned>(0);
	private Set<Blog> blogs = new HashSet<Blog>(0);

	public Admin() {
	}

	public Admin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Admin(String username, String password, Set<Banned> banneds, Set<Blog> blogs, String role) {
		this.username = username;
		this.password = password;
		this.banneds = banneds;
		this.blogs = blogs;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", nullable = false)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admin")
	public Set<Banned> getBanneds() {
		return this.banneds;
	}

	public void setBanneds(Set<Banned> banneds) {
		this.banneds = banneds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admin")
	public Set<Blog> getBlogs() {
		return this.blogs;
	}

	public void setBlogs(Set<Blog> blogs) {
		this.blogs = blogs;
	}
	
	@Column(name="role", nullable= false, length = 45)
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
