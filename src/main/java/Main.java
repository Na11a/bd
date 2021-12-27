import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

import symonenko.hibernate.HibernateUtil;
import symonenko.view.View;

public class Main {

    public static void main(String[] args) {
        HibernateUtil.getSessionFactory(); // stub to print Hibernate logs before actual view
        new View().show();
    }
}