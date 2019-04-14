package corejava.solid;

/**
 * Client should not forced to implement unnecessary method which they will not
 * use
 * 
 * @author ayush
 */
interface ICreateEntity {
	void save();
}

interface IReadEntity {
	void read();
}

interface IUpdateEntity {
	void update();
}

interface IDeleteEntity {
	void delete();
}

interface ICrudDao extends ICreateEntity, IReadEntity, IUpdateEntity, IDeleteEntity {

}

class CrudDaoImpl implements ICrudDao {

	@Override
	public void save() {
	}

	@Override
	public void read() {
	}

	@Override
	public void update() {
	}

	@Override
	public void delete() {
	}
}

interface IService1 extends ICreateEntity, IDeleteEntity {

}

class ServiceImpl1 implements IService1 {

	@Override
	public void save() {

	}

	@Override
	public void delete() {

	}
}

class CrudManager {
	private ICrudDao basicCrud;
	private IService1 service;

	public CrudManager(ICrudDao basicCrud, IService1 service) {
		super();
		this.basicCrud = basicCrud;
		this.service = service;
	}

	public void setBasicCrud(ICrudDao basicCrud) {
		this.basicCrud = basicCrud;
	}

	public void setService(IService1 service) {
		this.service = service;
	}

}

public class InterfaceSeg {

	public InterfaceSeg() {
	}

}
