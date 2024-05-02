package com.lionstone.staffmanagementsystem.Service;

import com.lionstone.staffmanagementsystem.DTO.StaffDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StaffService {

    //Method to create a staff
    StaffDTO createStaff(StaffDTO staffDTO);

    //Get All Staff
    List<StaffDTO> getAllStaff();

    StaffDTO getStaffById(Integer staffId);

    StaffDTO updateStaff(Integer staffId, StaffDTO updatedStaff);

    void deleteStaff(Integer staffId);
}
