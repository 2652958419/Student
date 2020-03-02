package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.StudentInfoDao;
import entity.StudentInfo;
import utils.MyDButils;

public class StudentInfoDaoImpl implements StudentInfoDao {

	@Override
	public int getCount() {
		int count = 0;
		try {
			// SQL命令
			String sql = "select count(1) from studentInfo";
			// 调用通用的方法
			ResultSet rs = MyDButils.queryAll(sql, null);
			// 处理结果集
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<StudentInfo> getStus(int currpage, int pageSize) {
		List<StudentInfo> list = new ArrayList<StudentInfo>();
		try {
			// 创建要执行的SQL命令
			String sql = "select * from studentInfo limit ?,?";
			ResultSet rs = MyDButils.queryPage(sql, currpage, pageSize);
			while (rs.next()) {
				list.add(new StudentInfo(rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getInt(4), rs.getString(5), 
						rs.getString(6)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<StudentInfo> getAll() {
		List<StudentInfo> list = new ArrayList<StudentInfo>();
		try {
			String sql = "select * from studentInfo";
			ResultSet rs = MyDButils.queryAll(sql, null);
			while (rs.next()) {
				list.add(new StudentInfo(rs.getInt(1), rs.getString(2), 
						rs.getInt(3), rs.getInt(4), rs.getString(5), 
						rs.getString(6)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
