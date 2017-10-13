package com.shuwang.receipt.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ObjectDynamicCreator {

	/**
	 * 返回由对象的属性为key,值为map的value的Map集合
	 * 
	 * @param obj
	 *            源对象
	 * @return Map
	 */
	public static Map<String, Object> getFieldVlaue(Object obj) {
		Map<String, Object> mapValue = new HashMap<String, Object>();
		Class<?> cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			try {
				// String name = field.getName();
				// String strGet = "get" + name.substring(0, 1).toUpperCase()
				// + name.substring(1, name.length());
				// Method methodGet = cls.getDeclaredMethod(strGet);
				// Object object = methodGet.invoke(obj);
				// String value = object != null ? object.toString() : "";
				field.setAccessible(true);
				if (field.get(obj) != null && field.get(obj) != "") {
					mapValue.put(field.getName(), field.get(obj));
				}
			} catch (Exception ok) {
				// OK, continue
				continue;
			}
		}
		return mapValue;
	}

	/**
	 * 返回由Map的key对属性，value对应值组成的对应
	 * 
	 * @param map
	 *            Map集合
	 * @param cls
	 *            目标类
	 * @return obj Object
	 * @throws Exception
	 *             异常
	 */
	public static Object setFieldValue(Map<String, String> map, Class<?> cls)
			throws Exception {
		Field[] fields = cls.getDeclaredFields();
		Object obj = cls.newInstance();
		for (Field field : fields) {
			Class<?> clsType = field.getType();
			String name = field.getName();
			String strSet = "set" + name.substring(0, 1).toUpperCase()
					+ name.substring(1, name.length());
			Method methodSet = cls.getDeclaredMethod(strSet, clsType);
			if (map.containsKey(name)) {
				Object objValue = typeConversion(clsType, map.get(name));
				methodSet.invoke(obj, objValue);
			}
		}
		return obj;
	}

	/**
	 * 将Map里面的部分值通过反射设置到已有对象里去
	 * 
	 * @param obj
	 *            已有对象
	 * @param data
	 *            Map集合
	 * @return Object
	 * @throws Exception
	 *             异常
	 */
	public static Object setObjectFileValue(Object obj, Map<String, Object> data)
			throws Exception {
		Class<?> cls = obj.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			Class<?> clsType = field.getType();
			String name = field.getName();
			String strSet = "set" + name.substring(0, 1).toUpperCase()
					+ name.substring(1, name.length());
			Method methodSet = cls.getDeclaredMethod(strSet, clsType);
			if (data.containsKey(name)) {
				// Object objValue = typeConversion(clsType, data.get(name));
				Object objValue = data.get(name);
				methodSet.invoke(obj, objValue);
			}
		}
		return obj;
	}

	/**
	 * 把对象的值用Map对应装起来
	 * 
	 * @param map
	 *            Map集合
	 * @param obj
	 *            Object
	 * @return 与对象属性对应的Map
	 */
	public static Map<String, Object> compareMap(Map<String, Object> map,
			Object obj) {
		Map<String, Object> mapValue = new HashMap<String, Object>();
		Field[] fields = obj.getClass().getDeclaredFields();
		for (Field field : fields) {
			String name = field.getName();
			if (map.containsKey(name)) {
				mapValue.put(name, map.get(name));
			}
		}
		return mapValue;
	}

	/**
	 * 把临时对象的值复制到持久化对象上
	 * 
	 * @param oldObject
	 *            Object 持久化对象
	 * @param newObject
	 *            Object 临时对象
	 * @return 持久化对象
	 * @throws Exception
	 *             异常
	 */
	public static Object mergedObject(Object oldObject, Object newObject)
			throws Exception {
		Class<?> cls = newObject.getClass();
		Field[] fields = cls.getDeclaredFields();
		for (Field field : fields) {
			Class<?> clsType = field.getType();
			String name = field.getName();
			String method = name.substring(0, 1).toUpperCase()
					+ name.substring(1, name.length());
			String strGet = "get" + method;
			Method methodGet = cls.getDeclaredMethod(strGet);
			Object object = methodGet.invoke(newObject);
			if (object != null) {
				String strSet = "set" + method;
				Method methodSet = cls.getDeclaredMethod(strSet, clsType);
				Object objValue = typeConversion(clsType, object.toString());
				methodSet.invoke(oldObject, objValue);
			}
		}
		return oldObject;
	}

	public static Object typeConversion(Class<?> cls, String str) {
		Object obj = null;
		String nameType = cls.getSimpleName();
		if ("Integer".equals(nameType)) {
			obj = Integer.valueOf(str);
		}
		if ("String".equals(nameType)) {
			obj = str;
		}
		if ("Float".equals(nameType)) {
			obj = Float.valueOf(str);
		}
		if ("Double".equals(nameType)) {
			obj = Double.valueOf(str);
		}

		if ("Boolean".equals(nameType)) {
			obj = Boolean.valueOf(str);
		}
		if ("Long".equals(nameType)) {
			obj = Long.valueOf(str);
		}

		if ("Short".equals(nameType)) {
			obj = Short.valueOf(str);
		}

		if ("Character".equals(nameType)) {
			obj = str.charAt(1);
		}

		return obj;
	}
}
