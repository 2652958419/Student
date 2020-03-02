package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;
/**
 * 实现dao接口中方法的一个操作类
 * @author 田先生
 *
 */
public class UserDaoimpl implements UserDao {

	public void save(User user) {
		// 创建一个集合来保存用户信息
		List<User> list = new ArrayList<User>();
		list.add(user);
		for (User user2 : list) {
			System.out.println(user2.getName()+","
					+user2.getAge());
		}
	}

}
