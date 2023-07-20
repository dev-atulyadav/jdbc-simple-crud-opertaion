package com.jsp.product.service;

import com.jsp.product.dao.ProductDao;
import com.jsp.product.dto.Product;

/**
 * 
 * @author Atul
 *
 */

public class ProductService {
	
	ProductDao productDao = new ProductDao();
	
	public Product productService(Product product) {
		if(product.getProductId()<10000) {
			System.out.println("-------------DATA INSERTED----------------");
			return productDao.insertProduct(product);
		}
		else {
			System.err.println("ID should be of 4 digits");
		}
		return null;
	}
	public int updateProductName(int id, String name) {
		return productDao.updateProductName(id,name);
	}
	
	public int updateProductColor(int id, String color) {
		return productDao.updateProductColor(id,color);
	}
	public int updateProductPrice(int id, double price) {
		return productDao.updateProductPrice(id,price);
	}
	public void displayProduct() {
		productDao.displayProduct();
	}
	public int deleteProduct(int id) {
		return productDao.deleteProduct(id);
	}

}
