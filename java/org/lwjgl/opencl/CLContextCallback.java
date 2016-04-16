/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

import java.nio.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this interface may be passed to the {@link CL10#clCreateContext CreateContext} and {@link CL10#clCreateContextFromType CreateContextFromType} methods. */
public abstract class CLContextCallback extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.opencl.CLContextCallback");

	protected CLContextCallback() {
		super(CALL_CONVENTION_SYSTEM + "(pppp)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called when a debug message is generated.
	 *
	 * @param errinfo      a pointer to the message string representation
	 * @param private_info a pointer to binary data that is returned by the OpenCL implementation that can be used to log additional information helpful in debugging the error
	 * @param cb           the number of bytes in the {@code private_info} pointer
	 * @param user_data    the user-specified value that was passed when calling {@link CL10#clCreateContext CreateContext} or {@link CL10#clCreateContextFromType CreateContextFromType}
	 */
	public abstract void invoke(long errinfo, long private_info, long cb, long user_data);

	/** A functional interface for {@link CLContextCallback}. */
	public interface SAM {
		void invoke(long errinfo, long private_info, long cb, long user_data);
	}

	/**
	 * Creates a {@link CLContextCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLContextCallback} instance
	 */
	public static CLContextCallback create(SAM sam) {
		return new CLContextCallback() {
			@Override
			public void invoke(long errinfo, long private_info, long cb, long user_data) {
				sam.invoke(errinfo, private_info, cb, user_data);
			}
		};
	}

	/** A functional interface for {@link CLContextCallback}. */
	public interface SAMString {
		void invoke(String errinfo, ByteBuffer private_info, long user_data);
	}

	/**
	 * Creates a {@link CLContextCallback} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLContextCallback} instance
	 */
	public static CLContextCallback createString(SAMString sam) {
		return new CLContextCallback() {
			@Override
			public void invoke(long errinfo, long private_info, long cb, long user_data) {
				sam.invoke(memUTF8(errinfo), memByteBuffer(private_info, (int)cb), user_data);
			}
		};
	}

}