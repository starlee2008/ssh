package cap.util;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class DBUtil {
    private static DriverManagerDataSource dataSource;

    public static DriverManagerDataSource getDataSource() {
        dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/cap");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        return dataSource;
    }
}
