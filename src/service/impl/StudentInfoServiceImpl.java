package service.impl;

import java.util.List;

import dao.StudentInfoDao;
import dao.impl.StudentInfoDaoImpl;
import entity.StudentInfo;
import service.StudentInfoService;

public class StudentInfoServiceImpl implements StudentInfoService {
	// 创建一个接口的实现类对象
	private StudentInfoDao sdao = new StudentInfoDaoImpl();
	@Override
	public int getCount() {
		return sdao.getCount();
	}

	@Override
	public List<StudentInfo> getStus(int currpage, int pageSize) {
		return sdao.getStus(currpage, pageSize);
	}

	@Override
	public List<StudentInfo> getAll() {
		return sdao.getAll();
	}

}
