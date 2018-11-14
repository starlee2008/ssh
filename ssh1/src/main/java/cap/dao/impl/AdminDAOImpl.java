package cap.dao.impl;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class AdminDAOImpl implements AdminDAO {
    @Resource
    private SessionFactory sessionFactory;

    public Session getSession() {
        return sessionFactory.openSession();
    }

    @Override
    public List<Admin> findAdmins() {
        String hql = "from Admin";
        return getSession().createQuery(hql).list();
    }
}
