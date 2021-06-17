package com.polovyi.ivan.proxypattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.polovyi.ivan.proxypattern.stetic.BitmapImage;
import com.polovyi.ivan.proxypattern.stetic.Image;
import javafx.geometry.Point2D;

//Implement invocation handler. Your "proxy" code goes here.
public class ImageInvocationHandler implements InvocationHandler {
	
	private String filename;
	private Point2D location;
	private BitmapImage image;
	private static final Method SET_LOCATION_METHOD;
	private static final Method GET_LOCATION_METHOD;
	private static final Method RENDER_METHOD;
	//Cache Methods for later comparison 
	static {
		try {
			SET_LOCATION_METHOD = Image.class.getMethod("setLocation", new Class[]{Point2D.class});
			GET_LOCATION_METHOD = Image.class.getMethod("getLocation", null);
			RENDER_METHOD = Image.class.getMethod("render", null);
		} catch (NoSuchMethodException e) {
			throw new NoSuchMethodError(e.getMessage());
		}
	}

	public ImageInvocationHandler(String filename) {
		this.filename = filename;	
	}
	//This method is called for each method invocation on the proxy

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//You can implement proxy logic here 
		System.out.println("Invoking methood: "+method.getName());
		if(method.equals(SET_LOCATION_METHOD)) {
			return handleSetLocation(args);
		} else if(method.equals(GET_LOCATION_METHOD)) {
			return handleGetLocation();
		} else if(method.equals(RENDER_METHOD)) {
			return handleRender();
		}
		return null;
	}
	//We create real object only when we really need it
	private Object handleRender() {
		if(image == null) {
			image = new BitmapImage(filename);
		}
		image.render();
		return null;
	}

	private Point2D handleGetLocation() {
		if(image != null) {
			return image.getLocation();
		} else {
			return this.location;
		}
	}

	private Object handleSetLocation(Object[] args) {
		if(image != null) {
			image.setLocation((Point2D)args[0]);
		} else {
			this.location = (Point2D)args[0];
		}
		return null;
	}
}
