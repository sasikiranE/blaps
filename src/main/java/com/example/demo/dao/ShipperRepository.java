package com.example.demo.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Shipper;

@Repository
public class ShipperRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void createShipper(Shipper shipper) {
		String sql_query = "INSERT INTO Shipper (shipperId, firstName, lastName, phoneNumber, shipperRating) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql_query,
				shipper.getShipperId(),
				shipper.getFirstName(),
				shipper.getLastName(),
				shipper.getPhoneNumber(),
				shipper.getShipperRating()
		);
	}
	
	public void updateShipper(Shipper shipper) {
		String sql_query = "UPDATE Shipper SET firstName = ?, lastName = ?, phoneNumber = ?, shipperRating = ? WHERE shipperId = ?";
		jdbcTemplate.update(sql_query,
				shipper.getFirstName(),
				shipper.getLastName(),
				shipper.getPhoneNumber(),
				shipper.getShipperRating(),
				shipper.getShipperId()
		);
	}
	
	public void deleteShipper(Shipper shipper) {
		String sql_query = "DELETE FROM Shipper WHERE shipperId = ?";
		jdbcTemplate.update(sql_query,
				shipper.getShipperId()
		);
	}
	
	public List<Shipper> getAll() {
		String sql_query = "SELECT * FROM Shipper";
		return jdbcTemplate.query(sql_query, new BeanPropertyRowMapper<>(Shipper.class));
	}
	
	public Shipper getProductById(int shipperId) {
		try {
			String sql_query = "SELECT * FROM Product WHERE shipperId = ?";
			return jdbcTemplate.queryForObject(sql_query, new BeanPropertyRowMapper<>(Shipper.class), new Object[] { shipperId });
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			return null;
		}
	}

}
