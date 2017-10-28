package data.structure.string;

import java.io.Serializable;

/**
 * @Description: 自己的串,模拟String
 * @author gzy
 * @date 2017年10月26日 下午8:58:27
 * @Version V1.0
 */
public class MyString implements Comparable<MyString>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6462627811072250516L;

	private final char[] value;// 只能赋值一次

	/**
	 * 创建空字符传""
	 */
	public MyString() {
		this.value = new char[0];
	}

	/**
	 * 创建一个字符串从i开始第n个的子字符串
	 * 
	 * @param str
	 * @param i
	 * @param n
	 */
	public MyString(java.lang.String str, int i, int n) {
		if (i > 0 && n > i && i + n < str.length()) {
			this.value = new char[n];
			for (int j = i; j < n; j++) {
				this.value[j] = str.charAt(j);
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	public MyString(java.lang.String str) {
		this(str, 0, str.length());
	}

	/**
	 * 创建一个字符串从i开始第n个的子字符串
	 * 
	 * @param value
	 * @param i
	 * @param n
	 */
	public MyString(char[] value, int offset, int count) {
		if (offset > 0 && count > offset && offset + count < value.length) {
			this.value = new char[count];
			for (int j = 0; j < count; j++) {
				this.value[j] = value[count + j];
			}
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	public MyString(char[] value) {
		this(value, 0, value.length);
	}

	/**
	 * 据说为了拷贝构造方法，深度拷贝，复制字符
	 * 
	 * @param str
	 */
	public MyString(MyString str) {
		this(str.value);
	}

	public int length() {
		return this.value.length;
	}

	public java.lang.String toString() {
		return new String(this.value);
	}

	/**
	 * 返回第i个字符(从0开始算)
	 * 
	 * @param index
	 * @return
	 */
	public char charAt(int index) {
		if (index > 0 && index < this.value.length) {
			return this.value[index];
		} else {
			throw new StringIndexOutOfBoundsException();
		}
	}

	public MyString subString(int begin, int end) {
		if (begin == 0 && end == this.value.length) {
			return this;
		} else {
			return new MyString(this.value, begin, end - begin);//这里越界会抛出异常
		}
	}
	
	public MyString subString(int begin){
		return subString(begin,this.value.length);
	}
	
	
	
	
	@Override
	public int compareTo(MyString o) {
		return 0;
	}

}
