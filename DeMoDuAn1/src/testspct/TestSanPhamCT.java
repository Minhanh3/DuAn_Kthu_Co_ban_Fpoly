package testspct;

import model.SanPhamChiTiet;
import org.junit.Assert;
import org.junit.Test;
import service.SanPhamChiTietService;

import java.util.Date;
import java.util.UUID;

public class TestSanPhamCT {
    public String random() {
        return UUID.randomUUID().toString().substring(0, 5);
    }

    private SanPhamChiTietService sanPhamChiTietService = new SanPhamChiTietService();

    @Test
    public void testSanPhamAdd() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thành công", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamAddMASPCT() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet("", "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamAddMASPCT1() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet("@", "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamAddMASPCT2() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet("-+;", "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }@Test
    public void testSanPhamAddMASPCT3() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet("SPCT1111111", "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamMASP() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }@Test
    public void testSanPhamMASP1() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "@", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }@Test
    public void testSanPhamMASP2() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "+-.;", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamMAMAU() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamMASIZE() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamCHATLIEU() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamMAKIEUDANG() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamSOLUONG() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 0, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamSOLUONG1() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 1001, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamSOLUONG2() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 999999999, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamSOLUONG3() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", -1, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamSOLUONG4() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", -99, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamSOLUONG5() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", -999999999, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamDONGIA() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 0, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamDONGIA1() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 100001, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamDONGIA2() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 999999999, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamDONGIA3() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, -1, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamDONGIA4() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, -10, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamDONGIA5() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, -999999999, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 2);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamTRANGTHAI() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 3);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamTRANGTHAI1() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 0);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamTRANGTHAI2() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 99);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamTRANGTHAI3() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), 999999999);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamTRANGTHAI4() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), -1);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamTRANGTHAI5() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), -99);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }

    @Test
    public void testSanPhamTRANGTHAI6() {
        SanPhamChiTiet sanPhamChiTiet = new SanPhamChiTiet(random(), "SP001", "MS003", "SIZE43", "CL003", "KD003", 77, 333, new Date(2022 - 02 - 20), new Date(2023 - 05 - 04), -999999999);
        Assert.assertEquals("Thêm mới sản phẩm chi tiết thất bại", sanPhamChiTietService.insertSPCT(sanPhamChiTiet));
    }
}
