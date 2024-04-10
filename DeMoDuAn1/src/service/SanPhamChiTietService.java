/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;

import model.SanPhamChiTiet;
import repository.SanPhamChiTietRepo;

/**
 * @author ledin
 */
public class SanPhamChiTietService {

    SanPhamChiTietRepo spctRepo = new SanPhamChiTietRepo();

    public List<SanPhamChiTiet> getAllSPCT() {
        return spctRepo.getAllSPCT();
    }

    public String insertSPCT(SanPhamChiTiet spct) {
        String regexName = "^[a-zA-Z\\p{L}\\s]{2,50}$";
        if (spct.getMaSPCT() == null || spct.getMaSPCT().isEmpty()
                || !spct.getMaSPCT().matches(regexName)
                || spct.getMaSPCT().length() > 10) {
            return "Thêm mới sản phẩm chi tiết thất bại";
        } else if (spct.getSoLuong() == 0 || spct.getSoLuong() > 1000 || spct.getSoLuong() < 0) {
            return "Thêm mới sản phẩm chi tiết thất bại";
        } else if (spct.getDonGia() == 0 || spct.getDonGia() > 100000 || spct.getDonGia() < 0) {
            return "Thêm mới sản phẩm chi tiết thất bại";
        } else if (spct.getTrangThai() != 1 && spct.getTrangThai() != 2 || spct.getTrangThai() == 0 || spct.getTrangThai() < 1) {
            return "Thêm mới sản phẩm chi tiết thất bại";
        } else if (spct.getNgayTao() == null) {
            return "Thêm mới sản phẩm chi tiết thất bại";
        } else if (!spct.getMaSanPham().matches(regexName)) {
            return "Thêm mới sản phẩm chi tiết thất bại";
        }
//        else if (!isNumeric(spct.getSoLuong())) {
//            return "Thêm mới sản phẩm chi tiết thất bại";
//        }
        else {
            spctRepo.insertSPCT(spct);
        }
        return "";
    }

    public String updateSPCT(SanPhamChiTiet spct) {
        int x = spctRepo.updateSPCT(spct);
        if (x >= 0) {
            return "Cập nhật sản phẩm chi tiết thành công";
        }
        return "Cập nhật sản phẩm chi tiết thất bại";
    }

    public String updateSPCT_TTDungBan(String maSPCT) {
        int x = spctRepo.updateSPCT_TTDungBan(maSPCT);
        if (x >= 0) {
            return "Cập nhật sản phẩm chi tiết dừng bán thành công";
        }
        return "Cập nhật sản phẩm chi tiết dừng bán thất bại";
    }
}
