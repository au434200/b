package cn.yy.singleton;

/**
<<<<<<< HEAD
 * 饿汉式1343
=======
 * 饿汉式12
>>>>>>> branch 'master' of https://github.com/au434200/b.git
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
