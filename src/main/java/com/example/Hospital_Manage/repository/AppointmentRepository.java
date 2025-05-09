package com.example.Hospital_Manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital_Manage.modelentity.Appointment;



public interface AppointmentRepository extends JpaRepository<Appointment,Long> {


}
