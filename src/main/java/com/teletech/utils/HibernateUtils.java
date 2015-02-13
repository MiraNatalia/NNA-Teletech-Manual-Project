package com.teletech.utils;

import java.sql.Connection;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.engine.jdbc.spi.JdbcServices;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtils {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static final Configuration configuration = new Configuration();

	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void shutdown() {
		getSessionFactory().close();
	}

	public static ConnectionProvider getConnectionProvider()
	{
		final ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	    ConnectionProvider connProvider=serviceRegistry.getService(JdbcServices.class).getConnectionProvider();
	    
		return ((SessionFactoryImplementor)sessionFactory).getConnectionProvider();
	}
	
	public static Connection getConnection(ConnectionProvider provider) throws Exception {
		return provider.getConnection();
	}
	
	public static Connection getConnection() throws Exception
	{
		Session session = sessionFactory.getCurrentSession();
		SessionImplementor sessionImplementor = (SessionImplementor) session;
		Connection conn = sessionImplementor.getJdbcConnectionAccess().obtainConnection();
		
		return conn;
	}
}
