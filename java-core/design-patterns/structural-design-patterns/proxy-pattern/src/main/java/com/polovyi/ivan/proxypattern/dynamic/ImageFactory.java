package com.polovyi.ivan.proxypattern.dynamic;

import com.polovyi.ivan.proxypattern.stetic.Image;

import java.lang.reflect.Proxy;

//Factory to get image objects. 
public class ImageFactory {
	//We'll provide proxy to caller instead of real object
	public static Image getImage(String filename) {
		//Using Java's Proxy API we create proxy instance
		return (Image) Proxy.newProxyInstance(Client.class.getClassLoader(),
				new Class[]{Image.class},
				//We provide our invocation handler to proxy
				new ImageInvocationHandler(filename));
	}
}