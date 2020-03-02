package service.impl;

import dao.UserDao;
import dao.impl.UserDaoimpl;
import entity.User;
import service.UserService;

public class UserServiceimpl implements UserService {
	// 业务层调用数据访问层的数据
	UserDao dao = new UserDaoimpl();
	@Override
	public void save(User user) {
		// 使用数据访问层中的类，调用它的方法来实现数据的添加
		dao.save(user);
	}

}
