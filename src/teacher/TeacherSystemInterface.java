package teacher;

public interface TeacherSystemInterface {
	/*
	 * ������ʦ����
	ɾ��ָ����ʦ����
	��ѯָ����ʦ����
	�޸�ָ����ʦ����
	������ʦ��нˮ
	������ʦ����
	����
	���������ʦ����
	���������ʦ����
	��ӡ��ʦ������Ϣ����
	��ʽ����
	****************************************************
	*��ţ�0001                                        *
	**************************************************** 
	*�������Ŵ�ͬ                                      *
	****************************************************
	*�Ա���                                          *
	****************************************************
	���ļ����µõ�Ա������
	�˳�ϵͳ
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
