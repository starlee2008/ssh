package cap.dao.impl;

import cap.dao.AdminDAO;

public class AdminDAOImpl implements AdminDAO {
    @Override
    public String sayHi() {
        return "欢迎您学习Spring技术";
    }
}
