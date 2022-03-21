package docu.webmvc.service.impl;

import java.util.List;

import docu.webmvc.dao.ReviewDao;
import docu.webmvc.dao.impl.ReviewDaoImpl;
import docu.webmvc.model.Review;
import docu.webmvc.service.ReviewService;

public class ReviewServicesImpl implements ReviewService {
	ReviewDao reviewDao = new ReviewDaoImpl();
	@Override
	public void insert(Review review) {
		reviewDao.insert(review);
		
	}

	@Override
	public void edit(Review review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		reviewDao.delete(id);
	}

	@Override
	public Review get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Review get(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> getAll() {
		return reviewDao.getAll();
	}
	
	@Override
	public List<Review> getReviewById(int id) {
		return reviewDao.getReviewById(id);
	}

}
