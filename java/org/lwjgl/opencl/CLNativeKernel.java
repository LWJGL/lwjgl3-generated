/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Instances of this interface may be passed to the {@link CL10#clEnqueueNativeKernel} method. */
public abstract class CLNativeKernel extends Closure.Void {

	private static final FFICIF        CIF  = staticAllocCIF();
	private static final PointerBuffer ARGS = staticAllocPointer(1);

	private static final long CLASSPATH = staticAllocText("org.lwjgl.opencl.CLNativeKernel");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_void,
			ARGS, ffi_type_pointer
		);
	}

	protected CLNativeKernel() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			memGetAddress(memGetAddress(POINTER_SIZE * 0 + args))
		);
	}

	/**
	 * Will be called by the OpenCL using CL10##clEnqueueNativeKernel().
	 *
	 * @param args a pointer to the arguments list
	 */
	public abstract void invoke(long args);

	/** A functional interface for {@link CLNativeKernel}. */
	public interface SAM {
		void invoke(long args);
	}

	/**
	 * Creates a {@link CLNativeKernel} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link CLNativeKernel} instance
	 */
	public static CLNativeKernel create(final SAM sam) {
		return new CLNativeKernel() {
			@Override
			public void invoke(long args) {
				sam.invoke(args);
			}
		};
	}

}