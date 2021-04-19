package dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.utils.HibernateUtils;

import entity.User;

public class UserDAO {
	private Session hSession;

	public UserDAO() {
		this.hSession = HibernateUtils.getSession();
	}

	public User insert(User entity) {
		this.hSession.beginTransaction();
		this.hSession.save(entity);
		this.hSession.getTransaction().commit();
		return entity;
	}

	public List<User> getAll() {
		String hql = "FROM User";
		Query query = this.hSession.createQuery(hql);

		List<User> listUser = query.getResultList();

		return listUser;
	}

	public User findById(String id) {
		User entity = this.hSession.get(User.class, id);
		return entity;
	}

	public void update(User entity) {
		try {
			this.hSession.clear();
			this.hSession.beginTransaction();
			this.hSession.update(entity);
			this.hSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			this.hSession.getTransaction().rollback();
		}
	}

	public boolean delete(String id) {
		try {
			this.hSession.clear();
			this.hSession.beginTransaction();
			this.hSession.delete(hSession.get(User.class, id));
			this.hSession.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			this.hSession.getTransaction().rollback();
			return false;
		}
	}

	public User login(String email, String password) {
		String hql = "SELECT objUser FROM User objUser WHERE email = :email AND password = :password";

		Query query = this.hSession.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		User entity = null;
		try {
			entity = (User) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return entity;
	}
}
