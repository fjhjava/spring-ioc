package com.java1234.spring;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

@SuppressWarnings("unchecked")
public class ClassPathApplicationContext implements BeanFactory {
	private static Map<String, Object> applicationContext = new HashMap<String, Object>();

	static{
		SAXBuilder builder = new SAXBuilder();
		InputStream input;
		try {
			input = new FileInputStream("E:\\howtomcatworks\\Spring-demo\\src\\beans.xml");
			Document doc = builder.build(input);
			Element beans = doc.getRootElement();
			List<Element> beanList = beans.getChildren();
			for (Element bean : beanList) {
				String id = bean.getAttributeValue("id");
				String clazz = bean.getAttributeValue("class");
				Object object = Class.forName(clazz).newInstance();
				applicationContext.put(id, object);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public Object getBean(String name) {
		
		return applicationContext.get(name);
	}

}
