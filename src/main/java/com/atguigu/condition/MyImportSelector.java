package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//�Զ����߼�������Ҫ��������
public class MyImportSelector implements ImportSelector {
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//����ֵ�����ǵ����뵽�����е����ȫ����
		//AnnotationMetadata:��ǰ��ע@Importע����������ע����Ϣ
		// TODO Auto-generated method stub
		//importingClassMetadata
		//������Ҫ����nullֵ
		return new String[]{"com.atguigu.bean.Blue","com.atguigu.bean.Yellow"};
	}
}
