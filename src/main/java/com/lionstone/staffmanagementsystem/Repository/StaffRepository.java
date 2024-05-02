package com.lionstone.staffmanagementsystem.Repository;

import com.lionstone.staffmanagementsystem.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}
