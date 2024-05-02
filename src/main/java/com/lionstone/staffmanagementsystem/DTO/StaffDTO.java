package com.lionstone.staffmanagementsystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StaffDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
