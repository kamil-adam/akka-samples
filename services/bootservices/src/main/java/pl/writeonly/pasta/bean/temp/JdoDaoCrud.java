package pl.writeonly.pasta.bean.temp;

import java.util.Collection;

import javax.jdo.PersistenceManagerFactory;

import org.springframework.orm.jdo.support.JdoDaoSupport;

import scala.actors.threadpool.ThreadPoolExecutor.Worker;

public class JdoDaoCrud<T> extends JdoDaoSupport implements Crud<T> {

	public JdoDaoCrud(PersistenceManagerFactory factory) {
		setPersistenceManagerFactory(factory);
	}

	public Collection find(Class<T> entityClass, final String filter, final String ordering) {
		final Collection<T> collection = getJdoTemplate().find(entityClass,
				filter, ordering);
		return getPersistenceManager().detachCopyAll(collection);
	}

	public T getObjectById(Class<T> entityClass, Long id) {
		final T entity = getJdoTemplate().getObjectById(entityClass, id);
		return getPersistenceManager().detachCopy(entity);
	}

	public T storeWorker(T entity) {
		return getJdoTemplate().makePersistent(entity);
	}

	public void deleteWorker(Worker entity) {
		getPersistenceManager().deletePersistent(entity);

	}
}
