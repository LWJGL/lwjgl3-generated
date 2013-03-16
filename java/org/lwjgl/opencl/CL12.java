/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core OpenCL 1.2 functionality. */
public final class CL12 {

	private CL12() {}

	// --- [ clGetExtensionFunctionAddressForPlatform ] ---

	/** JNI method for {@link #clGetExtensionFunctionAddressForPlatform(CLPlatform, ByteBuffer)} */
	public static native long nclGetExtensionFunctionAddressForPlatform(long platform, long func_name, long __functionAddress);

	/**
	 * 
	 *
	 * @param platform  
	 * @param func_name 
	 */
	public static long clGetExtensionFunctionAddressForPlatform(CLPlatform platform, ByteBuffer func_name) {
		long __functionAddress = getInstance(platform).clGetExtensionFunctionAddressForPlatform;
		if ( LWJGLUtil.CHECKS ) {
			checkFunctionAddress(__functionAddress);
			checkNT1(func_name);
		}
		return nclGetExtensionFunctionAddressForPlatform(platform.getPointer(), memAddress(func_name), __functionAddress);
	}

	/** CharSequence version of: {@link #clGetExtensionFunctionAddressForPlatform(CLPlatform, ByteBuffer)} */
	public static long clGetExtensionFunctionAddressForPlatform(CLPlatform platform, CharSequence func_name) {
		long __functionAddress = getInstance(platform).clGetExtensionFunctionAddressForPlatform;
		if ( LWJGLUtil.CHECKS )
			checkFunctionAddress(__functionAddress);
		return nclGetExtensionFunctionAddressForPlatform(platform.getPointer(), memAddress(memEncodeASCII(func_name)), __functionAddress);
	}

	// --- [ Function Addresses ] ---

	/** Returns the {@link Functions} instance for the current context. */
	public static Functions getInstance(CLObject object) {
		return object.getCapabilities().__CL12;
	}

	static Functions create(java.util.Set<String> ext, FunctionProviderLocal provider) {
		if ( !ext.contains("OpenCL12") ) return null;

		Functions funcs = new Functions(provider);

		boolean supported =  funcs.clGetExtensionFunctionAddressForPlatform != 0L;

		return CL.checkExtension("OpenCL12", funcs, supported);
	}

	/** The {@link FunctionMap} class for {@code CL12}. */
	public static final class Functions implements FunctionMap {

		public final long clGetExtensionFunctionAddressForPlatform;

		public Functions(FunctionProviderLocal provider) {
			clGetExtensionFunctionAddressForPlatform = provider.getFunctionAddress("clGetExtensionFunctionAddressForPlatform");
		}

	}

}