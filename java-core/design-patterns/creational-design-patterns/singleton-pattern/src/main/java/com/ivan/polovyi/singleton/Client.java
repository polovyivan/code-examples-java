package com.ivan.polovyi.singleton;

import com.ivan.polovyi.singleton.eager.EagerRegistry;
import com.ivan.polovyi.singleton.enumtype.RegistryEnum;
import com.ivan.polovyi.singleton.lazy.LazyRegistryIODH;
import com.ivan.polovyi.singleton.lazy.LazyRegistryWithDCL;

public class Client {

	public static void main(String[] args) {
		EagerRegistry eagerRegistry = EagerRegistry.getInstance();
		System.out.println("eagerRegistry = " + eagerRegistry);
		EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
		System.out.println("eagerRegistry1 = " + eagerRegistry1);

		LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
		System.out.println("lazyRegistryWithDCL = " + lazyRegistryWithDCL);
		LazyRegistryWithDCL lazyRegistryWithDCL1 = LazyRegistryWithDCL.getInstance();
		System.out.println("lazyRegistryWithDCL1 = " + lazyRegistryWithDCL1);


		LazyRegistryIODH lazyRegistryIODH = LazyRegistryIODH.getInstance();
		System.out.println("lazyRegistryIODH = " + lazyRegistryIODH);
		LazyRegistryIODH lazyRegistryIODH1 = LazyRegistryIODH.getInstance();
		System.out.println("lazyRegistryIODH1 = " + lazyRegistryIODH1);


		RegistryEnum enumSingleton1 = RegistryEnum.INSTANCE.getInstance();

		System.out.println(enumSingleton1.getInfo()); //Initial enum info

		RegistryEnum enumSingleton2 = RegistryEnum.INSTANCE.getInstance();
		enumSingleton2.setInfo("New enum info");

		System.out.println(enumSingleton1.getInfo()); // New enum info
		System.out.println(enumSingleton2.getInfo()); // New enum info
	}

}
