package com.lionstone.staffmanagementsystem.Controllers;

import com.lionstone.staffmanagementsystem.DTO.StaffDTO;
import com.lionstone.staffmanagementsystem.Service.StaffService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/staff")
@AllArgsConstructor
public class StaffController {

    private StaffService staffService;

    @PostMapping
    public ResponseEntity<StaffDTO> createStaff(@RequestBody StaffDTO staffDTO) {
        StaffDTO savedStaff = staffService.createStaff(staffDTO);
        return ResponseEntity.ok(savedStaff);
    }
    @GetMapping
    public ResponseEntity<List<StaffDTO>> getAllStaff() {
        List<StaffDTO> list = staffService.getAllStaff();
        return ResponseEntity.ok(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<StaffDTO> getStaffById(@PathVariable("id") Integer staffId) {
        StaffDTO staffDTO = staffService.getStaffById(staffId);
        return ResponseEntity.ok(staffDTO);
    }

    @PutMapping("{id}")
    public ResponseEntity<StaffDTO> updateStaff(@PathVariable("id") Integer staffId, @RequestBody StaffDTO updatedStaff) {
        StaffDTO staffDTO = staffService.updateStaff(staffId, updatedStaff);
        return ResponseEntity.ok(staffDTO);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStaff(@PathVariable("id") Integer staffId) {
        staffService.deleteStaff(staffId);
        return ResponseEntity.ok("Staff Deleted Successfully!!");
    }
}
