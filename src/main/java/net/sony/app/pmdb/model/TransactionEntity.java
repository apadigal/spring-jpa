package net.sony.app.pmdb.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class TransactionEntity implements Serializable{
	
	@Column(nullable=false, updatable = false)
	private LocalDateTime createdAt;

	@Column(nullable = true)
	private LocalDateTime updatedAt;
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	@PrePersist
	public void prePersist()
	{
		this.createdAt = LocalDateTime.now();
	}
	
	@PreUpdate
	public void preUpdate()
	{
		this.updatedAt = LocalDateTime.now();
	}

}
