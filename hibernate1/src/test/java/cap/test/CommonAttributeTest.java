package cap.test;

import cap.bean.CommonAttributeDemo;
import cap.bean.DateTimeDemo;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.hibernate.Session;

public class CommonAttributeTest {
    private SessionFactory sessionFactory;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }

    @Test
    public void testDateTime() {
        Session sess = sessionFactory.openSession();
        Transaction tx = null;//第1行代码
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(0L);
        java.sql.Time sqlTime = new java.sql.Time(0L);
        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(0L);
        java.util.Calendar utilCalendar = new java.util.GregorianCalendar();
        DateTimeDemo dateTimeTest = new DateTimeDemo();//第7行代码
        dateTimeTest.setUtilDate(utilDate);
        dateTimeTest.setUtilDate_timestamp(sqlTimestamp);
        dateTimeTest.setUtilDate_date(sqlDate);
        dateTimeTest.setUtilDate_time(sqlTime);
        dateTimeTest.setSqlDate(sqlDate);
        dateTimeTest.setSqlTime(sqlTime);
        dateTimeTest.setSqlTimestamp(sqlTimestamp);
        dateTimeTest.setUtilCalendar(utilCalendar);
        dateTimeTest.setUtilCalendar_calendar(utilCalendar);
        dateTimeTest.setUtilCalendar_calendar_date(utilCalendar); //第17行代码
        try {
            tx = sess.beginTransaction();//第19行代码
            sess.save(dateTimeTest);
            tx.commit();//第21行代码
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
            throw e;
        } finally {
            sess.close();
        }
    }

    @Test
    public void insertCommonAttribute() {
        Session sess = sessionFactory.openSession();
        Transaction tx = null;
        CommonAttributeDemo attrDemo = new CommonAttributeDemo();//第3行代码
        attrDemo.setByteAttr((byte) 255);
        attrDemo.setShortAttr((short) 256);
        attrDemo.setIntAttr(100);
        attrDemo.setLongAttr(1000L);
        attrDemo.setFloatAttr(1234.56789F);
        attrDemo.setDoubleAttr(1234.56789);
        attrDemo.setBigDecimalAttr(new java.math.BigDecimal(1234.56789));
        attrDemo.setBooleanAttr_boolean(true);
        attrDemo.setBooleanAttr_yes_no(true);
        attrDemo.setBooleanAttr_true_false(true);
        attrDemo.setCharAttr('a');
        attrDemo.setStringAttr("Hello World");
        attrDemo.setStringAttr2("Hello World 2");
        attrDemo.setClassAttr_class((Class) (cap.bean.CommonAttributeDemo.class));
        attrDemo.setLocaleAttr(java.util.Locale.CHINA);
        attrDemo.setTimeZoneAttr(java.util.TimeZone.getDefault());
        //下面一行为第20行代码33
        attrDemo.setCurrencyAttr(java.util.Currency.getInstance(java.util.Locale.US));
        try {
            tx = sess.beginTransaction();
            sess.save(attrDemo);
            tx.commit();
        } catch (Exception e) {
            if (tx != null)
                tx.rollback();
            throw e;
        } finally {
            sess.close();
        }
    }


}
