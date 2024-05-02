package com.lionstone.staffmanagementsystem.Service;

import com.lionstone.staffmanagementsystem.DTO.StaffDTO;
import com.lionstone.staffmanagementsystem.Mapper.StaffMapper;
import com.lionstone.staffmanagementsystem.Model.Staff;
import com.lionstone.staffmanagementsystem.Repository.StaffRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StaffServiceImplementation implements StaffService{

    private StaffRepository repository;
    @Override
    public StaffDTO createStaff(StaffDTO staffDTO) {
        Staff staff = StaffMapper.mapToStaff(staffDTO);
        Staff savedStaff = repository.save(staff);
        return StaffMapper.mapToStaffDTO(savedStaff);
    }

    @Override
    public List<StaffDTO> getAllStaff() {
        List<Staff> staffList = repository.findAll();
        return staffList.stream().map(
                (staff) -> StaffMapper.mapToStaffDTO(staff)
        ).collect(Collectors.toList());
    }

    @Override
    public StaffDTO getStaffById(Integer staffId) {
        Staff staff = repository.findById(staffId).orElseThrow();
        return StaffMapper.mapToStaffDTO(staff);
    }

    @Override
    public StaffDTO updateStaff(Integer staffId, StaffDTO updatedStaff) {
        Staff staff = repository.findById(staffId).orElseThrow();
        staff.setFirstName(updatedStaff.getFirstName());
        staff.setLastName(updatedStaff.getLastName());
        staff.setEmail(updatedStaff.getEmail());

        repository.save(staff);
        return StaffMapper.mapToStaffDTO(staff);
    }

    @Override
    public void deleteStaff(Integer staffId) {
        Staff staff = repository.findById(staffId).orElseThrow();
        repository.delete(staff);
    }
}
