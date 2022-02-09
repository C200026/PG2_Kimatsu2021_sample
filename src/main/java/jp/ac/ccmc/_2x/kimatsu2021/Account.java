package jp.ac.ccmc._2x.kimatsu2021;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long id;

	@NotNull
    @Size(min=2,max=40)
	private String name;

	@NotNull
    @Pattern(regexp="^[12][A-Z]$")
	private String className;

	@NotNull
    @Pattern(regexp="^\\d{2,4}-\\d{2,4}-\\d{2,4}$|^\\d{9,12}$")
	private String tel;

	@NotNull
	@NotBlank
	private String address;

	public Account() {
		super();
	}

	public Account(String name, String className, String tel, String address) {
		super();
		this.name = name;
        this.className = className;
		this.tel = tel;
		this.address = address;
	}
}