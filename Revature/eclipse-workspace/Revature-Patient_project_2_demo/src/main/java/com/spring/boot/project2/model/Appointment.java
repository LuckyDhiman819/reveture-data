package com.spring.boot.project2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointmentdetails")
public class Appointment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int appointmentToken;
	private int patientId;
	private String patientName;
	private String gender;
	private String phoneNumber;
	private String email;
	private String address;
	private String disease;
	private String doctor;
	private String appointmentDateAndTime;
	private String message;
	private String appointmentStatus="Rejected";
}
