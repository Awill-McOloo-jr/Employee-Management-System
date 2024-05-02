package com.lionstone.staffmanagementsystem.Mapper;

import com.lionstone.staffmanagementsystem.DTO.StaffDTO;
import com.lionstone.staffmanagementsystem.Model.Staff;

public class StaffMapper {

    public static StaffDTO mapToStaffDTO (Staff staff) {
        return new StaffDTO(
                staff.getId(),
                staff.getFirstName(),
                staff.getLastName(),
                staff.getEmail()
        );
    }


    public static Staff mapToStaff (StaffDTO staffDTO) {
        return new Staff(
                staffDTO.getId(),
                staffDTO.getFirstName(),
                staffDTO.getLastName(),
                staffDTO.getEmail()
        );
    }
}
