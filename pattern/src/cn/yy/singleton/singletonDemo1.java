package cn.yy.singleton;

/**
 * 饿汉式
阿萨德
 * @author enter
 *
 */
public class singletonDemo1 {
	private singletonDemo1 s=new singletonDemo1();
	
	private singletonDemo1() {
		
	}
	
	public singletonDemo1 getSingletonDemo1() {
		return s;
	}

}
