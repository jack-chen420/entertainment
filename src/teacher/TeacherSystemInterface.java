package teacher;

public interface TeacherSystemInterface {
	/*
	 * 输入老师资料
	删除指定老师资料
	查询指定老师资料
	修改指定老师资料
	计算老师月薪水
	保存老师资料
	排序
	输出所有老师资料
	清空所有老师资料
	打印老师资料信息报表
	格式：：
	****************************************************
	*编号：0001                                        *
	**************************************************** 
	*姓名：张大同                                      *
	****************************************************
	*性别：男                                          *
	****************************************************
	从文件重新得到员工资料
	退出系统
	*/
	Teacher add();
	void deleteOne(int se);
	void searchOne(int a);
	void modifyOne(int b);
	float countMoney();
	void save();
	void sortThree(int c);
	void printAll();
	void deleteAll();
	void printOneMsg();
	void load();
	
	
	
	

}
