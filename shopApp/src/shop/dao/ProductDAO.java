package shop.dao;

import java.util.ArrayList;
import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.CustomerVO;
import shop.vo.ProductVO;

public class ProductDAO extends DBHelper {

	private static ProductDAO instance = new ProductDAO();
	public static ProductDAO getInstance() {
		return instance;
	}
	private ProductDAO(){}
	
	// 기본 CRUD 메서드
	public int insertProduct(ProductVO vo) {
		
		int count = 0;
		
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_PRODUCT);
			psmt.setInt(1, vo.getProdNo());
			psmt.setString(2, vo.getProdName());
			psmt.setInt(3, vo.getStock());
			psmt.setInt(4, vo.getPrice());
			psmt.setString(4, vo.getCompany());
			
			count = psmt.executeUpdate();
			closeAll();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return count;
	}
	
	public ProductVO selectProduct(int prodNo) {
		
		ProductVO vo = null;
		try {
			
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			psmt.setInt(1, prodNo);
			rs = psmt.executeQuery();

			if(rs.next()) {
				vo = new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
			}
			
			closeAll();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return vo;
	}
	
	public List<ProductVO> selectProducts() {
		
List<ProductVO> products = new ArrayList<>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				
				ProductVO vo = new ProductVO();
				vo.setProdNo(rs.getInt("prodNo"));
				vo.setProdName(rs.getString("prodName"));
				vo.setStock(rs.getInt("stock"));
				vo.setPrice(rs.getInt("price"));
				vo.setCompany(rs.getString("company"));
				
				products.add(vo);
			}
			
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return products;
	}
	
	public int updateProduct(ProductVO vo) {
		return 0;
	}
	
	public int deleteProduct(ProductVO prodNo) {
		return 0;
	}
	
	
}
