package org.example.Service.IMP;

import org.example.Repository.INF.AdminRepository;
import org.example.entities.Admin;

import java.util.List;

public class AdminService {

    private final AdminRepository adminRepository;

    // Constructor injection for the repository
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    // Method to create a new admin
    public void createAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    // Method to get admin by ID
    public Admin getAdminById(String id) {
        return adminRepository.findById(id);
    }

    // Method to get all admin
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    // Method to update admin
    public void updateAdmin(Admin admin) {
        adminRepository.update(admin);
    }

    // Method to delete admin by ID
    public void deleteAdminById(String id) {
        adminRepository.deleteById(id);
    }
}
