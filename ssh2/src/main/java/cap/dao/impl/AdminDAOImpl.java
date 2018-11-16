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
    public List<Admin> findByPage(int pageNo, int pageSize) {
        String hql = "from Admin";
        return getSession().createQuery(hql).setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize).list();
    }

    @Override
    public int getTotal() {
        String hql = "select count(*) from Admin";
        String total = getSession().createQuery(hql).uniqueResult().toString();
        return Integer.parseInt(total);
    }

    @Override
    public void addAdmin(Admin admin) {

        getSession().save(admin);
    }
}
